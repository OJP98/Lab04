/**
 * Clase que define los metodos requeridos del programa
 * @author: Oscar Juarez - 17315
 * @version: 13.10317
 * POO
 */

public class AlarmaEmergencia extends Alarma {	

        /**
         * Constructor de la clase
         */
	public AlarmaEmergencia(){}

        
        /**
         * Metodo que imprime una frase
         */
	public void m1(){
		System.out.println("Emergencia 1");
	}

        /**
         * Metodo que imprime
         */
	public void m2(){
		System.out.println("alarma 1 / timbre 1");
	}

        /**
         * Metodo que crea el String de la clase
         * @return: El string de la clase
         */
	public String toString() {
		return "Emergencia " + super.toString();
	}


	
}