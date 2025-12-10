package com.kodnest.ThirdHibernate;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "student")   // fix spelling
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int marks;
    private String email;

    public Student() {}

    public Student(String name, int marks, String email) {
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
