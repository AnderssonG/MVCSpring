package com.floristeria.floristeria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.floristeria.Models.factura;
@Repository

public interface recFactura extends JpaRepository<factura, Integer > {

}
