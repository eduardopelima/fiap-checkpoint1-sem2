package br.com.fiap.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponseDto {
    private Long id;
    private String bairro;
    private String cep;
    private String complemento;
    private String logradouro;
    private String municipio;
    private String nome;
    private int numero;
    private String uf;
}
