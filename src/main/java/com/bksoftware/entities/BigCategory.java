package com.bksoftware.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "big_category")
public class BigCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    private boolean status;

}
