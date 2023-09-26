package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TurmaTest {

    //adicionar pessoa válida
    @Test
    public void adicionarPessoaValida() {
        Turma turma = new Turma();
        Pessoa pessoa = new Pessoa(1, "Maria");

        try {
            turma.adicionarPessoa(pessoa);
            assertEquals(1, turma.getPessoas().size());
        } catch (Exception e) {
            fail("Excecao inesperada: " + e.getMessage());
        }
    }

    //adicionar pessoa inválida
    @Test
    public void adicionarPessoaInvalida() {
        Turma turma = new Turma();
        Pessoa pessoa = new Pessoa();

        try {
            turma.adicionarPessoa(pessoa);
        } catch (Exception e) {
            assertEquals("Objeto pessoa inválido", e.getMessage());
        }
    }

    //adicionar pessoa duplicada
    @Test
    public void adicionarPessoaDuplicada() {
        Turma turma = new Turma();
        Pessoa pessoa1 = new Pessoa(1, "Maria");
        Pessoa pessoa2 = new Pessoa(1, "Maria");

        try {
            turma.adicionarPessoa(pessoa1);
            turma.adicionarPessoa(pessoa2);
        } catch (Exception e) {
            assertEquals("Objeto pessoa já está atribuido a turma", e.getMessage());
        }
    }

    //remover pessoa
    @Test
    public void removerTodasAsPessoas() {
        Turma turma = new Turma();
        Pessoa pessoa1 = new Pessoa(1, "Maria");
        Pessoa pessoa2 = new Pessoa(2, "Joao");

        try {
            turma.adicionarPessoa(pessoa1);
            assertEquals(1, turma.getPessoas().size());

            turma.adicionarPessoa(pessoa2);
            assertEquals(2, turma.getPessoas().size());

            turma.removerTodasPessoas();
            assertEquals(0, turma.getPessoas().size());
        } catch (Exception e) {
            fail("Excecao inesperada: " + e.getMessage());
        }
    }
}