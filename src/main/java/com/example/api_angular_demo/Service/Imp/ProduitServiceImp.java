package com.example.api_angular_demo.Service.Imp;

import com.example.api_angular_demo.Dto.ProduitDto;
import com.example.api_angular_demo.Model.Produit;
import com.example.api_angular_demo.Repository.ProduitRepository;
import com.example.api_angular_demo.Service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProduitServiceImp implements ProduitService {

    ProduitRepository produitRepository;


    public List<ProduitDto> getAllProduits() {
        List<Produit> produits = produitRepository.findAll();
        return produits.stream()
                .map(ProduitDto::fromEntity)
                .collect(Collectors.toList());
    }

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
    public List<ProduitDto> search(String name) {
        List<Produit> produits = produitRepository.searchByName(name);
        return produits.stream()
                .map(ProduitDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public ProduitDto ModifierProduit(Integer id, ProduitDto produitDto) {
        Produit mod = produitRepository.findById(id).orElseThrow();
        // Vérifiez si le champ "checked" dans le DTO n'est pas nul
        if (produitDto.getChecked() != null) {
            mod.setChecked(produitDto.getChecked());
        }

        // Vérifiez si le champ "name" dans le DTO n'est pas nul
        if (produitDto.getName() != null) {
            mod.setName(produitDto.getName());
        }

        // Vérifiez si le champ "price" dans le DTO n'est pas nul
        if (produitDto.getPrice() != null) {
            mod.setPrice(produitDto.getPrice());
        }
        return ProduitDto.fromEntity(produitRepository.save(mod));
    }

    @Override
    public void SupprimerProduit(Integer id) {
        produitRepository.deleteById(id);
    }
}
