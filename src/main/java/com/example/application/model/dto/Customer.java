package com.example.application.model.dto;

import lombok.Data;

@Data
public class Customer {
    private String vorname;
    private String nachname;
    private Integer id;
    private String adresse;
}
