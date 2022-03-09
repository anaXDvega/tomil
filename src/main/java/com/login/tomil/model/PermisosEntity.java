package com.login.tomil.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@Builder
@Document(collection =  "Permisos")
public class PermisosEntity {
    private String Id;
    private String Id_usuario;
    private String Id_permisos;
}
