package com.login.tomil.repository.usuarios;

import com.login.tomil.model.UsuariosEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends ReactiveMongoRepository<UsuariosEntity, String> {

}
