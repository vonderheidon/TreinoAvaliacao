package br.com.fescfafic.treinoav.Main;

import br.com.fescfafic.treinoav.Model.Paciente;
import br.com.fescfafic.treinoav.Model.Vacina;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vacina vacina1 = new Vacina(
                "Influenza",
                LocalDate.of(2023,10,31),
                "300",
                5
        );
        Paciente paciente1 = new Paciente("Julio","12345678");
        Vacina vacina2 = new Vacina(
                "Febre Amarela",
                LocalDate.of(2023,10,31),
                "301",
                5
        );

        SistemaGestao sistemaGestao = new SistemaGestao(5,5,5);
        sistemaGestao.registrarAplicacao(paciente1,vacina1);
        sistemaGestao.registrarAplicacao(paciente1,vacina2);
        sistemaGestao.listarAplicacoes();
    }
}