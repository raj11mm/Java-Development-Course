package com.rajshekhar;

import jakarta.persistence.*;

@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;
    @Column
    int marks;
    @Column
    int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aid", referencedColumnName = "addrid")
    Address addr;


    public Student(int id, String name, int marks, int age, Address addr) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
        this.addr = addr;
    }

    public Student(String name, int marks, int age, Address addr) {
        this.name = name;
        this.marks = marks;
        this.age = age;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
}
