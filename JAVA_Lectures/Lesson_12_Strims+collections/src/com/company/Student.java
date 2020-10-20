package com.company;

public class Student {
    private String name;
    private Integer mark;

    public Student() {
    }

    public Student(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "имя='" + name + '\'' +
                ", оценка=" + mark +
                '}';
    }
}
