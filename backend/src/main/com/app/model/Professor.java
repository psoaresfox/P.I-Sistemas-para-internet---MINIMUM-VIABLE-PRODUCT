package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Professor extends PessoaFisica {

    @NotBlank(message = "A formação acadêmica é obrigatória")
    private String formacaoAcademica;

    @NotBlank(message = "O cargo é obrigatório")
    private String cargo;

    @NotBlank(message = "O departamento é obrigatório")
    private String departamento;

    @NotBlank(message = "O código do curso é obrigatório")
    private String codigoCurso;

    private double salario;

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}