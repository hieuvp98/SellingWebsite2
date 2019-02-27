package com.bksoftware.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String detail;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(table = "product_details")
    private Feature feature;

    private boolean status;
}
