package com.example.nb.controller;

import com.example.nb.dto.NbResponseDTO;
import com.example.nb.nb.Nb;
import com.example.nb.nb.NbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutosController {

    @Autowired
    private NbRepository repository;

    @GetMapping
    public List<NbResponseDTO> getAll(){

       List<NbResponseDTO> nbList = repository.findAll().stream().map(NbResponseDTO::new).toList();
       return nbList;
    }
}
