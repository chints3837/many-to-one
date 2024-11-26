package com.example.springbootmanytoone.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer sId;

    @Column(name = "sName")
    public String sName;

    @Column(name = "sCity")
    public String sCity;

    @ManyToOne
    @JoinColumn(name = "bidFK")
    public Book bob;



}
