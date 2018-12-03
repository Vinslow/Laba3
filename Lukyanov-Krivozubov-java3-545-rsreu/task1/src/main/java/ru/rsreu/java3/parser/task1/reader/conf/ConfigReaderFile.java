package ru.rsreu.java3.parser.task1.reader.conf;

import ru.rsreu.java3.parser.config.IConfiguration;

public class ConfigReaderFile implements IConfiguration {

    private String pathFile;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String path) {
        this.pathFile = path;
    }
}
