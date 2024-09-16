package com.floristeria.floristeria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.floristeria.Models.cliente;

@Repository


public interface cliente_interface extends JpaRepository<cliente, Long>{

}
