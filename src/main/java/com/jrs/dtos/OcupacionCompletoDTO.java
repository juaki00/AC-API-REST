package com.jrs.dtos;

import com.jrs.models.DataOcupacion;
import com.jrs.models.MetaDataOcupacion;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "ocupaciones")
public class OcupacionCompletoDTO {

    @Id
    private String id;

    @Field("Nombre")
    private String nombre;

    @Field("MetaData")
    private List<MetaDataOcupacion> metaData;

    @Field("Data")
    private List<DataOcupacion> data;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof OcupacionCompletoDTO that)) return false;
        return Objects.equals( nombre , that.nombre );
    }

    @Override
    public int hashCode( ) {
        return Objects.hash( nombre );
    }
}
