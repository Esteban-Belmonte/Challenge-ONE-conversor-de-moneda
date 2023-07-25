
package challenge.one.conversor.de.moneda.model;


public class Dolar extends Moneda {
    
    public Dolar(double valorMoneda) {
        super(valorMoneda);
    }
    
    
    @Override
    public double convertirAPesoArgentino(double valorMoneda){
         return valorMoneda*271.61;
    }
    
    @Override
    public double convertirAEuro(double valorMoneda){
        return valorMoneda*0.90;
    }
    
    @Override
    public double convertirALibraEsterlina(double valorMoneda){
        return valorMoneda*0.78;
    }
    
    @Override
    public double convertirAYenJapones(double valorMoneda){
        return valorMoneda*140.94;
    }
    
    @Override
    public double convertirAWonSulcoreano(double valorMoneda){
       return valorMoneda*1276.66;
   }
    
    
}
