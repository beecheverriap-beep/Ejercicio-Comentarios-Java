/**
 * Proporciona utilidades para el procesamiento, cálculo de promedios
 * y evaluación del rendimiento académico de las calificaciones de un estudiante.
 */
public class CalculadorNotas {

    /**
     * Calcula la media aritmética a partir de tres calificaciones individuales.
     *
     * @param nota1 primera calificación parcial obtenida
     * @param nota2 segunda calificación parcial obtenida
     * @param nota3 tercera calificación parcial obtenida
     * @return el promedio ponderado en partes iguales de las tres notas
     */



    public double calcularPromedio(double nota1, double nota2, double nota3) {
        // Las tres evaluaciones tienen la misma ponderación.
        return  (nota1 + nota2 + nota3) / 3.0;
    }

    /**
     * Determina si el promedio académico alcanzado cumple con el estándar de aprobación.
     *
     * @param promedio promedio de notas obtenido por el estudiante
     * @return true si el promedio alcanza o supera la nota mínima de aprobación; false en caso contrario
     */

    public boolean estaAprobado(double promedio){
        /*
         * Según la escala académica estándar empleada, la nota 4.0 representa
         * el umbral mínimo exigido (60% de exigencia) para dar por aprobada la asignatura.
         */

        return promedio  >= 4.0;

    }
}
