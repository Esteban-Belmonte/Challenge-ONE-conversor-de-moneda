package challenge.one.conversor.de.moneda.model;


public class LibraEsterlina extends Moneda {
    
    public LibraEsterlina(double valorMoneda) {
        super(valorMoneda);
    }
    
    @Override
    public double convertirAPesoArgentino(double valorMoneda){
        return valorMoneda*350.47; 
    }
    
    @Override
    public double convertirAEuro(double valorMoneda){
        return valorMoneda*1.17;
    }
     
    @Override
   public double convertirAYenJapones(double valorMoneda){
        return valorMoneda*181.88;
    }
   
    @Override
   public double convertirAWonSulcoreano(double valorMoneda){
       return valorMoneda*1647.02;
   }
   
    @Override
   public double convertirADolar(double valorMoneda){
       return valorMoneda*1.29;
   }
   
}
