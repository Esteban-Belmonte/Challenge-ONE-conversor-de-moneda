package challenge.one.conversor.de.moneda.model;


public class WonSulCoreano extends Moneda{
    
    public WonSulCoreano(double valorMoneda) {
        super(valorMoneda);
    }
    
    @Override
    public double convertirAPesoArgentino(double valorMoneda){
        return valorMoneda*0.21; 
    }
    
    @Override
    public double convertirAEuro(double valorMoneda){
        return valorMoneda*0.00071;
    }
    
    @Override
   public double convertirALibraEsterlina(double valorMoneda){
        return valorMoneda*0.00061;
    }
   
    @Override
   public double convertirAYenJapones(double valorMoneda){
        return valorMoneda*0.11;
    }
   
   
    @Override
   public double convertirADolar(double valorMoneda){
       return valorMoneda*0.00078;
   }
    
    
}
