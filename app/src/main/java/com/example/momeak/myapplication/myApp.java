package com.example.momeak.myapplication;

import android.app.Application;

public class myApp extends Application {
    public String date;

    public  String getName() {
        return date;
    }

    public  void setName(String name) {
        this.date = name;
    }

    public String dates;

    public  String getNames() {
        return dates;
    }

    public  void setNames(String name) {
        this.dates = name;
    }
    public String datesd;

    public  String getNamesd() {
        return datesd;
    }

    public  void setNamesd(String name) {
        this.datesd = name;
    }
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        setName("初始值!");
    }

}

