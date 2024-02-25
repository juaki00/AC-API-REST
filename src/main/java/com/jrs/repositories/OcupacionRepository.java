package com.jrs.repositories;

import com.jrs.models.OcupacionResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OcupacionRepository extends MongoRepository<OcupacionResponse, Integer> {
    public List<OcupacionResponse> getOcupacionDTOByNombre( String nombre);
}
