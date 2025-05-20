package com.app.api.controller;

import com.app.api.dto.AlunoDTO;
import com.app.api.model.Aluno;
import com.app.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Aluno> cadastrar(@RequestBody AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setNomeCompleto(alunoDTO.getNomeCompleto());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        aluno.setEndereco(alunoDTO.getEndereco());
        aluno.setTelefone(alunoDTO.getTelefone());
        aluno.setEmail(alunoDTO.getEmail());
        aluno.setCodMatricula(alunoDTO.getCodMatricula());
        aluno.setCurso(alunoDTO.getCurso());
        aluno.setSemestreAno(alunoDTO.getSemestreAno());
        aluno.setPeriodo(alunoDTO.getPeriodo());
        aluno.setSituacao(alunoDTO.getSituacao());
        aluno.setSenha(alunoDTO.getSenha());

        Aluno novoAluno = alunoService.salvar(aluno);
        return ResponseEntity.ok(novoAluno);
    }
}