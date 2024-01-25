package com.example.api_angular_demo.Dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProduitDto {
    private Integer id ;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "checked")
    private Boolean checked;
}
