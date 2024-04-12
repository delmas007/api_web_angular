package com.example.api_angular_demo.Repository;

import com.example.api_angular_demo.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    Optional<Produit> findById(Integer id);

    @Query("SELECT p FROM Produit p WHERE LOWER(p.name) LIKE %:name%")
    List<Produit> searchByName(String name);


    List<Produit> findAll();

    Optional<Produit> findById(int id);

}
