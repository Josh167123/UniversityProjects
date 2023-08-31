package Tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.DisplayName;

import game.Player;
import game.PlayerType;
import game.Square;
import game.Board;


class BoardTest {
	ArrayList<Square> squares;
	Board board;
	Player player1;
	Player player2;

	
	
	 @BeforeEach
	 public void setUp() {
	  board = new Board(20);
	  player1 = new Player("Josh",PlayerType.DEVELOPER);
	  player2 = new Player("Diana",PlayerType.DESIGNER);	  
	 }
	 @Test
		@DisplayName("Test Next")
	    void testNext() {
		 Board instance = board;
		 instance.addPlayer(player1);
   	     instance.addPlayer(player2);
   	     instance.next();
   	     int result = instance.getPlayerTurnIndex();
   	     assertEquals(1,result);
   	    
	 }
	 
	
	 
	@Test
	@DisplayName("Test get max square number")
    void testGetMaxSquareNumber() {
		Board instance = board;
		int result = instance.getMaxSquareNumber();
		assertEquals(20,result);
	}
	
    @Test
    void testGetPlayersNumber()
    {
    	Board instance = board;
    	 System.out.println("getPlayersNumber");
    	  instance.addPlayer(player1);
    	  instance.addPlayer(player2);
    	 int playerNumber = instance.getPlayersNumber();
    	 assertEquals(2,playerNumber);
  
    }
   
	
    @Test
    void testPrintPlayers() {
    	Board instance = board;
        System.out.println("printPlayers");
        instance.PrintPlayers();

    }
    
  
    @Test
    void testAddPlayer() {
    	Board instance = board;
      System.out.println("addPlayers");
	  instance.addPlayer(player1);
	  instance.addPlayer(player2);
	  
	 int playerNumber = instance.getPlayersNumber();
     assertEquals(2,playerNumber);
	
  }
    
	@Test
    void testGetPlayer() {
		Board instance = board;
		  instance.addPlayer(player1);
		Player result =instance.getPlayer(0);
		
		assertEquals(player1, result);
    	

    }
    
	
}