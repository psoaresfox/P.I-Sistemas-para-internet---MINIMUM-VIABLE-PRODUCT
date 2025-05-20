package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Funcionario extends PessoaFisica {

    @NotBlank(message = "O grau de escolaridade é obrigatório")
    private String grauEscolaridade;

    @NotBlank(message = "O cargo é obrigatório")
    private String cargo;

    @NotBlank(message = "O departamento é obrigatório")
    private String departamento;

    @NotBlank(message = "O código da função é obrigatório")
    private String codigoFuncao;

    private double salario;

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
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

    public String getCodigoFuncao() {
        return codigoFuncao;
    }

    public void setCodigoFuncao(String codigoFuncao) {
        this.codigoFuncao = codigoFuncao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}