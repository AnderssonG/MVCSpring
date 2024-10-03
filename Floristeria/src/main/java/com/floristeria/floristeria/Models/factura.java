package com.floristeria.floristeria.Models;

import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="factura")

public class factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int cliente;
    private float adicionales;
    private float total;
    private Timestamp time;

    public factura(int id, int cliente, float adicionales, float total) {
        this.id = id;
        this.cliente = cliente;
        this.adicionales = adicionales;
        this.total = total;
        this.time = Timestamp.from(Instant.now());

    }

    

}