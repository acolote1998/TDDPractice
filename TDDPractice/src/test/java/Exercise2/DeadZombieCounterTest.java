package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadZombieCounterTest {

    @Test
    public void deadZombieCounterStartsAtZero(){
        DeadZombieCounter counter = new DeadZombieCounter();
        assertEquals(0,counter.getCount());
    }

}