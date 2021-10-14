package com.itAcademy;

import java.util.HashMap;
import java.util.Map;

public class Mapper {
    public Mapper(String name, String value) {

    }

    private Map<String, String> mapper = new HashMap<>();

    public Mapper(Map<String, String> mapper) {
        this.key = mapper;
    }

    public Mapper(String name, String value) {
        this.name = name;
        this.value = value;
    }
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}


