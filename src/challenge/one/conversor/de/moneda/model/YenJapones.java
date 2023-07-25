package challenge.one.conversor.de.moneda.model;


public class YenJapones extends Moneda {
    
    public YenJapones(double valorMoneda) {
        super(valorMoneda);
    }
    
    @Override
    public double convertirAPesoArgentino(double valorMoneda){
        return valorMoneda*1.93; 
    }
    
    @Override
    public double convertirAEuro(double valorMoneda){
        return valorMoneda*0.0064;
    }
    
    @Override
   public double convertirALibraEsterlina(double valorMoneda){
        return valorMoneda*0.0055;
    }
   
   
    @Override
   public double convertirAWonSulcoreano(double valorMoneda){
       return valorMoneda*9.06;
   }
   
    @Override
   public double convertirADolar(double valorMoneda){
       return valorMoneda*0.0071;
   }
    
    
}
