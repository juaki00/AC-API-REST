package com.jrs.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class MetaDataOcupacion {

    @Field("Nombre")
    private String nombre;

    @Field("Codigo")
    private String codigo;
}
