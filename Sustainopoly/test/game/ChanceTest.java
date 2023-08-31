package game;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class ChanceTest2 {
	Chance chance;
	Chance chance2;
	
	
    @BeforeEach
    public void setUp() {
    	chance = new Chance ("Participate in a company training", 2, 1 );
    	chance2 = new Chance ("Advance to the next meeting. Skip the team lunch", 3, 1);
    	
    }
    
  

	@Test                                               
    @DisplayName("Test of Chance constructor")   
    void testChance() {
		Chance instance = chance;
		String expResult = "Chance{description='Participate in a company training', energyGain=2, hoursGain=1}";
        String result = instance.toString();
        assertEquals(expResult,result);
             
    }
	
	@Test                                               
    @DisplayName("Test of getDescription")   
    void testGetDescription() {
		Chance instance = chance;
		String expResult = "Participate in a company training";
        String result = instance.getDescription();
        assertEquals(expResult,result);    
    }
	
	@Test                                               
    @DisplayName("Test of setDescription")   
    void testSetDescription() {
		Chance instance = chance;
		String desc = "Present your project progress to the team";
		instance.setDescription(desc);
		String expResult = "Present your project progress to the team";
        String result = instance.getDescription();
        assertEquals(expResult,result);     
    }
	
	@Test                                               
    @DisplayName("Test of getEnergyGain")   
    void testGetEnergyGain() {
		Chance instance = chance2;
		int expResult = 3;
        int result = instance.getEnergyGain();
        assertEquals(expResult,result);    
    }
	
	@Test                                               
    @DisplayName("Test of setEnergyGain ")   
    void testSetEnergyGain() {
		Chance instance = chance2;
		instance.setEnergyGain(4);
		int expResult = 4;
        int result = instance.getEnergyGain();
        assertEquals(expResult,result);     
    }
	
	@Test                                               
    @DisplayName("Test of getHoursGain")   
    void testGetHoursGain() {
		Chance instance = chance2;
		int expResult = 1;
        int result = instance.getHoursGain();
        assertEquals(expResult,result); 
    }
	
	@Test                                               
    @DisplayName("Test of setHoursGain")   
    void testSetHoursGain() {
		Chance instance = chance2;
		int hours = 2;
		instance.setHoursGain(hours);;
		int expResult = 2;
        int result = instance.getHoursGain();
        assertEquals(expResult,result);     
    }

}

