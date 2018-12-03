package ru.rsreu.java3.parser.task2.presentation;

import ru.rsreu.java3.parser.presentation.Presentation;
import ru.rsreu.java3.parser.task2.search.SearchWord;
import ru.rsreu.java3.parser.task2.sort.SortSymbol;

public class PrintPresentation implements Presentation {

    private SearchWord searchWord;
    private SortSymbol sortSymbol;

    public PrintPresentation(SearchWord searchWord, SortSymbol sortSymbol) {
        this.searchWord = searchWord;
        this.sortSymbol = sortSymbol;
    }

    @Override
    public void show() {
        for (String key: sortSymbol.getDevicePowerSort().keySet()) {
            System.out.println(key + ":" + sortSymbol.getDevicePowerSort().get(key));
        }
        System.out.println();
        for (String word: searchWord.getFoundWords()) {
            System.out.print(word + ", ");
        }
    }
}
