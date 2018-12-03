package ru.rsreu.java3.parser.search;

import ru.rsreu.java3.parser.config.ConfigAppLoader;
import ru.rsreu.java3.parser.config.ConfigLoader;
import ru.rsreu.java3.parser.config.Configuration;
import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.linguistics.Symbol;
import ru.rsreu.java3.parser.linguistics.Word;
import ru.rsreu.java3.parser.reader.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseFile implements Parse {

    private Reader text;
    private List<Sentence> sentenceList;
    private Configuration configuration;

    public ParseFile(Reader text) {
        this.text = text;
        sentenceList = new ArrayList<>();
    }


    public void parse() {
        init();
        parseSentence();
        parseWord();
        parseSymbol();
    }

    public void init() {
        ConfigLoader configAppLoader = new ConfigAppLoader("patern2.properties");
        this.configuration = (Configuration) configAppLoader.getConfiguration();
    }

    private void parseSentence() {
        Pattern p = Pattern.compile(configuration.getRegSentence());
        Matcher m = p.matcher(text.getText());
        while(m.find()) {
            String temp = m.group().toString();
            sentenceList.add(new Sentence(temp));
        }
    }

    private void parseWord() {
        Pattern p = Pattern.compile(configuration.getRegWord());
        for (Sentence elem: sentenceList) {
            List<Word> wordsList = new ArrayList<>();
            Matcher m = p.matcher(elem.toString());
            while(m.find()) {
                String temp = m.group().toString();
                wordsList.add(new Word(temp));
            }
            elem.setWordArrayList((ArrayList<Word>) wordsList);
        }
    }

    private void parseSymbol() {
        Pattern p = Pattern.compile(configuration.getRegSymbol());
        for (Sentence elem: sentenceList) {
            for (Word word: elem.getWordArrayList()) {
                List<Symbol> symbolList = new ArrayList<>();
                Matcher m = p.matcher(word.getValue());
                while(m.find()) {
                    String temp = m.group().toString();
                    symbolList.add(new Symbol(temp));
                }
                word.setSymbolArrayList((ArrayList<Symbol>) symbolList);
            }
        }
    }

    public List<Sentence> get() {
        return sentenceList;
    }
}
