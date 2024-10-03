package com.floristeria.floristeria.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.floristeria.floristeria.Models.cliente;
import com.floristeria.floristeria.Repository.cliente_interface;

@Service

public class clienteService {
    private final cliente_interface cliente_i;

    public clienteService(final cliente_interface cliente_i) {
        this.cliente_i = cliente_i;
    }

    public List<cliente> findAll() {
        return cliente_i.findAll();
    }

    public <S extends cliente> S save(final S entity) {
        return cliente_i.save(entity);
    }
    

}
