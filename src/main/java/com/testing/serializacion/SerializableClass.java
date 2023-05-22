package com.testing.serializacion;

import java.io.Serializable;

public class SerializableClass implements Serializable {
    private String data;

    public SerializableClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

