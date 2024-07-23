package com.example.demo.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentResponseDTO {

    private Long id;
    private String name;
    private String description;
    private String form;
    private int stocks;
    private Double cost;
    private boolean prescriptionRequired;
}
