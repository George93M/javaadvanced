package com.sda.george.advanced.recap;

import java.util.LinkedList;
import java.util.List;

public class Student extends Person {


    @Override
    public String toString() {
        return "Student{" +  "age"+ " " + getAge()+ " " +
        "grades" + getNote() ;


    }

    private List<Integer> note;

    public Student( int age, List<Integer> note) {
        this.note = note;
    }

    public Student(int age, String name, Gender gender, List<Integer> note) {
        super(age, name, gender);
        this.note = note;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void setNote(List<Integer> note) {
        this.note = note;
    }

    public Student() {
    }
}
