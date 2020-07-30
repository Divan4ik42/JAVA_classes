package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String patronymic;
    private String lastname;
    private boolean gender;
    private int course;
    private String cafedra;
    private LocalDate birthDay;

    public Student() {
    }

    public Student(String name, String patronymic, String lastname, boolean gender, int course, String cafedra) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastname = lastname;
        this.gender = gender;
        this.course = course;
        this.cafedra = cafedra;

    }

    public Student(String name, String patronymic, String lastname, boolean gender, int course, String cafedra, LocalDate birthDay) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastname = lastname;
        this.gender = gender;
        this.course = course;
        this.cafedra = cafedra;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getCafedra() {
        return cafedra;
    }

    public void setCafedra(String cafedra) {
        this.cafedra = cafedra;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isAdult(){
        long age = ChronoUnit.YEARS.between(this.getBirthDay(), LocalDate.now()); // если поменять местами - ТО ВІДАСТ ОТРИЦАТЕЛЬНОЕ ЗНАЧЕНИЕ и как результат відаст ФОЛС в
        System.out.println(age);
        if (age >=18){
            return true;
            
        }
        else return false;
        /*return true;*/

    }

    @Override
    public String toString() {
        String buffer2 = "";
        if (this.isAdult() == true){
            buffer2 = "Совершеннолетний";

        }
        else {
            buffer2 = "СОПЛЯК";
        }



        String buffer = "";
        if (gender ==true){
            buffer = "male";
        }
        else {
            buffer = "female";
        }
        
        return "Student{" +
                "name= " + name +
                ", patronymic= " + patronymic +
                ", lastname= " + lastname +
                ", gender= " + buffer +
                ", course= " + course +
                ", cafedra= " + cafedra +
                ", date of birth= " + birthDay +
                ", adult = " + buffer2 +
                '}';
    }
}
