package com.csee.java;

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getDifficulty() {
        return level;
    }

    public void setDifficulty(int level) {
        this.level = level;
    }

    @Override
    public String toString() {

        String slevel = "";
        for(int i=0; i<level; i++) slevel += "*";
        String str = String.format("%-3s", slevel) + String.format("%15s", word) + " " + meaning;
        return str;
    }

    public Word() {
    }

    public Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }
}
