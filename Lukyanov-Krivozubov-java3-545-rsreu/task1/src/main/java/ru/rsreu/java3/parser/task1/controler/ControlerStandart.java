package ru.rsreu.java3.parser.task1.controler;

import ru.rsreu.java3.parser.task1.sort.SentenceSort;
import ru.rsreu.java3.parser.controler.Controller;
import ru.rsreu.java3.parser.presentation.Presentation;
import ru.rsreu.java3.parser.search.Parse;
import ru.rsreu.java3.parser.search.ParseFile;

public class ControlerStandart implements Controller {

    private Presentation presentation;
    private ParseFile searchSentence;
    private SentenceSort sentenceSort;

    public ControlerStandart(Parse searchSentence, SentenceSort sentenceSort, Presentation presentation) {
        this.presentation = presentation;
        this.searchSentence = (ParseFile) searchSentence;
        this.sentenceSort = sentenceSort;
    }

    @Override
    public void run() {
        searchSentence.parse();
        sentenceSort.sort();
        presentation.show();
    }
}
