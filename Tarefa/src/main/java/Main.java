import Model.TiposVisitante.VisitantePremium;
import Model.TiposVisitante.VisitanteComum;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Não entendi algumas coisas como public static final byte, mas implementei as funções necessarias, espero que esteja correto
        Date hoje = new Date();
        VisitantePremium VP = new VisitantePremium("Vinicius", "12345678910", hoje, 1);
        VisitanteComum VC =  new VisitanteComum("Henrique", "10987654321", hoje, 2);

        VP.VisitarTema(VP.codeTema);
        VP.ItensExpostos(VP.codeTema);
        VP.GastarDinheiro(50);
        VP.VerificarSaldo();
        VP.numeroVale = 30;
        VP.VerificaNumeroVale();
        VP.VisitarTema(2);
        System.out.println(VP.getTemasVisitados());
    }
}
