package com.example.api_angular_demo.Service;

import com.example.api_angular_demo.Dto.ProduitDto;

public interface ProduitService {

    ProduitDto AjouterProduit(ProduitDto produitDto);

    ProduitDto ModifierProduit(Integer id, ProduitDto produitDto);

    void SupprimerProduit(Integer id);
}
