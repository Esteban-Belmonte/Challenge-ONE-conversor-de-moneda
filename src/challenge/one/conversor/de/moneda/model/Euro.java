
package challenge.one.conversor.de.moneda.model;


public class Euro extends Moneda {
    
    public Euro(double valorMoneda) {
        super(valorMoneda);
    }
    
   @Override
    public double convertirAPesoArgentino(double valorMoneda){
        return valorMoneda*381.10; 
    }
    
    @Override
   public double convertirALibraEsterlina(double valorMoneda){
        return valorMoneda*0.86;
    }
   
    @Override
   public double convertirAYenJapones(double valorMoneda){
        return valorMoneda*159.29;
    }
   
    @Override
   public double convertirAWonSulcoreano(double valorMoneda){
       return valorMoneda*1461.03;
   }
   
    @Override
   public double convertirADolar(double valorMoneda){
       return valorMoneda*1.09;
   }
}
