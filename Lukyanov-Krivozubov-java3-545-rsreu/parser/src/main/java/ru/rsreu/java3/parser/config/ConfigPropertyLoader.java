package ru.rsreu.java3.parser.config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class ConfigPropertyLoader implements ConfigLoader {

    private final String file;

    public ConfigPropertyLoader(String file) {
        this.file = file;
    }

    public IConfiguration getConfiguration() {
        Properties properties = loadProperties(file);
        IConfiguration configuration = toConfiguration(properties);
        return configuration;
    }

    private Properties loadProperties(String file) {
        try {
            Properties properties = new Properties();
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
            properties.load(in);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Could not load properties", e);
        }
    }

    protected abstract IConfiguration toConfiguration(Properties properties);
}

