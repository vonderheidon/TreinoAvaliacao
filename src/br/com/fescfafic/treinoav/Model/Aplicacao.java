package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.IAplicacao;

import java.time.LocalDate;

public class Aplicacao implements IAplicacao {
    protected LocalDate dataAplicacao;

    @Override
    public Paciente getPaciente() {
        return null;
    }
    @Override
    public Vacina getVacina() {
        return null;
    }
    @Override
    public LocalDate getDataAplicacao() {
        return null;
    }
}
