package com.app.api.service;

import com.exemplo.api.model.PessoaFisica;
import com.exemplo.api.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private PessoaFisicaRepository<PessoaFisica> pessoaFisicaRepository;

    public boolean login(String email, String senha) {
        Optional<PessoaFisica> pessoaFisica = pessoaFisicaRepository.findByEmail(email);
        return pessoaFisica.isPresent() && pessoaFisica.get().getSenha().equals(senha);
    }
}