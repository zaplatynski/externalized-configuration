package com.example.externalizedconfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ExternalConfig {

    @Value("${config.items}")
    private String configItems;

    public Map<String, Object> loadConfigItems() {
        Map<String, Object> configMap = new HashMap<>();
        String[] items = configItems.split(",");

        for (String item : items) {
            String[] keyValue = item.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            configMap.put(key, parseValue(value));
        }

        return configMap;
    }

    private Object parseValue(String value) {
        if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(value);
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e2) {
                return value; // return as string if not a number
            }
        }
    }
}