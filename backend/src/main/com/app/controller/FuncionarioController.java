package com.app.api.controller;

import com.app.api.dto.FuncionarioDTO;
import com.app.api.model.Funcionario;
import com.app.api.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Funcionario> cadastrar(@RequestBody FuncionarioDTO funcionarioDTO) {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(funcionarioDTO.getCpf());
        funcionario.setNomeCompleto(funcionarioDTO.getNomeCompleto());
        funcionario.setDataNascimento(funcionarioDTO.getDataNascimento());
        funcionario.setEndereco(funcionarioDTO.getEndereco());
        funcionario.setTelefone(funcionarioDTO.getTelefone());
        funcionario.setEmail(funcionarioDTO.getEmail());
        funcionario.setGrauEscolaridade(funcionarioDTO.getGrauEscolaridade());
        funcionario.setCargo(funcionarioDTO.getCargo());
        funcionario.setDepartamento(funcionarioDTO.getDepartamento());
        funcionario.setCodigoFuncao(funcionarioDTO.getCodigoFuncao());
        funcionario.setSalario(funcionarioDTO.getSalario());

        Funcionario novoFuncionario = funcionarioService.salvar(funcionario);
        return ResponseEntity.ok(novoFuncionario);
    }
}