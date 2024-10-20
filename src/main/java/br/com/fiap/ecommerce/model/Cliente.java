package br.com.fiap.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String bairro;

    @Column(length = 9)
    private String cep;

    @Column(length = 100)
    private String complemento;

    @Column(length = 100)
    private String logradouro;

    @Column(length = 100)
    private String municipio;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column
    private int numero;

    @Column(length = 2)
    private String uf;
}
