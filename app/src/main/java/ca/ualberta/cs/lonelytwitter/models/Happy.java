package ca.ualberta.cs.lonelytwitter.models;

import java.util.ArrayList;
import java.util.Date;

public class Happy extends Mood {
    private Date date;
    Happy(){
        super();
        this.date = new Date(99, 10, 3);
    }

    public String currentMood() {
        String x = "Im feel happy";
        return x;
    }

    Happy(Date date){
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



