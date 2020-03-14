package ru.gb.stream200302_lesson_4;

import java.util.Arrays;

public class Worker {

    private String surname;
    private int pay;
    private int age;
    private String position;

    public String getSurname () {
        return this.surname;
    }

    public int getPay () {
        return this.pay;
    }

    public void setPay (int Pay) {
      this.pay = pay;
    }

    public int getAge () {
        return this.age;
    }
    public String getPosition () {
        return this.position;
    }

    Worker(String surname, int pay, int age, String position){
        this.surname=surname;
        this.pay=pay;
        this.age=age;
        this.position=position;
    }

    public void twoValue () {
        System.out.println("(Study-4) Two Value - Surname and Office position:\n"+surname + " is " + position + "\n");
    }
}

