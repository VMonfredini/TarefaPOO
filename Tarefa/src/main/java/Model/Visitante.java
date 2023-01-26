package Model;

import Services.VisitanteServices;

import java.util.Date;

public abstract class Visitante implements VisitanteServices {

    public String nome;
    public String cpf;
    public Date dataNascimento;
    public int codeTema;

    private String TemasVisitados = "";

    public Visitante(String nome, String cpf, Date dataNascimento, int codeTema) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.codeTema = codeTema;
    }

    public String getTemasVisitados() {
        return TemasVisitados;
    }

    public void setTemasVisitados(String temasVisitados) {
        this.TemasVisitados = this.TemasVisitados + " " + temasVisitados;
    }

    public static final byte Vintage = 1;
    public static final byte Numismatica = 2;
    public static final byte HistoriaDaMusica = 3;
    public static final byte Pinturas = 4;
    public static final byte Esculturas = 5;
}
