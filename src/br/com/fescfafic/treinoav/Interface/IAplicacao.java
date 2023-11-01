package br.com.fescfafic.treinoav.Interface;

import java.time.LocalDate;

public interface IAplicacao {
    IPaciente getPaciente();
    IVacina getVacina();
    LocalDate getDataAplicacao();
}
