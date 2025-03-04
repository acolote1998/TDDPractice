package Exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*

Nuevo ejercicio: Contador de Vidas 🧟‍♂️
Reglas:
Tenemos un contador de "vidas" (LifeCounter). Vamos a hacer lo siguiente:

El contador de vidas empieza en 3.
Cada vez que se llama a takeLife(), se resta una vida (pero no puede quedar por debajo de 0).
Queremos asegurarnos de que el contador nunca baje de 0, aunque sigamos llamando a takeLife().

 */

class LifeCounterTest {

    @Test
    public void lifeCounterStartsAtZero(){
        LifeCounter lifeCounter = new LifeCounter();
        assertEquals(1,lifeCounter.getCounter());
    }

}