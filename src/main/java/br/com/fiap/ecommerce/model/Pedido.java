package br.com.fiap.ecommerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pedido {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime data_pedido;

    @Column(length = 50)
    private String forma_pagamento;

    @Column
    private Long id_cliente;

    @Column(length = 50)
    private String status;

    @Column
    private double valor_total;
}
