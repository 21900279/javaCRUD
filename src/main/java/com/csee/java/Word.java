package com.csee.java;

public class Word {
    private String word;
    private String meaning;
    private int difficulty;

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
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public Word() {
    }

    public Word(String word, String meaning, int difficulty) {
        this.word = word;
        this.meaning = meaning;
        this.difficulty = difficulty;
    }
}
