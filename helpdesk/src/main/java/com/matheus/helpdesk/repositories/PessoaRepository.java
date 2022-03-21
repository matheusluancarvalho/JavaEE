package com.matheus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
