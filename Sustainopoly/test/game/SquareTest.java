package game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {
	Square sqr;
	Square sqr2;
	

	 @BeforeEach
	public void setUp() {
	    	sqr = new Square ("Amy",4, null);
	    	sqr2 = new Square ("Bob",6, null);
	    	
	 }
	    
	 	    
	@Test
	@DisplayName("Test of Square(pos)")   
	public void testSquarePos() {
		Square instance = sqr;
		int expResult = 4;
        int result = instance.getPos();
        assertEquals(expResult,result);
		    
    }
	
	@Test                                               
    @DisplayName("Test of Square constructor")   
   public void testSquare() {
		Square instance = sqr;
		String expResult = "Square{name='Amy', pos=4, task=[], playerOnCharge=null}";
        String result = instance.toString();
        assertEquals(expResult,result);     
    }
	
	@Test                                               
    @DisplayName("Test of getName")   
   public void testGetName() {
		Square instance = sqr;
		String expResult = "Amy";
        String result = instance.getName();
        assertEquals(expResult,result);   
		
	}
	
	@Test                                               
    @DisplayName("Test of setName ")   
	public void testSetName() {
		 String name = "Kate";
		 Square instance = sqr;
	     instance.setName(name);
	     String result = instance.getName();
	     assertEquals(name, result);
	}
	
	@Test                                               
    @DisplayName("Test of getPos ")   
	public void testGetPos() {
		Square instance = sqr2;
		int expResult = 6;
        int result = instance.getPos();
        assertEquals(expResult,result);   
		
	}
	
	@Test                                               
    @DisplayName("Test of setPos ")   
	public void testSetPos() {
		Square instance = sqr2;
		int pos = 5;
		instance.setPos(pos);
		int result = instance.getPos();
	     assertEquals(pos, result);
	
	}
	

	
	@Test                                               
    @DisplayName("Test of getTask")   
public void testGetTask() {
		Square instance = sqr2;
		ArrayList<Task> expResult = instance.getTask();
        ArrayList<Task> result = instance.getTask();
        assertEquals(expResult,result);
		
	} 

	
	
	@Test
	@DisplayName("Test of deleteTask")
   public void testDeleteTask() {
		Square instance = sqr2;
		Task tsk1= new Task("Create use case",  2,  3, PlayerType.DEVELOPER);
    	Task tsk2= new Task("Prepare Test cases",  5,  6, PlayerType.TESTER);
    	Task[] tsks = new Task[2];
    	tsks[0]= tsk1;
    	tsks[1]= tsk2;
		instance.deleteTask(0);;
		Task[] expResult = tsks;
        ArrayList<Task> result = instance.getTask();
        assertEquals(expResult,result);  
		
	}
	

	@Test
	@DisplayName("test of getPlayerOnCharge")
	public void testGetPlayerOnCharge() {
		Square instance = sqr2;
		Player expResult = instance.getPlayerOnCharge();
        Player result = instance.getPlayerOnCharge();
        assertEquals(expResult,result); 
	
	}

	

	


	}
