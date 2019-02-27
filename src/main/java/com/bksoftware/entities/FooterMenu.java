package com.bksoftware.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "footer_menu")
public class FooterMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private boolean status;

    @OneToMany(mappedBy = "footerMenu")
    private Set<FooterMenuDetails> footerMenuDetails = new HashSet<>();
}
