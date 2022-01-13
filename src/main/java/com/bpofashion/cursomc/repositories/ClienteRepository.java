package com.bpofashion.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bpofashion.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	//Busca um cliente passando um email como argumento
	//O proprio repository já faz o método internamente
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
}