package ru.rsreu.java3.parser.task1.sort;

import ru.rsreu.java3.parser.linguistics.Sentence;

import java.util.Comparator;
import java.util.List;

public class WordComparable implements Comparator<Sentence> {
    private List<Sentence> lis;

    public WordComparable(List<Sentence> map) {
        this.lis = map;
    }

    public int compare(Sentence sen1, Sentence sen2) {
        return sen2.getWordArrayList().size() - sen1.getWordArrayList().size();
    }
}
