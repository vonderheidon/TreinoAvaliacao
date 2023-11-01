package br.com.fescfafic.treinoav.Main;

import br.com.fescfafic.treinoav.Interface.IAplicacao;
import br.com.fescfafic.treinoav.Interface.ICentroSaude;
import br.com.fescfafic.treinoav.Interface.IPaciente;
import br.com.fescfafic.treinoav.Interface.IVacina;
import br.com.fescfafic.treinoav.Model.Aplicacao;
import br.com.fescfafic.treinoav.Model.CentroSaude;
import br.com.fescfafic.treinoav.Model.Paciente;
import br.com.fescfafic.treinoav.Model.Vacina;

import java.time.LocalDate;

public class SistemaGestao {
    protected IVacina[] vetorVacinas;
    protected ICentroSaude[] vetorCentrosSaude;
    protected IAplicacao[] vetorAplicacoes;
    protected int controle = 0;

    public SistemaGestao(int qtdVacinas, int qtdCentrosSaude, int qtdAplicacoes) {
        this.vetorVacinas = new IVacina[qtdVacinas];
        this.vetorCentrosSaude = new ICentroSaude[qtdCentrosSaude];
        this.vetorAplicacoes = new IAplicacao[qtdAplicacoes];
    }

    public void registrarAplicacao(IPaciente paciente, IVacina vacina) {
        if (this.controle <= this.vetorAplicacoes.length) {
            Aplicacao aplicacao = new Aplicacao(paciente, vacina, LocalDate.now());
            vetorAplicacoes[controle] = aplicacao;
            controle++;
        } else {
            System.out.println("Fichas esgotadas.");
        }
    }
    public void listarAplicacoes() {
        for (int i = 0; i < this.vetorAplicacoes.length; i++) {
            if (this.vetorAplicacoes[i] != null) {
                System.out.println(this.vetorAplicacoes[i].getVacina().getTipo());
            }
        }
    }
}
