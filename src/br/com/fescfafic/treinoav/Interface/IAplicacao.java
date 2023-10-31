package br.com.fescfafic.treinoav.Interface;

import br.com.fescfafic.treinoav.Model.Paciente;
import br.com.fescfafic.treinoav.Model.Vacina;

import java.time.LocalDate;

public interface IAplicacao {
    Paciente getPaciente();
    Vacina getVacina();
    LocalDate getDataAplicacao();
}
