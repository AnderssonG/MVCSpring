package com.floristeria.floristeria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floristeria.floristeria.Models.fP;
@Repository

public interface repfp extends JpaRepository<fP, Integer> {

}