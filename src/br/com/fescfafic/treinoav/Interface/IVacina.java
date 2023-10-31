package br.com.fescfafic.treinoav.Interface;

import java.time.LocalDate;

public interface IVacina {
    String getTipo();
    LocalDate getDataValidade();
    String getLote();
    boolean estaVencida();
}
