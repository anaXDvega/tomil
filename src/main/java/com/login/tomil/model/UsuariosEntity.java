package com.login.tomil.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection =  "usuarios")
public class UsuariosEntity {
    private String Id;
    private String Usuario_id;
    private String Usuario;
    private String Password;
}
