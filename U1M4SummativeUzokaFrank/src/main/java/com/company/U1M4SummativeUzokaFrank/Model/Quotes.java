package com.company.U1M4SummativeUzokaFrank.Model;

public class Quotes {

    private String author;
    private String quote;

    public Quotes(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    public Quotes() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}


