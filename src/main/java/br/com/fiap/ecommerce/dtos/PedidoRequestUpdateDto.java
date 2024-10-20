package br.com.fiap.ecommerce.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoRequestUpdateDto {
    private Long id;
    private LocalDateTime data_pedido;
    private String forma_pagamento;
    private Long id_cliente;
    private String status;
    private double valor_total;
}
