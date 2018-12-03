package ru.rsreu.java3.parser.task2.controler;

import ru.rsreu.java3.parser.controler.Controller;
import ru.rsreu.java3.parser.presentation.Presentation;
import ru.rsreu.java3.parser.search.ParseFile;
import ru.rsreu.java3.parser.task2.frequency.FrequentVowel;
import ru.rsreu.java3.parser.task2.search.SearchWord;

public class StandartControler implements Controller {

    private Presentation presentation;
    private FrequentVowel frequentVowel;
    private ParseFile parseFile;
    private SearchWord searchWord;

    public StandartControler(Presentation presentation, FrequentVowel frequentVowel, ParseFile parseFile, SearchWord searchWord) {
        this.presentation = presentation;
        this.frequentVowel = frequentVowel;
        this.parseFile = parseFile;
        this.searchWord = searchWord;
    }

    @Override
    public void run() {
        parseFile.parse();
        frequentVowel.search();
        searchWord.run();
        presentation.show();
    }
}
