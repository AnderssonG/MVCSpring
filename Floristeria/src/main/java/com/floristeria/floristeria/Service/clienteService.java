package com.floristeria.floristeria.Service;
import com.floristeria.floristeria.Models.cliente;
import com.floristeria.floristeria.Repository.cliente_interface;

import java.util.List;

import org.springframework.stereotype.Service;

@Service


public class clienteService {
    private final cliente_interface cliente_i;

    public clienteService(cliente_interface cliente_i) {
        this.cliente_i = cliente_i;
    }

    public List<cliente> findAll() {
        return cliente_i.findAll();
    }

    public <S extends cliente> S save(S entity) {
        return cliente_i.save(entity);
    }

    

    

    

}
