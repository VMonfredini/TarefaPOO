package Model.TiposVisitante;

import Model.Visitante;

import java.util.Date;

public class VisitantePremium extends Visitante {


    public float saldo = 100;
    public int numeroVale;

    public VisitantePremium(String nome, String cpf, Date dataNascimento, int codeTema) {
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

    public void GastarDinheiro(float valor){
        this.saldo -= valor;
    }

    public void VerificarSaldo(){
        System.out.println(this.saldo);
    }

    public void VerificaNumeroVale(){
        System.out.println(this.numeroVale);
    }
}
