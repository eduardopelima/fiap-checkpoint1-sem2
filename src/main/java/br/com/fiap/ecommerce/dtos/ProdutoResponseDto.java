package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoResponseDto {
    private Long id;
	private String nome;
    private double valor;
}
