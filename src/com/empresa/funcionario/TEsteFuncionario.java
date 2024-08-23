package com.empresa.funcionario;

public class TEsteFuncionario {
        public static void main(String[] args) {
            Funcionario[] funcionarios = new Funcionario[10];

            //  ensino básico
            for (int i = 0; i < 4; i++) {
                funcionarios[i] = new Funcionario("Funcionario" + (i+1), 100 + i);
                funcionarios[i].concluirEnsinoBasico("Escola Básica");
            }

            //  ensino médio
            for (int i = 4; i < 8; i++) {
                funcionarios[i] = new Funcionario("Funcionario" + (i+1), 100 + i);
                funcionarios[i].concluirEnsinoMedio("Escola Médio");
            }

            // graduação
            for (int i = 8; i < 10; i++) {
                funcionarios[i] = new Funcionario("Funcionario" + (i+1), 100 + i);
                funcionarios[i].concluirGraduacao("Universidade");
            }

            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
}

