package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.IVacina;

import java.time.LocalDate;

public class Vacina implements IVacina {
    protected String tipo;
    protected LocalDate dataValidade;
    protected String lote;
    protected int quantidade;

    @Override
    public String getTipo() {
        return null;
    }
    @Override
    public LocalDate getDataValidade() {
        return null;
    }
    @Override
    public String getLote() {
        return null;
    }
    @Override
    public boolean estaVencida() {
        return false;
    }

}
