package com.cursojava.aula37.test;

import com.cursojava.aula37.domain.Aluno;
import com.cursojava.aula37.domain.Pessoa;
import com.cursojava.aula37.domain.Professor;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno =  new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Jean");
        professor.setNome("Loiane");

        //Dessa forma não tem acesso as informações exclusivas do aluno
        Pessoa alunoPessoaSuperClasse = new Aluno();
    }
}