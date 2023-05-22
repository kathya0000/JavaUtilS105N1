package com.testing;

import java.io.*;
import java.util.Arrays;

public class DirectoryLister {

    public void listDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            Arrays.sort(files);

            for (String file : files) {
                System.out.println(file);
            }
        } else if (!directory.exists()) {
            System.out.println("El directorio no existe.");
        } else {
            System.out.println("El path ingresado no corresponde a un directorio.");
        }
    }


    public void listDirectoryTree(String directoryPath) {
        listDirectoryTree(new File(directoryPath), 0);
    }

    private void listDirectoryTree(File directory, int indentation) {
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            Arrays.sort(files);

            for (File file : files) {
                for (int i = 0; i < indentation; i++) {
                    System.out.print(" ");
                }

                System.out.println((file.isDirectory() ? "D" : "F") + " " + file.getName());

                if (file.isDirectory()) {
                    listDirectoryTree(file, indentation + 2);
                }
            }
        } else if (!directory.exists()) {
            System.out.println("El directorio no existe.");
        } else {
            System.out.println("El path ingresado no corresponde a un directorio.");
        }
    }

    public void saveDirectoryTree(String directoryPath, String outputPath) {
        StringBuilder output = new StringBuilder();
        saveDirectoryTree(new File(directoryPath), 0, output);

        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(output.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveDirectoryTree(File directory, int indentation, StringBuilder output) {
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            Arrays.sort(files);

            for (File file : files) {
                for (int i = 0; i < indentation; i++) {
                    output.append(" ");
                }

                output.append((file.isDirectory() ? "D" : "F") + " " + file.getName() + "\n");

                if (file.isDirectory()) {
                    saveDirectoryTree(file, indentation + 2, output);
                }
            }
        } else if (!directory.exists()) {
            output.append("El directorio no existe.\n");
        } else {
            output.append("El path ingresado no corresponde a un directorio.\n");
        }
    }
    public void readTextFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}