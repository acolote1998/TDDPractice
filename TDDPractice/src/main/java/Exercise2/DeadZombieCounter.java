package Exercise2;

public class DeadZombieCounter {
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addDeadZombie(){
        count++;
    }

    private int count=0;
}
