package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

public class ProdutoRequestCreateDto {
    private String nome;
    private int valor;
    private static final ModelMapper modelMapper = new ModelMapper();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Produto toModel() {
        return modelMapper.map(this, Produto.class);
    }
}
