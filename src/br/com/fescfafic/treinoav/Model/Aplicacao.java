package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.IAplicacao;

import java.time.LocalDate;

public class Aplicacao implements IAplicacao {
    protected Paciente paciente;
    protected Vacina vacina;
    protected LocalDate dataAplicacao;

    public Aplicacao(Paciente paciente, Vacina vacina, LocalDate dataAplicacao) {
        this.paciente = paciente;
        this.vacina = vacina;
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public Paciente getPaciente() {
        return this.paciente;
    }
    @Override
    public Vacina getVacina() {
        return this.vacina;
    }
    @Override
    public LocalDate getDataAplicacao() {
        return this.dataAplicacao;
    }
}
