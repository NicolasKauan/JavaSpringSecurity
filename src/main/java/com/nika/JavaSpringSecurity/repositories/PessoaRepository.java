package com.nika.JavaSpringSecurity.repositories;

import com.nika.JavaSpringSecurity.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends  JpaRepository<PessoaModel,Long>{
}
