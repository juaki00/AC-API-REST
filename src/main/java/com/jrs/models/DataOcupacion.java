package com.jrs.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;


@Data

public class DataOcupacion {

    @Field("Valor")
    Integer Valor;
}
