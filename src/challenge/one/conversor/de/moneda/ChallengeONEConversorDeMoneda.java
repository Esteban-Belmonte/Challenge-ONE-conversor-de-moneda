package challenge.one.conversor.de.moneda;

import challenge.one.conversor.de.moneda.model.Dolar;


public class ChallengeONEConversorDeMoneda {

    
    public static void main(String[] args) {
        
       Dolar valorPrueba = new Dolar(22.54);
        
       //valorPrueba.convertirAEuro(valorPrueba.getValorMoneda());
       
       System.out.println(valorPrueba.convertirAEuro(valorPrueba.getValorMoneda()));
    }
    
}
