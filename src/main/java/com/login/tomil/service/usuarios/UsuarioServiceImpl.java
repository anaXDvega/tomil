package com.login.tomil.service.usuarios;

import com.login.tomil.model.UsuariosEntity;
import com.login.tomil.repository.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioService {
  @Autowired
  UsuarioRepository usuarioRepository;
    @Override
    public Flux<UsuariosEntity> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Mono<UsuariosEntity> save(UsuariosEntity usuario) {
        return usuarioRepository.save(usuario);
    }
}
