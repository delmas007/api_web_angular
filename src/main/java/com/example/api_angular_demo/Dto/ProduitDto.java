package com.example.api_angular_demo.Dto;

import com.example.api_angular_demo.Model.Produit;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProduitDto {
    private Integer id ;

    private String name;

    private Integer price;

    private Boolean checked;

    public static ProduitDto fromEntity(Produit produit){
        if(produit==null){
            return  null;
        }
        return ProduitDto.builder()
                .id(produit.getId())
                .price(produit.getPrice())
                .name(produit.getName())
                .checked(produit.getChecked())
                .build();
    }

    public static Produit toEntity(ProduitDto produitDto){
        if(produitDto == null){
            return null;
        }
        return  Produit.builder()
                .name(produitDto.getName())
                .price(produitDto.getPrice())
                .checked(produitDto.getChecked())
                .build();
    }
}
