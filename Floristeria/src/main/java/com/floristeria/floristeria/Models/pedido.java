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
@Table(name ="pedido")

public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int flor;
    private int cantidad;
    private float suma;
    private int cliente;
    private boolean estado = true;
    private Timestamp fech = Timestamp.from(Instant.now());

}
