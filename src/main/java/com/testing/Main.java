package com.testing;


public class Main {
    public static void main(String[] args) {
        DirectoryLister dl = new DirectoryLister();

        System.out.println("Ejercicio 1:");
        dl.listDirectory("ruta/a/tu/directorio");

        System.out.println("Ejercicio 2:");
        dl.listDirectoryTree("ruta/a/tu/directorio");

        System.out.println("Ejercicio 3:");
        dl.saveDirectoryTree("ruta/a/tu/directorio", "output.txt");
    }
}


