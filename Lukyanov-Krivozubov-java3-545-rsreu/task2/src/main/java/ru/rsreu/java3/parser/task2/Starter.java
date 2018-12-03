package ru.rsreu.java3.parser.task2;

import ru.rsreu.java3.parser.config.ConfigLoader;
import ru.rsreu.java3.parser.presentation.Presentation;
import ru.rsreu.java3.parser.search.Parse;
import ru.rsreu.java3.parser.search.ParseFile;
import ru.rsreu.java3.parser.task2.controler.StandartControler;
import ru.rsreu.java3.parser.task2.frequency.FrequentVowel;
import ru.rsreu.java3.parser.task2.presentation.PrintPresentation;
import ru.rsreu.java3.parser.task2.reader.ReaderFile;
import ru.rsreu.java3.parser.task2.reader.conf.ConfigReaderFileLoader;
import ru.rsreu.java3.parser.task2.search.SearchWord;
import ru.rsreu.java3.parser.task2.sort.SortSymbol;

public class Starter {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.run();
    }

    public void run() {
        ConfigLoader cpl = new ConfigReaderFileLoader("patern3.properties");
        ReaderFile readerFile = new ReaderFile(cpl);
        Parse searchSentence = new ParseFile(readerFile);
        FrequentVowel frequentVowel = new FrequentVowel((ParseFile) searchSentence);
        SortSymbol sortSymbol = new SortSymbol(frequentVowel);
        SearchWord searchWord = new SearchWord(sortSymbol, (ParseFile) searchSentence);
        Presentation presentation = new PrintPresentation(searchWord, sortSymbol);
        StandartControler standartControler = new StandartControler(presentation, frequentVowel, (ParseFile) searchSentence, searchWord);
        standartControler.run();
    }
}
