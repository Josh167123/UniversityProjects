/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package game;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class TaskTest {
    Task tsk;
    
  
    @BeforeEach
    public void setUp() {
        String taskTitle = "Task Title";
        int energyRequired = 20;
        int hoursRequired = 15;
        PlayerType role = PlayerType.DEVELOPER;
        tsk = new Task(taskTitle,energyRequired,hoursRequired,role);  
    }
    

    /**
     * Test of getTaskTitle method, of class Task.
     */
    @Test
    public void testGetTaskTitle() {
        System.out.println("getTaskTitle");
        Task instance = tsk;
        String expResult = "Taks Title";
        String result = instance.getTaskTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTaskTitle method, of class Task.
     */
    @Test
    public void testSetTaskTitle() {
        System.out.println("setTaskTitle");
        Task instance = tsk;
        String taskTitle = "TaskTitle12";
        instance.setTaskTitle(taskTitle);
        String result = instance.getTaskTitle();
        assertEquals(taskTitle, result);
    }
    
    /**
     * Test of getEnergyRequired method, of class Task.
     */
    @Test
    public void testGetEnergyRequired() {
        System.out.println("getEnergyRequired");
        Task instance = tsk;
        int expResult = 20;
        int result = instance.getEnergyRequired();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnergyRequired method, of class Task.
     */
    @Test
    public void testSetEnergyRequired() {
        System.out.println("setEnergyRequired");
        int energyRequired = 0;
        Task instance = tsk;
        instance.setEnergyRequired(energyRequired);
        int result = instance.getEnergyRequired();
        assertEquals(energyRequired, result);
    }

    /**
     * Test of getHoursRequired method, of class Task.
     */
    @Test
    public void testGetHoursRequired() {
        System.out.println("getHoursRequired");
        Task instance = tsk;
        int expResult = 15;
        int result = instance.getHoursRequired();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoursRequired method, of class Task.
     */
    @Test
    public void testSetHoursRequired() {
        System.out.println("setHoursRequired");
        int hoursRequired = 0;
        Task instance = tsk;
        instance.setHoursRequired(hoursRequired);
        int result = instance.getHoursRequired();
        assertEquals(hoursRequired, result);
    }

    /**
     * Test of reduceHoursRequired method, of class Task.
     */
    @Test
    public void testReduceHoursRequired() {
        System.out.println("reduceHoursRequired");
        int i = 5;
        Task instance = tsk;
        instance.reduceHoursRequired(i);
        int expResult = 10;
        assertEquals(expResult, instance.getHoursRequired());
    }

    /**
     * Test of reduceEnergyRequired method, of class Task.
     */
    @Test
    public void testReduceEnergyRequired() {
        System.out.println("reduceEnergyRequired");
        int i = 5;
        Task instance = tsk;
        instance.reduceEnergyRequired(i);;
        int expResult = 15;
        assertEquals(expResult, instance.getEnergyRequired());
    }

    /**
     * Test of getRole method, of class Task.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Task instance = tsk;
        PlayerType expResult = PlayerType.DEVELOPER;
        PlayerType result = instance.getRole();
        assertEquals(expResult, result);
    }

}
