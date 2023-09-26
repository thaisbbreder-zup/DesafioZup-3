package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    //pessoa valida
    @Test
    public void pessoaValida() {
        Pessoa pessoa = new Pessoa(1, "Maria");
        assertTrue(pessoa.valido());
    }

    //nome vazio
    public void nomeVazio() {
        Pessoa pessoa = new Pessoa(1, "");
        assertFalse(pessoa.valido());
    }

    //nome valido
    @Test
    public void getNomeCorreto() {
        Pessoa pessoa = new Pessoa(1, "Maria");
        assertEquals("Maria", pessoa.getNome());
    }

    //set nome valido
    @Test
    public void setNomeValido() {
        Pessoa pessoa = new Pessoa(1, "Maria");
        pessoa.setNome("João");
        assertEquals("João", pessoa.getNome());
    }

    //id incorreto
    @Test
    public void idIncorreto() {
        Pessoa pessoa = new Pessoa(0, "Maria");
        assertFalse(pessoa.valido());
    }

    //id correto
    @Test
    public void getIdCorreto() {
        Pessoa pessoa = new Pessoa(1, "Maria");
        assertEquals(1, pessoa.getId());
    }

    //set id
    @Test
    public void setIdDeveSetarIdCorretamente() {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(2);
        assertEquals(2, pessoa.getId());
    }
}