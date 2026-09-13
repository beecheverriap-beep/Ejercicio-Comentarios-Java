/**
 * Proporciona utilidades para el procesamiento, cálculo de promedios
 * y evaluación del rendimiento académico de las calificaciones de un estudiante.
 */
public class CalculadorNotas {

    /**
     * Calcula el promedio de tres evaluaciones.
     *
     * @param nota1 primera nota
     * @param nota2 segunda nota
     * @param nota3 tercera nota
     * @return promedio de las tres notas
     */



    public double calcularPromedio(double nota1, double nota2, double nota3) {
        // Las tres evaluaciones tienen la misma ponderación.
        return  (nota1 + nota2 + nota3) / 3.0;
    }

    /**
     *
     * @param promedio calcula el promedio de las 3 notas
     * @return si el promedio es mayor o igual a 4.0 sera true
     */

    public boolean estaAprobado(double promedio){
        /*
        * La escala utilizada considera 4.0
        *  como nota minima de aprobacion
         */

        return promedio  >= 4.0;

    }
}
