package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    private FinancialAdvisor advisor;

    public Client(Long clientId, String name, String email, String phone, FinancialAdvisor advisor) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
    }

    public Client() {

    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

