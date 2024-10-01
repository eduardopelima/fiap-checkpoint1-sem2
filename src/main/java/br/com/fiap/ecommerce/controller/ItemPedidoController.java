package br.com.fiap.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.ecommerce.dtos.ItemPedidoRequestCreateDto;
import br.com.fiap.ecommerce.dtos.ItemPedidoResponseDto;
import br.com.fiap.ecommerce.service.ItemPedidoService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("itempedido")
public class ItemPedidoController {
    @Autowired
    ItemPedidoService itemPedidoService;

    @GetMapping
    public ResponseEntity<List<ItemPedidoResponseDto>> list() {
        List<ItemPedidoResponseDto> dtos = itemPedidoService.list()
                                                .stream()
                                                .map(e -> new ItemPedidoResponseDto().toDto(e))
                                                .toList();
        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping
    public ResponseEntity<ItemPedidoResponseDto> create(@RequestBody ItemPedidoRequestCreateDto dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                    new ItemPedidoResponseDto().toDto(
                        itemPedidoService.save(dto.toModel())
                    )
                );
    }
}
