package com.company.U1M4SummativeUzokaFrank.Model;

public class Definitions {

    private String word;
    private String definition;

    public Definitions(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public Definitions() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
