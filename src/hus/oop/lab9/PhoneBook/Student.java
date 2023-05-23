package hus.oop.lab9.PhoneBook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private String phone;
    private double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,lastname,phone,average);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Double.compare(student.average,average) == 0
                && Objects.equals(name,student.name)
                && Objects.equals(lastname,student.lastname)
                && Objects.equals(phone,student.phone);
    }

    @Override
    public String toString() {
        return "Student[" + "name='" + name + '\'' + ", lastname='"
                + lastname + '\'' + ", phone='" + phone + '\'' +
                ", average=" + average + ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
