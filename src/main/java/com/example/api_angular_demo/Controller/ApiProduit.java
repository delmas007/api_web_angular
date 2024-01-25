package com.example.api_angular_demo.Controller;

import com.example.api_angular_demo.Dto.ProduitDto;
import org.springframework.web.bind.annotation.*;

import static com.example.api_angular_demo.Utils.Constance.Api;

public interface ApiProduit {

    @PostMapping(value = Api+"ajouterProduit/{produitDto}")
    ProduitDto ApiAjouterProduit(@PathVariable ProduitDto produitDto);

    @PatchMapping(value = Api+"modifierProduit/{id}")
    ProduitDto ApiModifierProduit(@PathVariable Integer id,@RequestBody ProduitDto produitDto);

    @DeleteMapping(value = Api+"supprimerProduit/{id}")
    void SupprimerProduit(@PathVariable Integer id);


}
