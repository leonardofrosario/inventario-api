package br.com.codgestao.api.controller;

import br.com.codgestao.api.dto.LoginRequest;
import br.com.codgestao.api.dto.LoginResponse;
import br.com.codgestao.api.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        if (authService.login(request)) {
            return ResponseEntity.ok(new LoginResponse(
                    request.getUsername(),
                    "Login realizado com sucesso ✅"
            ));
        }
        return ResponseEntity.status(401).body(new LoginResponse(
                request.getUsername(),
                "Usuário ou senha inválidos ❌"
        ));
    }
}

