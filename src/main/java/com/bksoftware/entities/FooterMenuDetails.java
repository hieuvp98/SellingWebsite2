package com.bksoftware.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "footer_menu_details")
public class FooterMenuDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(table = "footer_menu_details")
    private FooterMenu footerMenu;

    private boolean status;
}
