package com.sda.george.advanced;

import com.sda.george.advanced.recap.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MavenMain {

    public static void main(String[] args) {


        Person person1 = new Person(22, "Didi", Gender.FEMALE);
        Person person2 = new Person();
        person2.setName("Didi");
        person2.setAge(22);
        person2.setGender(Gender.FEMALE);
        System.out.println(person2);
        System.out.println(person1);


      ////  Profesor person = new Profesor(50, "Dan",Gender.MALE,5000.55, "Math");
    //    System.out.println(person);


        List<Integer> studentsGrades = new ArrayList<>();
        studentsGrades.add(7);
        studentsGrades.add(9);
        studentsGrades.add(10);

        Student student = new Student(18, "Paul", Gender.MALE, studentsGrades );
        System.out.println(student);


        Director director = new Director(0, "math");
        Profesor profesor = new Profesor(0, "history");
        director.pay(2000);
        System.out.println(director.getSalary());
        profesor.pay(1000);
        System.out.println(profesor.getSalary());


        if (person1.equals(person2)) {
            System.out.println("ARE EQUAL");
        } else {
            System.out.println("NOT EQUALS");
        }

    }


}

