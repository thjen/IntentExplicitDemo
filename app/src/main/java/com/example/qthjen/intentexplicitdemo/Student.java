package com.example.qthjen.intentexplicitdemo;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int berthday;

    public Student(String name, int berthday) {

        setName(name);
        setBerthday(berthday);

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setBerthday(int berthday) {

        this.berthday = berthday;
    }

    public int getBerthday() {

        return berthday;
    }

}
