package game;

import java.util.ArrayList;

public class Square {
    private String name;
    private int pos;
    private ArrayList<Task> tasks;
    private Player playerOnCharge;

    public Square(int pos) {
        this.name = "Square number " + pos;
        this.pos = pos;
        this.tasks = new ArrayList<>();
        this.playerOnCharge = null;
    }


    public Square(String name, int pos, Task task) {
        this.name = name;
        this.pos = pos;
        this.tasks = new ArrayList<>();
        this.playerOnCharge = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public ArrayList<Task> getTask() {
        return tasks;
    }

    public void setTask(Task task) {
        this.tasks.add(task);
    }
    
    public void deleteTask(int i) {
        this.tasks.remove(i);
    }

    public Player getPlayerOnCharge() {
        return playerOnCharge;
    }

    public void setPlayerOnCharge(Player playerOnCharge) {
        this.playerOnCharge = playerOnCharge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", pos=" + pos +
                ", task=" + tasks +
                ", playerOnCharge=" + playerOnCharge +
                '}';
    }
}
