package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieCounterTest {

    @Test
    public void counterStartsAtZero(){
        ZombieCounter = new ZombieCounter();
        assertEquals(0,counter.getCount());
    }

}