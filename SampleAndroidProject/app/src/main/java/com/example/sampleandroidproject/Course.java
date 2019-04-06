package com.example.sampleandroidproject;

import java.io.Serializable;

public class Course implements Serializable {
    public String name;
    public String note;
    public String totalstudent;
    public String avgnote;

    public Course(String name, String note, String avgnote, String totalstudent) {
        this.name = name;
        this.note = note;
        this.totalstudent = totalstudent;
        this.avgnote=avgnote;
    }
}
