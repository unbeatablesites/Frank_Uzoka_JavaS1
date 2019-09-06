package com.company.U1M4SummativeUzokaFrank.Model;

public class Answers {

    private String question;
    private String answer;

    public Answers(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Answers() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
