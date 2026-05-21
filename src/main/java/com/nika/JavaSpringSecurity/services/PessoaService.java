package com.nika.JavaSpringSecurity.services;

import com.nika.JavaSpringSecurity.model.PessoaModel;
import com.nika.JavaSpringSecurity.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

   private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<PessoaModel> listar(){
        return pessoaRepository.findAll();
    }

    public PessoaModel criar(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }

}
