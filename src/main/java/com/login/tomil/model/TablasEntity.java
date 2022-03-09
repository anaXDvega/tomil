package com.login.tomil.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@Builder
@Document(collection =  "tablas")
public class TablasEntity {
    private   String Id;
    private   String Nombre;
    private   String Tipo;
    private   String Valor;
    private   String Fecha_inicio;
    private   String Fecha_fin;
}
