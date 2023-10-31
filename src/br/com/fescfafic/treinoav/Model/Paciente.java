package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.IPaciente;

public class Paciente implements IPaciente {
    protected String nome;
    protected String cpf;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public String getCpf() {
        return this.cpf;
    }
}
