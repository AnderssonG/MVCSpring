package com.floristeria.floristeria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.floristeria.Models.pedido;
@Repository

public interface repPedido extends JpaRepository<pedido, Integer> {

}
