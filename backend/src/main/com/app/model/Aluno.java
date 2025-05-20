package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Aluno extends PessoaFisica {

    @NotBlank(message = "O código de matrícula é obrigatório")
    private String codMatricula;

    @NotBlank(message = "O curso é obrigatório")
    private String curso;

    @NotBlank(message = "O semestre/ano é obrigatório")
    private String semestreAno;

    @NotBlank(message = "O período é obrigatório")
    private String periodo;

    @NotBlank(message = "A situação é obrigatória")
    private String situacao;

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestreAno() {
        return semestreAno;
    }

    public void setSemestreAno(String semestreAno) {
        this.semestreAno = semestreAno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}