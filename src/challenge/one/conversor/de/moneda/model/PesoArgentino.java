
package challenge.one.conversor.de.moneda.model;


public class PesoArgentino extends Moneda {
    
    public PesoArgentino(double valorMoneda) {
        super(valorMoneda);
    }
    
    @Override
    public double convertirAEuro(double valorMoneda){
        return valorMoneda*0.0033;
    }
    
    @Override
   public double convertirALibraEsterlina(double valorMoneda){
        return valorMoneda*0.0029;
    }
   
    @Override
   public double convertirAYenJapones(double valorMoneda){
        return valorMoneda*0.52;
    }
   
    @Override
   public double convertirAWonSulcoreano(double valorMoneda){
       return valorMoneda*4.70;
   }
   
    @Override
   public double convertirADolar(double valorMoneda){
       return valorMoneda*0.0037;
   }
    
}
