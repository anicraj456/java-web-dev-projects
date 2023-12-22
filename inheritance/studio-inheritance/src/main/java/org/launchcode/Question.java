package org.launchcode;

public abstract class Question {
    private int id;
    private String askedQuestion;
    private int pointValue;
    public static int nextId = 1;

    public Question(int id, String askedQuestion, int pointValue) {
        this.id = id;
        this.askedQuestion = askedQuestion;
        this.pointValue = pointValue;
    }

    public Question(){
        int id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getAskedQuestion() {
        return askedQuestion;
    }

    public void setAskedQuestion(String askedQuestion) {
        this.askedQuestion = askedQuestion;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
