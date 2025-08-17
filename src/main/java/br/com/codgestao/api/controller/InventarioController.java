package br.com.codgestao.api.controller;

import br.com.codgestao.api.model.Tgfcte;
import br.com.codgestao.api.model.TgfcteId;
import br.com.codgestao.api.service.InventarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    // 🔹 Buscar todos os inventários
    @GetMapping("/listar")
    public List<Tgfcte> listarInventario() {
        return inventarioService.listarInventario();
    }

    // 🔹 Buscar inventários por produto
    @GetMapping("/produto/{codProd}")
    public List<Tgfcte> buscarPorProduto(@PathVariable Long codProd) {
        return inventarioService.buscarPorProduto(codProd);
    }

    // 🔹 Buscar inventário por chave composta
    @PostMapping("/buscar")
    public ResponseEntity<Tgfcte> buscarPorChave(@RequestBody TgfcteId id) {
        Optional<Tgfcte> inventario = inventarioService.buscarPorChave(id);
        return inventario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 🔹 Criar ou atualizar inventário
    @PostMapping("/salvar")
    public Tgfcte salvar(@RequestBody Tgfcte inventario) {
        return inventarioService.salvar(inventario);
    }
}
