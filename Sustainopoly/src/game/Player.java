package game;

import java.util.Arrays;

public class Player {
    private String name;
    private PlayerType type;
    private int position;
    private Task[] inChargeOf;
    private int energy;
    private int hours;
    
    private int totalEnergy;
    private int totalHours;
    private int totalTasks;

    public Player(String name, PlayerType type) {
        this.name = name;
        this.type = type;
        this.position = 0;
        this.energy = 15;
        this.hours = 15;
        
        this.totalEnergy = 0;
        this.totalHours = 0;
        this.totalTasks = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public void addTaskComplete()
    {
        this.totalTasks ++;
    }
    
    public void movePlayer(int mov,int max) {
        int pos = this.position + mov;
        if (pos >= max) {
            this.position = pos - max;
            this.energy += 10;
            this.hours += 10;
        }
        else {
            this.position += mov;
        }      
    }
    
    public void reduceEnergy(int i) {
        this.energy -= i;
        
       totalEnergy += i;
    }
    
    public void reduceHours(int i) {
        this.hours -= i;
        
       totalHours += i;
    }
    
    public Task[] getInChargeOf() {
        return inChargeOf;
    }

    public void setInChargeOf(Task[] inChargeOf) {
        this.inChargeOf = inChargeOf;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void addEnergy (int en) {
        this.energy += en;
    }
    
    public void addHours(int ho) {
        this.hours += ho;
    }
    
    public int getTotalHours( )
    {
        return totalHours;
    }
       public int getTotalEnergy( )
    {
        return totalEnergy;
    }
          public int getTotalTasks( )
    {
        return totalTasks;
    }
    
  
    
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", position=" + position +
                ", inChargeOf=" + Arrays.toString(inChargeOf) +
                ", energy=" + energy +
                ", hours=" + hours +
                '}';
    }
}
