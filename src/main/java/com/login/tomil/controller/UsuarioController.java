package com.login.tomil.controller;

import com.login.tomil.model.UsuariosEntity;
import com.login.tomil.service.usuarios.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    UsuarioServiceImpl usuarioService;
    @GetMapping("/getPersons")
    public Flux<UsuariosEntity> getPersons(){
    return usuarioService.findAll();
}

    @PostMapping("/registrarPersonas")
    Mono<UsuariosEntity> registrarPersonas(@RequestBody UsuariosEntity usuariosEntity){
        return usuarioService.save(usuariosEntity);
    }
 }
