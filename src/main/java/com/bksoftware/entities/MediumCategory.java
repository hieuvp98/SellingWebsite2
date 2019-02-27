package com.bksoftware.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medium_category")
public class MediumCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(table = "big_category")
    BigCategory bigCategory;

    private boolean status;
}
