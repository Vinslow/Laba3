package ru.rsreu.java3.parser.task1;

import ru.rsreu.java3.parser.task1.controler.ControlerStandart;
import ru.rsreu.java3.parser.task1.presentation.TablePresentation;
import ru.rsreu.java3.parser.task1.reader.ReaderFile;
import ru.rsreu.java3.parser.task1.reader.conf.ConfigReaderFileLoader;
import ru.rsreu.java3.parser.task1.sort.SentenceSort;
import ru.rsreu.java3.parser.config.ConfigLoader;
import ru.rsreu.java3.parser.controler.Controller;
import ru.rsreu.java3.parser.presentation.Presentation;
import ru.rsreu.java3.parser.search.Parse;
import ru.rsreu.java3.parser.search.ParseFile;

public class Starter {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.run();
    }

    public void run() {
        ConfigLoader cpl = new ConfigReaderFileLoader("patern.properties");
        ReaderFile readerFile = new ReaderFile(cpl);
        Parse searchSentence = new ParseFile(readerFile);
        SentenceSort sentenceSort = new SentenceSort((ParseFile) searchSentence);
        Presentation presentation = new TablePresentation(sentenceSort);
        Controller controller = new ControlerStandart(searchSentence, sentenceSort, presentation);
        controller.run();
    }
}
