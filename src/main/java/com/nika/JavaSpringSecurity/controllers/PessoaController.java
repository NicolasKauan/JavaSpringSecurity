package com.nika.JavaSpringSecurity.controllers;

import com.nika.JavaSpringSecurity.model.PessoaModel;
import com.nika.JavaSpringSecurity.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaModel> criar(@RequestBody PessoaModel pessoaModel){
        PessoaModel salvo = pessoaService.criar(pessoaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public ResponseEntity<List<PessoaModel>> listar(){
        List<PessoaModel> produtos = pessoaService.listar();
        return ResponseEntity.ok(produtos);
    }

}
