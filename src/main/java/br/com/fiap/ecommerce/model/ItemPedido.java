package br.com.fiap.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ItemPedido {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long id_pedido;

    @Column
    private Long id_produto;

    @Column
    private int quantidade;

    @Column
    private double valor_total;
}
