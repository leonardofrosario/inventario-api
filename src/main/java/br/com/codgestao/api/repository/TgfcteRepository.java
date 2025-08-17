package br.com.codgestao.api.repository;

import br.com.codgestao.api.model.Tgfcte;
import br.com.codgestao.api.model.TgfcteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TgfcteRepository extends JpaRepository<Tgfcte, TgfcteId> {

    // Buscar todos os inventários por código do produto
    List<Tgfcte> findByIdCodProd(Long codProd);

    // Se precisar, também pode buscar por empresa e produto
    List<Tgfcte> findByIdCodEmpAndIdCodProd(Long codEmp, Long codProd);
}
