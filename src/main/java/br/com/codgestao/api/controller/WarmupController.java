package br.com.codgestao.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Endpoint simples para "acordar" a instância no Render e esquentar o pool de conexões.
 * A primeira chamada do dia pode demorar um pouco; as seguintes ficam rápidas.
 */
@RestController
public class WarmupController {

    private final DataSource dataSource;

    public WarmupController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/warmup")
    public String warmup() throws SQLException {
        try (Connection c = dataSource.getConnection()) {
            // Apenas abre e fecha a conexão para esquentar Hikari/DB
        }
        return "ok";
    }
}
