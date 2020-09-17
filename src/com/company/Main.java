package com.company;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args throws IOException {
        String harry = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java01\\Desktop\\Harry.txt")));
        System.out.println(harry.length());

        System.out.println(harry.substring(0,200));

        harry = harry.replaceAll("[^a-z ]","");

        System.out.println(harry.substring(0,200));
    }
}
