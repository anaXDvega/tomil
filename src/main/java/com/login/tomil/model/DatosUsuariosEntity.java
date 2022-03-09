package com.login.tomil.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@Builder
@Document(collection =  "Datos_usuarios")
public class DatosUsuariosEntity {
    private String Id;
    private String Nombre;
    private String Cedula;
    private String Estado;
}
