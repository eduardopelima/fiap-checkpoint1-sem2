package br.com.fiap.ecommerce.dtos;

import java.time.LocalDateTime;

public class PedidoRequestResponseDto {
    private Long id;
    private LocalDateTime data_pedido;
    private String forma_pagamento;
    private Long id_cliente;
    private String status;
    private double valor_total;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getData_pedido() {
        return data_pedido;
    }
    public void setData_pedido(LocalDateTime data_pedido) {
        this.data_pedido = data_pedido;
    }
    public String getForma_pagamento() {
        return forma_pagamento;
    }
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    public Long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getValor_total() {
        return valor_total;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
}
