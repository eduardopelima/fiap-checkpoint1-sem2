package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;

public class ItemPedidoRequestCreateDto {
    private Long id_pedido;
    private Long id_produto;
    private int quantidade;
    private double valor_total;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Long getId_produto() {
        return id_produto;
    }

    public void setId_produto(Long id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public static ModelMapper getModelmapper() {
        return modelMapper;
    }

    public ItemPedido toModel() {
        return modelMapper.map(this, ItemPedido.class);
    }

    
}
