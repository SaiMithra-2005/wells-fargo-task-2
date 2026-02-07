package com.example.project.entities;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    private Portfolio portfolio;

    public Security(Long securityId, String name, String category,
                    String purchaseDate, double purchasePrice,
                    int quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Security() {

    }

    public Long getSecurityId() {
        return securityId;
    }
}
