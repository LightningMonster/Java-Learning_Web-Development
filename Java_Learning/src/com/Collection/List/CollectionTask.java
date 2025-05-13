package com.Collection.List;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTask {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Elephant");
        words.add("Dog");
        words.add("Cat");
        words.add("Horse");

        Collections.sort(words, (a, b) -> a.length() - b.length());

        System.out.println(words);
    }
}

