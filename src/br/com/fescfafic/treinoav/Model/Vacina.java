package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Exception.VacinaVencidaException;
import br.com.fescfafic.treinoav.Interface.IVacina;

import java.time.LocalDate;

public class Vacina implements IVacina {
    protected String tipo;
    protected LocalDate dataValidade;
    protected String lote;
    protected int quantidade;

    public Vacina(String tipo, LocalDate dataValidade, String lote, int quantidade) {
        this.tipo = tipo;
        this.dataValidade = dataValidade;
        this.lote = lote;
        this.quantidade = quantidade;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
    @Override
    public LocalDate getDataValidade() {
        return this.dataValidade;
    }
    @Override
    public String getLote() {
        return this.lote;
    }
    @Override
    public boolean estaVencida() {
        try {
            if (this.dataValidade.isBefore(LocalDate.now()) || this.dataValidade.isEqual(LocalDate.now())) {
                throw new VacinaVencidaException();
            }
        } catch (VacinaVencidaException e) {
            System.err.println(e);
            return true;
        }
        System.out.println("Essa vacina nao esta vencida.");
        return false;
    }
}
