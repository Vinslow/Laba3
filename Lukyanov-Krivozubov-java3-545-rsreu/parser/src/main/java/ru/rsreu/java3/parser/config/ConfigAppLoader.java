package ru.rsreu.java3.parser.config;

import ru.rsreu.java3.parser.config.ConfigPropertyLoader;
import ru.rsreu.java3.parser.config.Configuration;
import ru.rsreu.java3.parser.config.IConfiguration;

import java.util.Properties;

public class ConfigAppLoader extends ConfigPropertyLoader {
    public ConfigAppLoader(String file) {
        super(file);
    }

    @Override
    protected IConfiguration toConfiguration(Properties properties) {
        Configuration configuration = new Configuration();
        configuration.setRegSentence(properties.getProperty("regular.sentence"));
        configuration.setRegWord(properties.getProperty("regular.word"));
        configuration.setRegSymbol(properties.getProperty("regular.symbol"));
        return configuration;
    }
}
