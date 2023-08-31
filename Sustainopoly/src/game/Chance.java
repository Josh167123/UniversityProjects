/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author User
 */
public class Chance {
    private String description;
    private int energyGain;
    private int hoursGain;

    public Chance(String description, int energyGain,int hoursGain){
        this.description = description;
        this.energyGain = energyGain;
        this.hoursGain = hoursGain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEnergyGain() {
        return energyGain;
    }

    public void setEnergyGain(int energyGain) {
        this.energyGain = energyGain;
    }

    public int getHoursGain() {
        return hoursGain;
    }

    public void setHoursGain(int hoursGain) {
        this.hoursGain = hoursGain;
    }
    
        @Override
    public String toString() {
        return "Chance{" +
                "description='" + description + '\'' +
                ", energyGain=" + energyGain +
                ", hoursGain=" + hoursGain +
                '}';
    }
}
