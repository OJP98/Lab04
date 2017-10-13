/**
 * Clase que define los metodos requeridos del programa
 * @author: Oscar Juarez - 17315
 * @version: 13.10317
 * POO
 */

public class AlarmaEmergencia extends Alarma {	

	public AlarmaEmergencia(){}

	public void m1(){
		System.out.println("Emergencia 1");
	}

	public void m2(){
		System.out.println("alarma 1 / timbre 1");
	}

	public String toString() {
		return "Emergencia " + super.toString();
	}


	
}