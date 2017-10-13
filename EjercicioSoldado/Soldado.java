/**
 * Clase del soldado, hija de la clase militar
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */

public class Soldado extends Militar {

    /**
     * Metodo que devuelve las horas del soldado
     * @return: las horas del soldado
     */
	public int getHoras(){
            return super.getHoras()*2;
	}

        /**
         * Metodo que retorna el salario del soldado
         * @return: el soldado
         */
	public double getSalario() {
        return super.getSalario()-10000;
    }

    /**
     * Metodo que retorna los dias de vacaciones del soldado
     * @return: Los dias de vacaiones
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones()-5;
    }

    /**
     * Metodo que imprime una frase del soldado
     */
    public void recibeOrden () {
        System.out.println("Ordene mi General");
    }
}
