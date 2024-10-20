package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoRequestCreateDto {
    private String nome;
    private int valor;
}
