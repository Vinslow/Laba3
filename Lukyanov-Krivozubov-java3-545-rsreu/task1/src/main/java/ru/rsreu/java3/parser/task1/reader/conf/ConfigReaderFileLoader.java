package ru.rsreu.java3.parser.task1.reader.conf;

import ru.rsreu.java3.parser.config.ConfigPropertyLoader;
import ru.rsreu.java3.parser.config.IConfiguration;

import java.util.Properties;

public class ConfigReaderFileLoader extends ConfigPropertyLoader {

    public ConfigReaderFileLoader(String file) {
        super(file);
    }

    @Override
    protected IConfiguration toConfiguration(Properties properties) {
        ConfigReaderFile configuration = new ConfigReaderFile();
        configuration.setPathFile(properties.getProperty("parser.patch.file"));
        return configuration;
    }
}
