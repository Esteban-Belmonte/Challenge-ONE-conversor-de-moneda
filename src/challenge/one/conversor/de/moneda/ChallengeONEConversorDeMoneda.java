package challenge.one.conversor.de.moneda;

import challenge.one.conversor.de.moneda.model.Dolar;
import challenge.one.conversor.de.moneda.model.Euro;
import challenge.one.conversor.de.moneda.model.LibraEsterlina;
import challenge.one.conversor.de.moneda.model.PesoArgentino;
import challenge.one.conversor.de.moneda.model.WonSulCoreano;
import challenge.one.conversor.de.moneda.model.YenJapones;
import javax.swing.JOptionPane;


public class ChallengeONEConversorDeMoneda {

    
    public static void main(String[] args) {
        
       
       
        String[] monedas = {"De Dólares (USD) a Pesos Argentinos (ARS)", "De Dólares (USD) a Euro(EUR)", "De Dólares (USD) a Libra Esterlina (GBP)", "De Dólares (USD) a Yen Japones(JPY)","De Dólares a Won Surcoreano(KRW)",
            "De Pesos Argentinos (ARS) a Dólares (USD)", "De Pesos Argentinos (ARS) a Euro(EUR)","De Pesos Argentinos (ARS) a Libra Esterlina (GBP)", "De Pesos Argentinos (ARS) a Yen Japones(JPY)","De Pesos Argentinos (ARS) a Won Surcoreano(KRW)",
            "De Libra Esterlina (GBP) a Dólares (USD)", "De Libra Esterlina (GBP) a Pesos Argentinos (ARS)", "De Libra Esterlina (GBP) a Euro(EUR)","De Libra Esterlina (GBP) a Yen Japones(JPY)","De Libra Esterlina (GBP) a Won Surcoreano (KRW)",
            "De Euro (EUR) a Dólares (USD)","De Euro (EUR) a Pesos Argentinos (ARS)","De Euro (EUR) a Libra Esterlina (GBP)","De Euro (EUR) a Yen Japones (JPY)","De Euro (EUR) a Won Surcoreano (KRW)",
            "De Yen Japones(JPY) a Dólares (USD)","De Yen Japones(JPY) a Pesos Argentinos (ARS)", "De Yen Japones(JPY) a Euro(EUR)", "De Yen Japones(JPY) a Libra Esterlina (GBP)","De Yen Japones(JPY) a Won Surcoreano (KRW)",
            "De Won Surcoreano (KRW) a Dólares (USD)","De Won Surcoreano (KRW) a Pesos Argentinos (ARS)","De Won Surcoreano (KRW) a Euro(EUR)","De Won Surcoreano (KRW) a Libra Esterlina (GBP)","De Won Surcoreano (KRW) a Yen Japones(JPY)"
        };

        
        String opcionAConvertir = (String) JOptionPane.showInputDialog(null, "Seleccione la conversion que desea ralizar:",
                "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);

       
        String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir:",
                "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE);

        try {
            // Convertir la cantidad de String a double
            double cantidad = Double.parseDouble(cantidadStr);

            
           Dolar valorDolar =  new Dolar(cantidad);
           PesoArgentino valorPeso = new PesoArgentino(cantidad);
           LibraEsterlina valorLibra = new LibraEsterlina(cantidad);
           Euro valorEuro = new Euro(cantidad);
           WonSulCoreano valorWon = new WonSulCoreano(cantidad);
           YenJapones valorYen = new YenJapones(cantidad);
           double cantidadEnMonedaDestino = 0.0;
            
           switch (opcionAConvertir) {
                case "De Dólares (USD) a Pesos Argentinos (ARS)":
                 cantidadEnMonedaDestino = valorDolar.convertirAPesoArgentino(cantidad);
                  break;
                case "De Dólares (USD) a Euro(EUR)":
                    cantidadEnMonedaDestino = valorDolar.convertirAEuro(cantidad);
                    break;
                case "De Dólares (USD) a Libra Esterlina (GBP)":
                    cantidadEnMonedaDestino = valorDolar.convertirALibraEsterlina(cantidad);
                    break;
                case "De Dólares (USD) a Yen Japones(JPY)":
                    cantidadEnMonedaDestino = valorDolar.convertirAYenJapones(cantidad);
                    break;
                case "De Dólares a Won Surcoreano(KRW)":
                    cantidadEnMonedaDestino = valorDolar.convertirAWonSulcoreano(cantidad);
                    break;
                case "De Pesos Argentinos (ARS) a Dólares (USD)":
                    cantidadEnMonedaDestino = valorPeso.convertirADolar(cantidad);
                    break;
                case "De Pesos Argentinos (ARS) a Euro(EUR)":
                    cantidadEnMonedaDestino = valorPeso.convertirAEuro(cantidad);
                    break;
                case "De Pesos Argentinos (ARS) a Libra Esterlina (GBP)":
                    cantidadEnMonedaDestino = valorPeso.convertirALibraEsterlina(cantidad);
                    break;
                case "De Pesos Argentinos (ARS) a Yen Japones(JPY)":
                    cantidadEnMonedaDestino = valorPeso.convertirAYenJapones(cantidad);
                    break;
                case "De Pesos Argentinos (ARS) a Won Surcoreano(KRW)":
                    cantidadEnMonedaDestino = valorPeso.convertirAWonSulcoreano(cantidad);
                    break;
                case "De Libra Esterlina (GBP) a Dólares (USD)":
                    cantidadEnMonedaDestino = valorLibra.convertirADolar(cantidad);
                    break;
                case "De Libra Esterlina (GBP) a Pesos Argentinos (ARS)":
                    cantidadEnMonedaDestino = valorLibra.convertirAPesoArgentino(cantidad);
                    break;
                case "De Libra Esterlina (GBP) a Euro(EUR)":
                      cantidadEnMonedaDestino = valorLibra.convertirAEuro(cantidad);
                      break;
                case "De Libra Esterlina (GBP) a Yen Japones(JPY)":
                    cantidadEnMonedaDestino = valorLibra.convertirAYenJapones(cantidad);
                    break;
                case "De Libra Esterlina (GBP) a Won Surcoreano (KRW)":
                    cantidadEnMonedaDestino = valorLibra.convertirAWonSulcoreano(cantidad);
                    break;
                case "De Euro (EUR) a Dólares (USD)":
                     cantidadEnMonedaDestino = valorEuro.convertirADolar(cantidad);
                     break;
                case "De Euro (EUR) a Pesos Argentinos (ARS)":
                    cantidadEnMonedaDestino = valorEuro.convertirAPesoArgentino(cantidad);
                    break;
                case "De Euro (EUR) a Libra Esterlina (GBP)":
                    cantidadEnMonedaDestino = valorEuro.convertirALibraEsterlina(cantidad);
                    break;
                case "De Euro (EUR) a Yen Japones (JPY)":
                    cantidadEnMonedaDestino = valorEuro.convertirAYenJapones(cantidad);
                    break;
                case "De Euro (EUR) a Won Surcoreano (KRW)":
                    cantidadEnMonedaDestino = valorEuro.convertirAWonSulcoreano(cantidad);
                    break;
                case "De Yen Japones(JPY) a Dólares (USD)":
                    cantidadEnMonedaDestino = valorYen.convertirADolar(cantidad);
                    break;
                case "De Yen Japones(JPY) a Pesos Argentinos (ARS)":
                    cantidadEnMonedaDestino = valorYen.convertirAPesoArgentino(cantidad);
                    break;
                case "De Yen Japones(JPY) a Euro(EUR)":
                    cantidadEnMonedaDestino = valorYen.convertirAEuro(cantidad);
                    break;
                case "De Yen Japones(JPY) a Libra Esterlina (GBP)":
                    cantidadEnMonedaDestino = valorYen.convertirALibraEsterlina(cantidad);
                    break;
                case "De Yen Japones(JPY) a Won Surcoreano (KRW)":
                    cantidadEnMonedaDestino = valorYen.convertirAWonSulcoreano(cantidad);
                    break;
                case "De Won Surcoreano (KRW) a Dólares (USD)":
                    cantidadEnMonedaDestino = valorWon.convertirADolar(cantidad);
                    break;
                case "De Won Surcoreano (KRW) a Pesos Argentinos (ARS)":
                    cantidadEnMonedaDestino = valorWon.convertirAPesoArgentino(cantidad);
                    break;
                case "De Won Surcoreano (KRW) a Euro(EUR)":
                    cantidadEnMonedaDestino = valorWon.convertirAEuro(cantidad);
                    break;
                case "De Won Surcoreano (KRW) a Libra Esterlina (GBP)":
                    cantidadEnMonedaDestino = valorWon.convertirALibraEsterlina(cantidad);
                    break;
                case "De Won Surcoreano (KRW) a Yen Japones(JPY)":
                    cantidadEnMonedaDestino = valorWon.convertirAYenJapones(cantidad);
                    break;
            }
            
             // Mostrar el resultado de la conversión con JOptionPane.showMessageDialog
            String mensajeResultado = String.format("El valor de la conversión %s es: %.2f", opcionAConvertir, cantidadEnMonedaDestino);
            JOptionPane.showMessageDialog(null, mensajeResultado, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
           

        } catch (NumberFormatException e) {
            // Si el usuario ingresó una cantidad inválida, se maneja la excepción
            JOptionPane.showMessageDialog(null, "¡Error! Ingrese una cantidad válida.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
       
    }
