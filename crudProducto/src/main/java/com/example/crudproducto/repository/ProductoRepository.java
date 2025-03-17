package com.example.crudproducto.repository;

import com.example.crudproducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

//Este seria el DAO

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    Optional<Producto> findByPriceLessThan(Producto producto);
}
