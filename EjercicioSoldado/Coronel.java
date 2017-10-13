/**
 * Clase del coronel, hija de la clase Teniente
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */
public class Coronel extends Teniente {
    
    /**
     * Metodo que devuelve el salario del coronel
     * @return: El salario del coronel
     */
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    /**
     * Imprime la frase del coronel
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
