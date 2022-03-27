package ru.geekbrains.lesson5;

public class Employee {
    public String fullName;
    public String jobTitle;
    public String email;
    public long phoneNumber;
    public float sellary;
    public int age;


    public Employee(String fullName, String jobTitle, String email, long phoneNumber, float sellary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sellary = sellary;
        this.age = age;
    }

    @Override
    public String toString() {
        return " \n" + "Name: " + fullName + ", \n" + "Job Title: " + jobTitle + ",\n" +
                "Email: " + email + ",\n" + "Phone: " + phoneNumber + ",\n" +
                "Sellary: " + sellary + ",\n" + "Age: " + age;
    }
}
