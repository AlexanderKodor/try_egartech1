package com.alex.egartech.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "documents")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "number_doc")
    private int number;
    @Column(name = "date_doc")
    private String date;
    @Column(name = "department")
    private String department;
    @Column(name = "type_doc")
    private String type;

    public Employee() {
    }

    public Employee(int number, String date, String department, String type) {
        this.number = number;
        this.date = date;
        this.department = department;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
