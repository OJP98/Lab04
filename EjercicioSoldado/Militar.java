/**
 * Clase del militar, es la clase padre
 * @author: Oscar Juarez - 17315
 * @version: 13.10.17
 * POO
 */
public class Militar {
    
    /**
     * Metodo que devuelve las horas del militar
     * @return: las horas del militar
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    
    /**
     * Metodo que devuelve el salario del militar
     * @return: el salario del militar
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    /**
     * Metodo que devuelve los dias de vacaciones del militar
     * @return: las horas del militar
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    /**
     * Metodo que devuelve el color del formulario del Militar
     * @return: El color del formulario
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}
