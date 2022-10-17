package com.example.application.data.dto;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer id;
    private Customer customer;
    private List<Artikel> artikels;
    private Boolean bezahlt;
}
