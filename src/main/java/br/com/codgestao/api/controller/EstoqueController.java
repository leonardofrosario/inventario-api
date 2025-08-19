package br.com.codgestao.api.controller;

import br.com.codgestao.api.dto.EstoqueDTO;
import br.com.codgestao.api.model.Tgfest;
import br.com.codgestao.api.model.TgfestId;
import br.com.codgestao.api.service.EstoqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

    private final EstoqueService service;

    public EstoqueController(EstoqueService service) {
        this.service = service;
    }

    // 🔎 Consulta completa com DTO (join entre tabelas)
    @GetMapping
    public List<EstoqueDTO> listarEstoque() {
        return service.listarEstoque();
    }

    // 🔎 Consulta dinâmica com filtros opcionais
    @GetMapping("/consulta")
    public List<EstoqueDTO> consultarEstoque(
            @RequestParam(required = false) Long codProd,
            @RequestParam(required = false) String descrProd,
            @RequestParam(required = false) String referencia,
            @RequestParam(required = false) String refForn
    ) {
        return service.consultarEstoque(codProd, descrProd, referencia, refForn);
    }

    // 🔎 Consulta estoque por produto
    @GetMapping("/{codProd}")
    public List<Tgfest> listarPorProduto(@PathVariable Long codProd) {
        return service.buscarPorProduto(codProd);
    }

    // 🔎 Consulta estoque por produto + empresa
    @GetMapping("/{codProd}/empresa/{codEmp}")
    public List<Tgfest> listarPorProdutoEmpresa(@PathVariable Long codProd, @PathVariable Long codEmp) {
        return service.buscarPorProdutoEmpresa(codProd, codEmp);
    }

    // 🔎 Consulta estoque por produto + empresa + local
    @GetMapping("/{codProd}/empresa/{codEmp}/local/{codLocal}")
    public ResponseEntity<Tgfest> listarPorProdutoEmpresaLocal(
            @PathVariable Long codProd,
            @PathVariable Long codEmp,
            @PathVariable Long codLocal) {

        return service.buscarPorProdutoEmpresaLocal(codProd, codEmp, codLocal)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    // ❌ Deletar registro específico
    @DeleteMapping("/{codProd}/empresa/{codEmp}/local/{codLocal}")
    public ResponseEntity<Void> deletar(
            @PathVariable Long codProd,
            @PathVariable Long codEmp,
            @PathVariable Long codLocal) {

        TgfestId id = new TgfestId();
        id.setCodProd(codProd);
        id.setCodEmp(codEmp);
        id.setCodLocal(codLocal);

        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
