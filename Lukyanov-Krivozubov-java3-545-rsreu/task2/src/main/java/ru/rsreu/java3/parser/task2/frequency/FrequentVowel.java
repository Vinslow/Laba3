package ru.rsreu.java3.parser.task2.frequency;

import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.linguistics.Symbol;
import ru.rsreu.java3.parser.linguistics.Word;
import ru.rsreu.java3.parser.search.ParseFile;

import java.util.HashMap;
import java.util.Map;

public class FrequentVowel {

    private ParseFile parseFile;
    private Map<String, Integer> symbolMap;

    public FrequentVowel(ParseFile parseFile) {
        this.parseFile = parseFile;
        symbolMap = new HashMap<>();
    }

    public Map<String, Integer> getSymbolMap() {
        return symbolMap;
    }

    public void search() {
        for (Sentence sentence : parseFile.get()) {
            for (Word word : sentence.getWordArrayList()) {
                for (Symbol symbol : word.getSymbolArrayList()) {
                    if (symbolMap.get(symbol.getValue().toLowerCase()) == null) {
                        symbolMap.put(symbol.getValue().toLowerCase(), 0);
                    } else {
                        symbolMap.put(symbol.getValue().toLowerCase(), symbolMap.get(symbol.getValue().toLowerCase()) + 1);
                    }
                }
            }
        }
    }
}
