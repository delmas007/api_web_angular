package com.example.api_angular_demo.Service;

import com.example.api_angular_demo.Dto.ProduitDto;
import com.example.api_angular_demo.Model.Produit;

import java.util.List;

public interface ProduitService {

    List<ProduitDto> getAllProduits();

    ProduitDto AjouterProduit(ProduitDto produitDto);

    List<ProduitDto> search(String name);

    ProduitDto ModifierProduit(Integer id, ProduitDto produitDto);

    void SupprimerProduit(Integer id);
}
