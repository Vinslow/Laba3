package ru.rsreu.java3.parser.task2.sort;

import java.util.Comparator;
import java.util.Map;

public class NumberSymbolCompare implements Comparator<String> {

    private Map<String, Integer> symbolMap;

    public NumberSymbolCompare(Map<String, Integer> symbolMap) {
        this.symbolMap = symbolMap;
    }

    @Override
    public int compare(String key1, String key2) {
        return symbolMap.get(key2)-symbolMap.get(key1);
    }
}
