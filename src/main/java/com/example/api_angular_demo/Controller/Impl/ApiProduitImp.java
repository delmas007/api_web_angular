package com.example.api_angular_demo.Controller.Impl;

import com.example.api_angular_demo.Controller.ApiProduit;
import com.example.api_angular_demo.Dto.ProduitDto;
import com.example.api_angular_demo.Service.Imp.ProduitServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ApiProduitImp implements ApiProduit {

    ProduitServiceImp produitServiceImp;
    @Override
    public ProduitDto ApiAjouterProduit(ProduitDto produitDto) {

        return produitServiceImp.AjouterProduit(produitDto);
    }

    @Override
    public ProduitDto ApiModifierProduit(Integer id, ProduitDto produitDto) {

        return produitServiceImp.ModifierProduit(id, produitDto);
    }

    @Override
    public void SupprimerProduit(Integer id) {
        produitServiceImp.SupprimerProduit(id);

    }

    @Override
    public List<ProduitDto> Produit() {
        return produitServiceImp.getAllProduits();
    }
}
