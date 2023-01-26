package Model.TiposVisitante;

import Model.Visitante;

import java.util.Date;

public class VisitanteComum extends Visitante {


    public VisitanteComum(String nome, String cpf, Date dataNascimento, int codeTema) {
        super(nome, cpf, dataNascimento, codeTema);
    }

    @Override
    public void ItensExpostos(int codTema) {
        switch (codTema){
            case 1:
                System.out.println("135");
                break;
            case 2:
                System.out.println("300");
                break;
            case 3:
                System.out.println("67");
                break;
            case 4:
                System.out.println("72");
                break;
            case 5:
                System.out.println("46");
                break;
            default:
                System.out.println("Erro");
        }
    }

    @Override
    public void VisitarTema(int Tema) {
        switch (Tema){
            case 1:
                setTemasVisitados("Vintage");
                break;
            case 2:
                setTemasVisitados("Numismatica");
                break;
            case 3:
                setTemasVisitados("Historia da Musica");
                break;
            case 4:
                setTemasVisitados("Pintura");
                break;
            case 5:
                setTemasVisitados("Esculturas");
                break;
        }
    }
}
