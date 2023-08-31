package game;

public class Task {
    private String taskTitle;
    private int energyRequired;
    private int hoursRequired;
    private PlayerType role;
    private Player[] playerInCharge;

    public Task(String taskTitle, int energyRequired, int hoursRequired, PlayerType role) {
        this.taskTitle = taskTitle;
        this.energyRequired = energyRequired;
        this.hoursRequired = hoursRequired;
        this.role = role;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public int getEnergyRequired() {
        return energyRequired;
    }

    public void setEnergyRequired(int energyRequired) {
        this.energyRequired = energyRequired;
    }

    public int getHoursRequired() {
        return hoursRequired;
    }

    public void setHoursRequired(int hoursRequired) {
        this.hoursRequired = hoursRequired;
    }
    
    public void reduceHoursRequired(int i) {
        this.hoursRequired -= i;
    }
    
    public void reduceEnergyRequired(int i) {
        this.energyRequired -= i;
    }
    
    public PlayerType getRole() {
        return this.role;
    }

    public Player[] getPlayerInCharge() {
        return playerInCharge;
    }

    public void setPlayerInCharge(Player[] playerInCharge) {
        this.playerInCharge = playerInCharge;
    }
}
