package com.app.api.controller;

import com.app.api.dto.ProfessorDTO;
import com.app.api.model.Professor;
import com.app.api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Professor> cadastrar(@RequestBody ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        professor.setCpf(professorDTO.getCpf());
        professor.setNomeCompleto(professorDTO.getNomeCompleto());
        professor.setDataNascimento(professorDTO.getDataNascimento());
        professor.setEndereco(professorDTO.getEndereco());
        professor.setTelefone(professorDTO.getTelefone());
        professor.setEmail(professorDTO.getEmail());
        professor.setFormacaoAcademica(professorDTO.getFormacaoAcademica());
        professor.setCargo(professorDTO.getCargo());
        professor.setDepartamento(professorDTO.getDepartamento());
        professor.setCodigoCurso(professorDTO.getCodigoCurso());
        professor.setSalario(professorDTO.getSalario());

        Professor novoProfessor = professorService.salvar(professor);
        return ResponseEntity.ok(novoProfessor);
    }
}