package com.jrs.models;

import com.jrs.models.DataOcupacion;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "ocupaciones")
public class OcupacionResponse {

    @Id
    private String id;

    @Field("Nombre")
    private String nombre;

    @Field("Data")
    private Integer data;

}
