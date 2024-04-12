package com.example.api_angular_demo.Controller;

import com.example.api_angular_demo.Dto.ProduitDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.api_angular_demo.Utils.Constance.Api;

public interface ApiProduit {

    @PostMapping(value = Api+"ajouterProduit")
    ProduitDto ApiAjouterProduit(@RequestBody ProduitDto produitDto);

    @GetMapping(value = Api+"search/{name}")
    List<ProduitDto> ApiRechercherProduit(@PathVariable(name = "name") String name);

    @PatchMapping(value = Api+"modifierProduit/{id}")
    ProduitDto ApiModifierProduit(@PathVariable Integer id,@RequestBody ProduitDto produitDto);

    @DeleteMapping(value = Api+"supprimerProduit/{id}")
    void SupprimerProduit(@PathVariable Integer id);

    @GetMapping(value = Api+"produits")
    List<ProduitDto> Produit();

    @GetMapping(value = Api+"produit/{id}")
    ProduitDto getProduitById(@PathVariable Integer id);


}
