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
 * @author Wvv
 */
public class PlayerTest {
    Player player;
  
    
    @BeforeEach
    public void setUp() {
    	player = new Player("azoz",PlayerType.TESTER);
    	Task tsk1= new Task("testing",  2,  3, PlayerType.TESTER);
    	Task tsk2= new Task("trying",  5,  6, PlayerType.TESTER);
    	Task[] tsks = new Task[2];
    	tsks[0]= tsk1;
    	tsks[1]= tsk2;

    	
    	player.setInChargeOf(tsks);
    }
    

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = player;
        String expResult = "azoz";
        String result = instance.getName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = player;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getType method, of class Player.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Player instance = player;
        PlayerType expResult = PlayerType.TESTER;
        PlayerType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setType method, of class Player.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        PlayerType type = PlayerType.TESTER;
        Player instance = player;
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPosition method, of class Player.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Player instance = player;
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setPosition method, of class Player.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int position = 0;
        Player instance = player;
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of movePlayer method, of class Player.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        int mov = 0;
        int max = 0;
        Player instance = player;
        instance.movePlayer(mov, max);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of reduceEnergy method, of class Player.
     */
    @Test
    public void testReduceEnergy() {
        System.out.println("reduceEnergy");
        int i = 0;
        Player instance = player;
        instance.reduceEnergy(i);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of reduceHours method, of class Player.
     */
    @Test
    public void testReduceHours() {
        System.out.println("reduceHours");
        int i = 0;
        Player instance = player;
        instance.reduceHours(i);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getInChargeOf method, of class Player.
     */
    @Test
    public void testGetInChargeOf() {
        System.out.println("getInChargeOf");
        Player instance = player;
        Task[] expResult = instance.getInChargeOf();
        Task[] result = instance.getInChargeOf();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setInChargeOf method, of class Player.
     */
    @Test
    public void testSetInChargeOf() {
        System.out.println("setInChargeOf");
        Task[] inChargeOf = player.getInChargeOf();
        Player instance = player;
        instance.setInChargeOf(inChargeOf);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEnergy method, of class Player.
     */
    @Test
    public void testGetEnergy() {
        System.out.println("getEnergy");
        Player instance = player;
        int expResult = 15;
        int result = instance.getEnergy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEnergy method, of class Player.
     */
    @Test
    public void testSetEnergy() {
        System.out.println("setEnergy");
        int energy = 0;
        Player instance = player;
        instance.setEnergy(energy);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHours method, of class Player.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Player instance = player;
        int expResult = 15;
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHours method, of class Player.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 0;
        Player instance = player;
        instance.setHours(hours);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addEnergy method, of class Player.
     */
    @Test
    public void testAddEnergy() {
        System.out.println("addEnergy");
        int en = 0;
        Player instance = player;
        instance.addEnergy(en);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of addHours method, of class Player.
     */
    @Test
    public void testAddHours() {
        System.out.println("addHours");
        int ho = 0;
        Player instance = player;
        instance.addHours(ho);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = player;
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       ;
    }
    
}
