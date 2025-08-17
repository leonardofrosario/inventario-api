package br.com.codgestao.api.repository;

import br.com.codgestao.api.model.Tgfest;
import br.com.codgestao.api.model.TgfestId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface TgfestRepository extends JpaRepository<Tgfest, TgfestId> {

    // 🔹 Estoque de um produto em todas as empresas/locais
    List<Tgfest> findByIdCodProd(Long codProd);

    // 🔹 Estoque de um produto em uma empresa específica
    List<Tgfest> findByIdCodProdAndIdCodEmp(Long codProd, Long codEmp);

    // 🔹 Estoque de um produto em uma empresa + local específico
    Optional<Tgfest> findByIdCodProdAndIdCodEmpAndIdCodLocal(Long codProd, Long codEmp, Long codLocal);

    // 🔹 Consulta SQL customizada para totalizar estoque de um produto em todas as empresas
    @Query("SELECT SUM(t.estoque) FROM Tgfest t WHERE t.id.codProd = :codProd")
    BigDecimal totalEstoquePorProduto(@Param("codProd") Long codProd);
}
