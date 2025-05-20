package com.app.api.service;

import com.app.api.model.Professor;
import com.app.api.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private PessoaFisicaRepository<Professor> professorRepository;

    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }
}