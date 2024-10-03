package com.floristeria.floristeria.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.floristeria.floristeria.Models.flor;
import com.floristeria.floristeria.Repository.rep_flor;


@Service
public class florServ {

    private final rep_flor fs;
    
    public florServ(final rep_flor f){
        this.fs = f;
    }

    
    @Transactional
    public flor save(flor f) {
        return fs.save(f);
    }
    @Transactional

    public void delete(flor f){
        fs.delete(f);
    }

    @Transactional(readOnly=true)
    public List<flor> findAll() {
        return fs.findAll();
    }
    @Transactional(readOnly=true)
    public flor obtener(flor f){
        return fs.findById(f.getId()).orElse(null);
    }

    
    
}
