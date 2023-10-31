package br.com.fescfafic.treinoav.Exception;

public class VacinaVencidaException extends RuntimeException {
    public VacinaVencidaException() {
        super("Essa vacina esta vencida.");
    }
}
