package com.app.api.repository;

import com.app.api.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaFisicaRepository<T extends PessoaFisica> extends JpaRepository<T, Long> {
    Optional<T> findByEmail(String email);
}