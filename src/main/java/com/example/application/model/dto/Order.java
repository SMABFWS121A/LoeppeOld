package com.example.application.model.dto;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private Customer customer;
    private Artikel[] artikels;
    private Boolean bezahlt;
}
