package br.com.fescfafic.treinoav.Main;

import br.com.fescfafic.treinoav.Interface.IAplicacao;
import br.com.fescfafic.treinoav.Interface.ICentroSaude;
import br.com.fescfafic.treinoav.Interface.IPaciente;
import br.com.fescfafic.treinoav.Interface.IVacina;
import br.com.fescfafic.treinoav.Model.Aplicacao;
import br.com.fescfafic.treinoav.Model.CentroSaude;
import br.com.fescfafic.treinoav.Model.Vacina;

public class SistemaGestao {
    public IVacina[] vetorVacinas;
    public ICentroSaude[] vetorCentrosSaude;
    public IAplicacao[] vetorAplicacoes;

    public SistemaGestao(int qtdVacinas, int qtdCentrosSaude, int qtdAplicacoes) {
        this.vetorVacinas = new IVacina[qtdVacinas];
        this.vetorCentrosSaude = new ICentroSaude[qtdCentrosSaude];
        this.vetorAplicacoes = new IAplicacao[qtdAplicacoes];
    }

    public void registrarAplicacao(IPaciente paciente, IVacina vacina) {

    }
}
