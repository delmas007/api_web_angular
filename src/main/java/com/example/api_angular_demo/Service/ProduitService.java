package com.example.api_angular_demo.Service;

import com.example.api_angular_demo.Dto.ProduitDto;

public interface ProduitService {

    ProduitDto AjouterProduit(ProduitDto produitDto);

    ProduitDto ModifierProduit(String id,ProduitDto produitDto);

    ProduitDto MajProduit(String id,ProduitDto produitDto);

    void SupprimerProduit(String id);
}
