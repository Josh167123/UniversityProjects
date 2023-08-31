/**
 * 
 */
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.Board;
import game.PlayerType;
import game.Task;
import game.Utility;


class UtilityTest {
	Board board;

	 @BeforeEach
	 public void setUp() {
	  board = new Board(21);
	
	 }
	@Test
	void testSetUpTasks() {
		Board instance = board;
		 
		Utility.setUpTasks(instance);
		ArrayList<Task> sqr = instance.getSquare(17).getTask();
		Task testTask = new Task("Create UML classes", 5, 2, PlayerType.DEVELOPER);
		if(sqr.contains(testTask))
		{
			assertTrue(true);
		}


	}



}
