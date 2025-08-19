package br.com.codgestao.api.repository;

import br.com.codgestao.api.dto.EstoqueDTO;
import br.com.codgestao.api.model.Tgfest;
import br.com.codgestao.api.model.TgfestId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TgfestRepository extends JpaRepository<Tgfest, TgfestId> {

    List<Tgfest> findByIdCodProd(Long codProd);

    List<Tgfest> findByIdCodProdAndIdCodEmp(Long codProd, Long codEmp);

    Optional<Tgfest> findByIdCodProdAndIdCodEmpAndIdCodLocal(Long codProd, Long codEmp, Long codLocal);

    // 🔎 Consulta completa com JOIN (DTO)
    @Query("SELECT new br.com.codgestao.api.dto.EstoqueDTO(" +
           "p.codProd, p.descrProd, p.codVol, p.referencia, p.refForn, p.localizacao, " +
           "e.codEmp, emp.razaoSocial, e.codLocal, e.estoque, e.reservado, e.controle, e.dtFabricacao, e.dtVal) " +
           "FROM Tgfest e " +
           "JOIN Tgfpro p ON p.codProd = e.id.codProd " +
           "JOIN Tsiemp emp ON emp.codEmp = e.id.codEmp")
    List<EstoqueDTO> consultarEstoqueCompleto();

    // 🔎 Consulta dinâmica com filtros
    @Query("SELECT new br.com.codgestao.api.dto.EstoqueDTO(" +
           "p.codProd, p.descrProd, p.codVol, p.referencia, p.refForn, p.localizacao, " +
           "e.codEmp, emp.razaoSocial, e.codLocal, e.estoque, e.reservado, e.controle, e.dtFabricacao, e.dtVal) " +
           "FROM Tgfest e " +
           "JOIN Tgfpro p ON p.codProd = e.id.codProd " +
           "JOIN Tsiemp emp ON emp.codEmp = e.id.codEmp " +
           "WHERE (:codProd IS NULL OR p.codProd = :codProd) " +
           "AND (:descrProd IS NULL OR LOWER(p.descrProd) LIKE LOWER(CONCAT('%', :descrProd, '%'))) " +
           "AND (:referencia IS NULL OR LOWER(p.referencia) LIKE LOWER(CONCAT('%', :referencia, '%'))) " +
           "AND (:refForn IS NULL OR LOWER(p.refForn) LIKE LOWER(CONCAT('%', :refForn, '%')))")
    List<EstoqueDTO> consultarEstoque(@Param("codProd") Long codProd,
                                      @Param("descrProd") String descrProd,
                                      @Param("referencia") String referencia,
                                      @Param("refForn") String refForn);
}
