package com.nikita.springbootexample3.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    @OneToMany(targetEntity = Report.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Pid_Fk", referencedColumnName = "id")
    private List<Report> reports;
}
