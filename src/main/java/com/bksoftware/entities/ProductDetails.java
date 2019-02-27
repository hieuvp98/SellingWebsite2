package com.bksoftware.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_status")
    private boolean productStatus;

    @Column(name = "sold_date")
    private LocalDate soldDate;

    private int guarantee;

    @OneToMany(mappedBy = "productDetails")
    private Set<Feedback> feedbacks = new HashSet<>();

    @OneToMany(mappedBy = "feature")
    private Set<Feature> features = new HashSet<>();

    private boolean status;

}
