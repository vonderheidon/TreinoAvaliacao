package br.com.fescfafic.treinoav.Model;

import br.com.fescfafic.treinoav.Interface.ICentroSaude;

public class CentroSaude implements ICentroSaude {
    protected String nome;
    protected int capacidadeArmazenamento;
    protected boolean temEquipamentoAdequado;

    public CentroSaude(String nome, int capacidadeArmazenamento, boolean temEquipamentoAdequado) {
        this.nome = nome;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.temEquipamentoAdequado = temEquipamentoAdequado;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public int getCapacidadeArmazenamento() {
        return this.capacidadeArmazenamento;
    }
    @Override
    public boolean temEquipamentoAdequado() {
        return this.temEquipamentoAdequado;
    }
}
