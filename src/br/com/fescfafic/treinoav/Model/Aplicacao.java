package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.IAplicacao;
import br.com.fescfafic.treinoav.Interface.IPaciente;
import br.com.fescfafic.treinoav.Interface.IVacina;

import java.time.LocalDate;

public class Aplicacao implements IAplicacao {
    protected IPaciente paciente;
    protected IVacina vacina;
    protected LocalDate dataAplicacao;

    public Aplicacao(IPaciente paciente, IVacina vacina, LocalDate dataAplicacao) {
        this.paciente = paciente;
        this.vacina = vacina;
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public IPaciente getPaciente() {
        return this.paciente;
    }
    @Override
    public IVacina getVacina() {
        return this.vacina;
    }
    @Override
    public LocalDate getDataAplicacao() {
        return this.dataAplicacao;
    }
}
