public class Estudiante {
    /**
     * Representa un registro de un Estudiante
     */
    private String nombre;
    private int edad;

    /**
     * Determina si el estudiante aprueba segun su nota final
     * @param notaFinal nota obtenidad por el estudiante
     * @return true si la nota final es igual o superior a 4.0
     */

    public boolean estaAprobado(double notaFinal){
        return notaFinal>= 4.0;
    }
}
