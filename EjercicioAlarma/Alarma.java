/**
 * Clase hija de Timbre
 * @author: Oscar Juarez - 17315
 * @version: 13.10317
 * POO
 */

public class Alarma extends Timbre {
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	public void m2() {
		super.m1();
	}
	 
	public String toString() {
		return super.toString() + "…" + super.toString();
	}
}
