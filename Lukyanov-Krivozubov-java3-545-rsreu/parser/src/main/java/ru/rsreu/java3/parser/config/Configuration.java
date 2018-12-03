package ru.rsreu.java3.parser.config;

public class Configuration implements IConfiguration {

    private String regWord;
    private String regSentence;
    private String regSymbol;

    public String getRegSymbol() {
        return regSymbol;
    }

    public void setRegSymbol(String regSymbol) {
        this.regSymbol = regSymbol;
    }

    public String getRegWord() {
        return regWord;
    }

    public void setRegWord(String regWord) {
        this.regWord = regWord;
    }

    public String getRegSentence() {
        return regSentence;
    }

    public void setRegSentence(String regSentence) {
        this.regSentence = regSentence;
    }
}
