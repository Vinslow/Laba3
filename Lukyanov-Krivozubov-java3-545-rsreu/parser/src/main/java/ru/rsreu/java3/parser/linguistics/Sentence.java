package ru.rsreu.java3.parser.linguistics;

import java.util.ArrayList;

public class Sentence implements Linguistics {

    private String value;
    private ArrayList<Word> wordArrayList;

    public Sentence(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public void setWordArrayList(ArrayList<Word> wordArrayList) {
        this.wordArrayList = wordArrayList;
    }

    public ArrayList<Word> getWordArrayList() {
        return wordArrayList;
    }
}
