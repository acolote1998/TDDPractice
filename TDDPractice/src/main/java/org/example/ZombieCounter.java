package org.example;

public class ZombieCounter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
    if(count>=0){
            this.count = count;
    }
    }

    public void addZombie(int zombies){
        if (zombies<0){
            throw new IllegalArgumentException("Cannot add a negative zombie");
        }
        count+= zombies;
    }

}
