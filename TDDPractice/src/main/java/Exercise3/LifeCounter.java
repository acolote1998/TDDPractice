package Exercise3;

/*

Nuevo ejercicio: Contador de Vidas 🧟‍♂️
Reglas:
Tenemos un contador de "vidas" (LifeCounter). Vamos a hacer lo siguiente:

El contador de vidas empieza en 3.
Cada vez que se llama a takeLife(), se resta una vida (pero no puede quedar por debajo de 0).
Queremos asegurarnos de que el contador nunca baje de 0, aunque sigamos llamando a takeLife().

 */

public class LifeCounter {
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int counter=0;

}
