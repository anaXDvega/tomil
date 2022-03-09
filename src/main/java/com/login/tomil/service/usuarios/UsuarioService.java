package com.login.tomil.service.usuarios;

import com.login.tomil.model.UsuariosEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioService {
    Flux<UsuariosEntity> findAll();
    Mono<UsuariosEntity> save(UsuariosEntity usuario);


}
