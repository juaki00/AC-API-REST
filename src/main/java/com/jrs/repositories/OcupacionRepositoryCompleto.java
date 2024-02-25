package com.jrs.repositories;

import com.jrs.dtos.OcupacionCompletoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OcupacionRepositoryCompleto extends MongoRepository<OcupacionCompletoDTO, Integer> {

}
