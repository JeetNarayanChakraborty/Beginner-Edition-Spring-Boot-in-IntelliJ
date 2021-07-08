package com.nikita.springbootexample3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Report {
    @Id
    @GeneratedValue
    private int id;
    private String test;
    private String status;

    @OneToOne(targetEntity = Patient.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Rid_Fk")
    private Patient patient;

    @OneToOne(targetEntity = Doctor.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Rid_Fkk")
    private Doctor doctor;
}
