package com.empresa.funcionario;


public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;
    private double rendaTotal;
    private String nivelEscolaridade;
    private double comissao;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = rendaBasica;
        this.nivelEscolaridade = "Sem Escolaridade";
        this.comissao = 0;
    }

    public void concluirEnsinoBasico(String escola) {
        this.nivelEscolaridade = "Ensino Básico";
        this.rendaTotal += rendaTotal * 0.10;
    }

    public void concluirEnsinoMedio(String escola) {
        this.nivelEscolaridade = "Ensino Médio";
        this.rendaTotal += rendaTotal * 0.50;
    }

    public void concluirGraduacao(String universidade) {
        this.nivelEscolaridade = "Graduação";
        this.rendaTotal += rendaTotal * 1.00;
    }

    public void adicionarComissao(double comissao) {
        this.comissao = comissao;
        this.rendaTotal += comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + comissao + ", Salário Total: R$ " + rendaTotal;
    }
}







