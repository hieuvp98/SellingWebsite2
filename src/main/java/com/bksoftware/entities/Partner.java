package com.bksoftware.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "partner")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "img_url")
    private String imgUrl;

    @OneToMany(mappedBy = "partner")
    Set<Product> products = new HashSet<>();

    private boolean status;
}
