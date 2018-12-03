package ru.rsreu.java3.parser.task2.sort;

import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.search.ParseFile;
import ru.rsreu.java3.parser.task2.frequency.FrequentVowel;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortSymbol {

    FrequentVowel searchSentence;
    TreeMap<String, Integer> devicePowerSort;

    public SortSymbol(FrequentVowel searchSentence) {
        this.searchSentence = searchSentence;
    }

    public void sort() {
        Comparator wordNumber = new NumberSymbolCompare(searchSentence.getSymbolMap());
        devicePowerSort = new TreeMap<String, Integer>(wordNumber);
        devicePowerSort.putAll(searchSentence.getSymbolMap());
    }

    public TreeMap<String, Integer> getDevicePowerSort() {
        return devicePowerSort;
    }
}
