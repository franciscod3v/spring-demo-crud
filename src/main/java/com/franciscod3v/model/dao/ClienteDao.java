package com.franciscod3v.model.dao;

import com.franciscod3v.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
