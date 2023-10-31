package br.com.fescfafic.treinoav.Exception;

public class VacinaVencidaException extends RuntimeException {
    public VacinaVencidaException() {
        super("Vacina vencida.");
    }
}
