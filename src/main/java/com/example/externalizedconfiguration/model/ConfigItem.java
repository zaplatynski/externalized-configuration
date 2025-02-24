package com.example.externalizedconfiguration.model;

public class ConfigItem {
    private String key;
    private Object value; // Can be String, Number, or Boolean
    private String stageReference;

    public ConfigItem(String key, Object value, String stageReference) {
        this.key = key;
        this.value = value;
        this.stageReference = stageReference;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getStageReference() {
        return stageReference;
    }

    public void setStageReference(String stageReference) {
        this.stageReference = stageReference;
    }
}