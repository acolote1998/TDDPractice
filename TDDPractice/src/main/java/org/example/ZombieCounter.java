package org.example;

public class ZombieCounter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addZombie(){
        count++;
    }

}
