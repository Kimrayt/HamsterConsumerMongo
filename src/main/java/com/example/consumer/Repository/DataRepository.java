package com.example.consumer.Repository;

import DTO.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<Data, String> {
}
