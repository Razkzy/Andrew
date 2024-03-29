package com.example.collins.stayfit.models;

/**
 * Created by Dell on 4/26/2018.
 */

public class sessionClass {

    private int sessionid;
    private String sessionname;
    private String totaltime;
    private String kilometers;
    private String calories;
    private String date;
    private String starttime;

    public sessionClass()
    {

    }

    public sessionClass(int sessionid, String sessionname, String totaltime, String kilometers, String calories, String date) {
        this.sessionid = sessionid;
        this.sessionname = sessionname;
        this.totaltime = totaltime;
        this.kilometers = kilometers;
        this.calories = calories;
        this.date = date;
    }

    public int getSessionid() {
        return sessionid;
    }

    public String getSessionname() {
        return sessionname;
    }

    public String getTotaltime() {
        return totaltime;
    }

    public String getKilometers() {
        return kilometers;
    }

    public String getCalories() {
        return calories;
    }

    public String getDate() {
        return date;
    }

    public void setSessionid(int sessionid) {
        this.sessionid = sessionid;
    }

    public void setSessionname(String sessionname) {
        this.sessionname = sessionname;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
