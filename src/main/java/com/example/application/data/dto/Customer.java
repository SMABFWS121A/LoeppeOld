package com.example.application.data.dto;

import com.example.application.data.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Customer extends AbstractEntity {
    private String vorname;
    private String nachname;
    private String adresse;
}
