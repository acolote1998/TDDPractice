package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieCounterTest {

    @Test
    public void counterStartsAtZero(){
        ZombieCounter counter = new ZombieCounter();
        assertEquals(0,counter.getCount());
    }

    @Test
    public void addZombieIncreasesCountByOne(){
        ZombieCounter counter = new ZombieCounter();
        counter.addZombie();
        assertEquals(1,counter.getCount());
    }

    @Test
    public void addTwoZombiesIncreasingCountByOne(){
        ZombieCounter counter = new ZombieCounter();
        counter.addZombie();
        counter.addZombie();
        assertEquals(2,counter.getCount());
    }

    @Test
    public void countCannotGoBelowZero(){
        ZombieCounter counter = new ZombieCounter();
        counter.setCount(-1);
        assertEquals(0,counter.getCount());
    }

    @Test
    public void shouldThrowExceptionIfZombieIsNegative(){
        ZombieCounter counter = new ZombieCounter();
        assertThrows(IllegalArgumentException.class,()-> {
            counter.addZombie(-1);
        });

    }
}