package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoRequestCreateDto {
    private Long id_pedido;
    private Long id_produto;
    private int quantidade;
    private double valor_total;
}
