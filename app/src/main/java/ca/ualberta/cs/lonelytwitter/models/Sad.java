package ca.ualberta.cs.lonelytwitter.models;

import java.util.Date;

public class Sad extends Mood {
    private Date date;
    Sad(){
        super();
        this.date = new Date(99, 10, 3);
    }

    public String currentMood() {
        String x = "Im feel Sad";
        return x;
    }

    Sad(Date date){
        super();
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }
}



