package ru.rsreu.java3.parser.linguistics;

public class Symbol implements Linguistics {

    private String value;

    public Symbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
