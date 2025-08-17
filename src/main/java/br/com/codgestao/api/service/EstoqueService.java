package br.com.codgestao.api.service;

import br.com.codgestao.api.model.Tgfest;
import br.com.codgestao.api.model.TgfestId;
import br.com.codgestao.api.repository.TgfestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    private final TgfestRepository repository;

    public EstoqueService(TgfestRepository repository) {
        this.repository = repository;
    }

    // 🔹 Buscar estoque por produto (todas as empresas/locais)
    public List<Tgfest> buscarPorProduto(Long codProd) {
        return repository.findByIdCodProd(codProd);
    }

    // 🔹 Buscar estoque por produto + empresa
    public List<Tgfest> buscarPorProdutoEmpresa(Long codProd, Long codEmp) {
        return repository.findByIdCodProdAndIdCodEmp(codProd, codEmp);
    }

    // 🔹 Buscar estoque por produto + empresa + local
    public Optional<Tgfest> buscarPorProdutoEmpresaLocal(Long codProd, Long codEmp, Long codLocal) {
        return repository.findByIdCodProdAndIdCodEmpAndIdCodLocal(codProd, codEmp, codLocal);
    }

    // 🔹 Buscar por ID composto
    public Optional<Tgfest> buscarPorId(TgfestId id) {
        return repository.findById(id);
    }

    // 🔹 Salvar estoque
    public Tgfest salvar(Tgfest estoque) {
        return repository.save(estoque);
    }

    // 🔹 Deletar estoque por ID
    public void deletar(TgfestId id) {
        repository.deleteById(id);
    }
}
