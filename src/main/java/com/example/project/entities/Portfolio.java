package com.example.project.entities;

import com.wellsfargo.counselor.entity.Client;
import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    private Client client;

    public Portfolio(Long portfolioId, Client client) {
        this.portfolioId = portfolioId;
        this.client = client;
    }

    public Portfolio() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }
}
