/**
 * Clase del teniente, hija de la clase militar
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */
public class Teniente extends Militar {
    
    /**
     * Metodo que imprime la orden del coronel
     * @param texto: El nombre del coronel
     */
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }
}
