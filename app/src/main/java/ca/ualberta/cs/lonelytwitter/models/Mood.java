package ca.ualberta.cs.lonelytwitter.models;

public abstract class Mood {
    private String x;
    public Mood(String x) {
        this.x = "None";
    }

    public Mood() {

    }


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    abstract String currentMood();


}
