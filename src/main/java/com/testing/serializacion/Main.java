package com.testing.serializacion;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        SerializableClass sc = new SerializableClass("Algo de datos");
        serializer.serializeObject(sc, "serializedObject.ser");
        SerializableClass deserializedObject = serializer.deserializeObject("serializedObject.ser");
        System.out.println(deserializedObject.getData());
    }
}

