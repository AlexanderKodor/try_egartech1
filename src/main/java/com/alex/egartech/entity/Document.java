package com.alex.egartech.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Min(value = 1, message = "Номер должен быть 1 и более")
    @Max(value = 10000, message = "Номер должен быть не более 10000")
    @Column(name = "number_doc")
    private int number;
    @NotNull
    //тут валидация даты, надо свою писать
    @Column(name = "date_doc")
    private LocalDate date;
    @NotBlank(message = "Вы забыли ввести тип документа")
    @Column(name = "type_doc")
    private String type;
    @NotBlank(message = "Вы забыли ввести наименование департамента")
    @Column(name = "department")
    private String department;

    public Document() {
    }

//    public Document(int id, int number, String type, String department) {
//        this.id = id;
//        this.number = number;
//        this.type = type;
//        this.department = department;
//    }
//    public Document(int number, String type, String department) {
//        this.number = number;
//        this.type = type;
//        this.department = department;
//    }


    public Document(int id, int number, LocalDate date, String type, String department) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.type = type;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
