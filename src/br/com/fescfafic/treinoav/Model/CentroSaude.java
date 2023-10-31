package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.ICentroSaude;

public class CentroSaude implements ICentroSaude {
    protected String nome;
    protected int capacidadeArmazenamento;
    protected boolean temEquipamentoAdequado;
    @Override
    public String getNome() {
        return null;
    }
    @Override
    public void getCapacidadeArmazenamento() {

    }
    @Override
    public boolean temEquipamentoAdequado() {
        return false;
    }
}
