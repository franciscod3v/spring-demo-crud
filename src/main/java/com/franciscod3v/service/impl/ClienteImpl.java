package com.franciscod3v.service.impl;

import com.franciscod3v.model.entity.Cliente;
import com.franciscod3v.service.ICliente;
import com.franciscod3v.model.dao.ClienteDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {

    private final ClienteDao clienteDao;

    public ClienteImpl(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findbyId(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
