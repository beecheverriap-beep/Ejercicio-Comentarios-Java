/**
 * Representa a un alumno matriculado en la institución educativa,
 * almacenando su información básica y permitiendo consultar su desempeño académico.
 */
public class Estudiante {

    private String nombre;
    private String rut;

    /**
     * Crea una nueva instancia de un Estudiante.
     *
     * @param nombre nombre completo del estudiante
     * @param rut número de identificación única o RUT del estudiante
     */
    public Estudiante(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    /**
     * Evalúa y determina si la nota final entregada es suficiente para que el estudiante
     * apruebe la asignatura.
     *
     * @param notaFinal calificación obtenida por el estudiante (escala de 1.0 a 7.0)
     * @return true si la nota es mayor o igual a 4.0; false en caso contrario
     */
    public boolean estaAprobado(double notaFinal) {
        return notaFinal >= 4.0;
    }

    // Métodos Getter y Setter (opcionales)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}