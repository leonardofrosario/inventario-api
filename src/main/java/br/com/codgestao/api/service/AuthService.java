package br.com.codgestao.api.service;

import br.com.codgestao.api.dto.LoginRequest;
import br.com.codgestao.api.model.Usuario;
import br.com.codgestao.api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean login(LoginRequest request) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByNomeUsu(request.getUsername());

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            // Aqui é comparação simples (plaintext).
            // Se quiser segurança real, podemos criptografar.
            return usuario.getInterno().equals(request.getPassword());
        }
        return false;
    }
}
