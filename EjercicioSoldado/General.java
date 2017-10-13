/**
 * Clase del general, hija de la clase militar
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */
public class General extends Militar {
    
    /**
     * Metodo que devuelve los dias de vacaiones del general
     * @return: los dias de vacaciones
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    /**
     * Metodo que devuelve el color del formulario de vacaciones del general
     * @return: El color del formulario
     */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    
    /**
     * Metodo que imprime la oracion del general
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}
