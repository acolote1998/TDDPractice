package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadZombieCounterTest {

    @Test
    public void deadZombieCounterStartsAtZero(){
        DeadZombieCounter counter = new DeadZombieCounter();
        assertEquals(0,counter.getCount());
    }

@Test
    public void deadZombieCounterIsOne(){
        DeadZombieCounter counter = new DeadZombieCounter();
        counter.addDeadZombie();
        assertEquals(1,counter.getCount());
    }

    @Test
    public void deadZombieCounterIsTwo(){
        DeadZombieCounter counter = new DeadZombieCounter();
        counter.addDeadZombie();
        counter.addDeadZombie();
        assertEquals(2,counter.getCount());
    }

}