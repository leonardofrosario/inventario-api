package br.com.codgestao.api.service;

import br.com.codgestao.api.model.Tgfcte;
import br.com.codgestao.api.model.TgfcteId;
import br.com.codgestao.api.repository.TgfcteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    private final TgfcteRepository tgfcteRepository;

    public InventarioService(TgfcteRepository tgfcteRepository) {
        this.tgfcteRepository = tgfcteRepository;
    }

    // Lista todos os registros de inventário
    public List<Tgfcte> listarInventario() {
        return tgfcteRepository.findAll();
    }

    // Busca inventário por produto
    public List<Tgfcte> buscarPorProduto(Long codProd) {
        return tgfcteRepository.findByIdCodProd(codProd);
    }

    // Busca inventário pela chave composta
    public Optional<Tgfcte> buscarPorChave(TgfcteId id) {
        return tgfcteRepository.findById(id);
    }

    // Salvar contagem
    public Tgfcte salvar(Tgfcte inventario) {
        return tgfcteRepository.save(inventario);
    }
}
