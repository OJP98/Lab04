/**
 * Clase principal en donde se imprimen los datos de cada clase
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */
public class Driver {

	public static void main (String[] args) {

		Militar militar = new Militar();
		System.out.println("Soy un militar!");
		System.out.println("El militar trabaja: " + militar.getHoras()+"" + " horas");
		System.out.println("Su salario es de: " + militar.getSalario()+"");
		System.out.println("Tiene " + militar.getDiasVacaciones()+"" +" dias de vacaiones");
		System.out.println("Su formulario es de color: " + militar.getFormularioVacaciones());
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Coronel coronel = new Coronel();
		System.out.println("Soy el coronel!");
		System.out.println("El coronel tiene un salario de: " + coronel.getSalario()+"");
		coronel.ejecutaOrdenManiobra();
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Teniente teniente = new Teniente();
		System.out.println("Soy el teniente!");
		teniente.tomaOrdenCoronel("Oscar");
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Soldado soldado = new Soldado();
		System.out.println("Soy el soldado!");
		System.out.println("El soldado trabaja: " + soldado.getHoras()+"" + " horas");
		System.out.println("Su salario es de: " + soldado.getSalario()+"");
		System.out.println("Tiene " + soldado.getDiasVacaciones()+"" +" dias de vacaiones");
		soldado.recibeOrden();
		System.out.println("___________________________________________________________________");
		System.out.println("");

		General general = new General();
		System.out.println("Soy el general!");
		System.out.println("La cantidad de vacaiones del general es de: " + general.getDiasVacaciones()+"" + " dias");
		System.out.println("Su formulario de vacaciones es de color: " + general.getFormularioVacaciones());
		general.planificaEstrategia();
		System.out.println("___________________________________________________________________");
		System.out.println("");

	}

}
