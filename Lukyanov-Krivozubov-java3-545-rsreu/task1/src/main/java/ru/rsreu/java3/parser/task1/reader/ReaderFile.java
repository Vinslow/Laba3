package ru.rsreu.java3.parser.task1.reader;

import ru.rsreu.java3.parser.task1.reader.conf.ConfigReaderFile;
import ru.rsreu.java3.parser.config.ConfigLoader;
import ru.rsreu.java3.parser.reader.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderFile implements Reader {

    private String path;
    private String text;
    private ConfigLoader configLoader;

    public ReaderFile(ConfigLoader configLoader) {
        this.configLoader = configLoader;
    }

    public void run() {
        this.init();
        this.read();
    }

    public void init() {
        ConfigReaderFile configuration = (ConfigReaderFile) configLoader.getConfiguration();
        this.path = configuration.getPathFile();
    }

    public void read() {
        try (FileReader reader = new FileReader(this.path)) {
            char[] buf = new char[256];
            text = "";
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                text += String.copyValueOf(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getText() {
        run();
        return text;
    }
}
