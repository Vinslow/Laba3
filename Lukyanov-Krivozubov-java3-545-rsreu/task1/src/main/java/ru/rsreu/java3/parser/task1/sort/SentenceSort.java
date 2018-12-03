package ru.rsreu.java3.parser.task1.sort;

import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.search.ParseFile;

import java.util.Comparator;
import java.util.TreeSet;

public class SentenceSort {

    ParseFile searchSentence;
    TreeSet<Sentence> devicePowerSort;

    public TreeSet<Sentence> getDevicePowerSort() {
        return devicePowerSort;
    }

    public SentenceSort(ParseFile searchSentence) {
        this.searchSentence = searchSentence;
    }

    public void sort() {
        Comparator wordNumber = new WordComparable(searchSentence.get());
        devicePowerSort = new TreeSet<>(wordNumber);
        devicePowerSort.addAll(searchSentence.get());
    }

}
