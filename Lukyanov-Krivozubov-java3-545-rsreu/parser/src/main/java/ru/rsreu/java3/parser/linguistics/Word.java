package ru.rsreu.java3.parser.linguistics;

import java.util.ArrayList;

public class Word implements Linguistics{

    private String value;
    private ArrayList<Symbol> symbolArrayList;

    public ArrayList<Symbol> getSymbolArrayList() {
        return symbolArrayList;
    }

    public String getValue() {
        return value;
    }

    public void setSymbolArrayList(ArrayList<Symbol> symbolArrayList) {
        this.symbolArrayList = symbolArrayList;
    }

    public Word(String string) {
        this.value = string;
    }

    @Override
    public String toString() {
        return value;
    }
}
