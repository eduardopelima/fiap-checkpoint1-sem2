package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoRequestUpdateDto {
    private String nome;
    private int valor;
}
