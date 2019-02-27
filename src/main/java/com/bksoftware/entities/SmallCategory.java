package com.bksoftware.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "small_category")
public class SmallCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(table = "medium_category")
    private MediumCategory mediumCategory;

    private boolean status;
}