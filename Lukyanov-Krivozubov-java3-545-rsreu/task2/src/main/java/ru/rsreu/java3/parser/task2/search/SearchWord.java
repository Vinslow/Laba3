package ru.rsreu.java3.parser.task2.search;

import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.linguistics.Symbol;
import ru.rsreu.java3.parser.linguistics.Word;
import ru.rsreu.java3.parser.search.ParseFile;
import ru.rsreu.java3.parser.task2.sort.SortSymbol;

import java.util.*;

public class SearchWord {

    private SortSymbol sortSymbol;
    private ParseFile parseFile;
    private Set<String> foundWords;

    public SearchWord(SortSymbol sortSymbol, ParseFile parseFile) {
        this.sortSymbol = sortSymbol;
        this.parseFile = parseFile;
        this.foundWords = new HashSet <String>();
    }

    public Set<String> getFoundWords() {
        return foundWords;
    }

    public void run() {
        sortSymbol.sort();
        String symbolSearch = sortSymbol.getDevicePowerSort().firstKey();
        for (Sentence sentence: parseFile.get()) {
            for (Word word: sentence.getWordArrayList()) {
                for (Symbol symbol: word.getSymbolArrayList()) {
                    if (symbol.getValue().toLowerCase().equals(symbolSearch)) {
                        foundWords.add(word.getValue());
                        break;
                    }
                }
            }
        }
    }

}
