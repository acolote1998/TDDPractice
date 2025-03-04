package Exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*

Nuevo ejercicio: Contador de Vidas 🧟‍♂️
Reglas:
Tenemos un contador de "vidas" (LifeCounter). Vamos a hacer lo siguiente:

El contador de vidas empieza en 0.
Cada vez que se llama a takeLife(), se resta una vida (pero no puede quedar por debajo de 0).
Queremos asegurarnos de que el contador nunca baje de 0, aunque sigamos llamando a takeLife().

 */

class LifeCounterTest {

    @Test
    public void lifeCounterStartsAtZero(){
        LifeCounter lifeCounter = new LifeCounter();
        assertEquals(0,lifeCounter.getCounter());
    }

    @Test
    public void lifeCounterAddsOneLife(){
        LifeCounter lifeCounter = new LifeCounter();
        lifeCounter.addLife();
        assertEquals(1,lifeCounter.getCounter());
    }

    @Test
    public void lifeCounterAddsTwoLives(){
        LifeCounter lifeCounter = new LifeCounter();
        lifeCounter.addLife();
        lifeCounter.addLife();
        assertEquals(2,lifeCounter.getCounter());
    }

    @Test
    public void lifeCounterCannotBeBelowZero(){
        LifeCounter lifeCounter = new LifeCounter();
        lifeCounter.removeLife();
        assertEquals(0,lifeCounter.getCounter());
    }

    @Test
    public void lifeCounterAddsTenLives(){
        LifeCounter lifeCounter = new LifeCounter();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        lifeCounter.addLife();
        assertEquals(10,lifeCounter.getCounter());
    }

    @Test
    public void lifeCounterRemovesTenLives(){
        LifeCounter lifeCounter = new LifeCounter();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        lifeCounter.removeLife();
        assertEquals(0,lifeCounter.getCounter());
    }

}