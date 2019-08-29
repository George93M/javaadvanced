package com.sda.george.advanced.recap;

public class Profesor extends Person implements Payable {

    private double salary;

  private String subject;

    public Profesor() {
    }

    public Profesor(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public Profesor(double salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }




    public void pay(double amount) {

        this.salary = amount;

    }
}
