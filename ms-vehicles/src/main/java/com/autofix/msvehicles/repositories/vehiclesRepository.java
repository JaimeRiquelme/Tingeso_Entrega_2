package com.autofix.msvehicles.repositories;

import com.autofix.msvehicles.entities.vehiclesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface vehiclesRepository extends JpaRepository<vehiclesEntity, Long> {

}
