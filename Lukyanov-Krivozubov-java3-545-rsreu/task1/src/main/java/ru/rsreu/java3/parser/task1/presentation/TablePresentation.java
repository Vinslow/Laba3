package ru.rsreu.java3.parser.task1.presentation;

import ru.rsreu.java3.parser.task1.sort.SentenceSort;
import ru.rsreu.java3.parser.linguistics.Sentence;
import ru.rsreu.java3.parser.linguistics.Word;
import ru.rsreu.java3.parser.presentation.Presentation;


public class TablePresentation implements Presentation {

    private SentenceSort devicePowerSort;
    private int leng = 100;

    public TablePresentation(SentenceSort devicePowerSort) {
        this.devicePowerSort = devicePowerSort;
    }

    @Override
    public void show() {
        System.out.print("|======");
        System.out.print(String.format("%" + String.valueOf((leng > 8) ? leng : 8) + "s", "").replace(' ', '='));
        System.out.println("===============|");

        System.out.print("|  №  |");
        System.out.print(String.format("%" + String.valueOf((leng > 8) ? leng : 8) + "s", "Sentence"));
        System.out.println("| Word's Count |");

        System.out.print("|=====+");
        System.out.print(String.format("%" + String.valueOf((leng > 8) ? leng : 8) + "s", "").replace(' ', '='));
        System.out.println("+==============|");

        int i = 0;
        for (Sentence sentence : devicePowerSort.getDevicePowerSort()) {
            System.out.print("|");
            System.out.print(String.format("%5d", i++));
            System.out.print("|");
            int prin = 0;
            String temp = "";
            for (Word word : sentence.getWordArrayList()) {
                prin += word.toString().length() + 1;
                if (prin < leng) {
                    temp += word.toString() + " ";
                } else {
                    break;
                }
            }
            System.out.print(String.format("%" + String.valueOf((leng > 8) ? leng : 8) + "s", temp));
            System.out.print("|");
            System.out.print(String.format("%14d", sentence.getWordArrayList().size()));
            System.out.println("|");

            System.out.print("|=====+");
            System.out.print(String.format("%" + String.valueOf((leng > 8) ? leng : 8) + "s", "").replace(' ', '='));
            System.out.println("+==============|");
        }
    }
}
