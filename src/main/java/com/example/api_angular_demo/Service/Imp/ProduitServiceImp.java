package com.example.api_angular_demo.Service.Imp;

import com.example.api_angular_demo.Dto.ProduitDto;
import com.example.api_angular_demo.Model.Produit;
import com.example.api_angular_demo.Repository.ProduitRepository;
import com.example.api_angular_demo.Service.ProduitService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProduitServiceImp implements ProduitService {

    ProduitRepository produitRepository;


    @Override
    public ProduitDto AjouterProduit(ProduitDto produitDto) {
        Produit donnee = Produit.builder()
                .name(produitDto.getName())
                .checked(produitDto.getChecked())
                .price(produitDto.getPrice())
                .build();

        return ProduitDto.fromEntity(produitRepository.save(donnee));
    }

    @Override
    public ProduitDto ModifierProduit(Integer id, ProduitDto produitDto) {
        Produit mod = produitRepository.findById(id).orElseThrow();
        mod.setChecked(produitDto.getChecked());
        mod.setName(produitDto.getName());
        mod.setPrice(produitDto.getPrice());
        return ProduitDto.fromEntity(produitRepository.save(mod));
    }

    @Override
    public void SupprimerProduit(Integer id) {
        produitRepository.deleteById(id);
    }
}
