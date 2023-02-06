package com.example.demo.models;

import jakarta.persistence.*;


@Entity
public class Kotiki_model {

    @Id
    Long id;

    @Column()
    String name;
    @Column()
    Boolean sex;
    @Column()
    String color;
    @Column()
    String breed;

}
