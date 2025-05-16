package com.example.nb.dto;

import com.example.nb.nb.Nb;

public record NbResponseDTO(Long id, String title, String image, Integer price ) {
    public NbResponseDTO(Nb nb) {
        this(nb.getId(),nb.getTitle(),nb.getImage(),nb.getPrice() );
    }
}
