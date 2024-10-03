package com.floristeria.floristeria.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.floristeria.Models.flor;

@Repository

public interface rep_flor extends JpaRepository<flor,Integer> {
    Optional<flor> findBytipo(String tipo);


}
