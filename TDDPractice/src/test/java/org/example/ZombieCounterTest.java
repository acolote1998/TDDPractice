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

}