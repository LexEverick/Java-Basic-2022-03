package com.homework12;

public class Client {

    private String name;
    private int yearOfBirth = 18 + (int) (Math.random() * 62);

    public Client(String name) {
        this.name = name;
        //this.earOfBirth = earOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }



}
