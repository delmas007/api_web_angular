package com.example.api_angular_demo.Repository;

import com.example.api_angular_demo.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    Optional<Produit> findById(String id);


    List<Produit> findAllById(String id);
}
