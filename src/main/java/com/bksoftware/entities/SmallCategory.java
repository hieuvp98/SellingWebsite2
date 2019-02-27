package com.bksoftware.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "small_category")
@Data
public class SmallCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(table = "medium_category")
    private MediumCategory mediumCategory;


    @OneToMany(mappedBy = "smallCategory")
    private Set<Product> products = new HashSet<>();


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "smallCategory")

    private boolean status;
}
