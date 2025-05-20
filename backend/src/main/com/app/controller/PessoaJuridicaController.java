package com.app.api.controller;

import com.app.api.dto.PessoaJuridicaDTO;
import com.app.api.model.PessoaJuridica;
import com.app.api.service.PessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoasjuridicas")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaService pessoaJuridicaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<PessoaJuridica> cadastrar(@RequestBody PessoaJuridicaDTO pessoaJuridicaDTO) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj(pessoaJuridicaDTO.getCnpj());
        pessoaJuridica.setRazaoSocial(pessoaJuridicaDTO.getRazaoSocial());
        pessoaJuridica.setEndereco(pessoaJuridicaDTO.getEndereco());
        pessoaJuridica.setContatoResponsavel(pessoaJuridicaDTO.getContatoResponsavel());
        pessoaJuridica.setTelefone(pessoaJuridicaDTO.getTelefone());
        pessoaJuridica.setEmail(pessoaJuridicaDTO.getEmail());

        PessoaJuridica novaPessoaJuridica = pessoaJuridicaService.salvar(pessoaJuridica);
        return ResponseEntity.ok(novaPessoaJuridica);
    }
}