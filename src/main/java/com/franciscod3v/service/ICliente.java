package com.franciscod3v.service;

import com.franciscod3v.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);//CrudRepository identify when is insert or update
    Cliente findbyId(Integer id);
    void delete(Cliente cliente);

}
