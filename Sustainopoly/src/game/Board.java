package game;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;
    private ArrayList<Player> players;
    private int MAX_SQUARES_NUMBERS;
    private int playerToPlayIndex;

    public Board(int MAX_SQUARES_NUMBERS) {
        this.MAX_SQUARES_NUMBERS = MAX_SQUARES_NUMBERS;
        this.squares = new ArrayList<>();
        this.players = new ArrayList<>();
        this.playerToPlayIndex = 0;
        // Creating squares in the board
        for (int i = 0; i < this.MAX_SQUARES_NUMBERS; i++) {
            Square squ = new Square(i);
            squares.add(squ);
        }
    }

    public void next() {
        if (this.playerToPlayIndex == players.size()-1) {
            this.playerToPlayIndex = 0;
        }
        else {
            this.playerToPlayIndex += 1;
        }
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
    
    public Square getSquare(int i) {
        return this.squares.get(i);
    }
    
    public void setSquares(ArrayList<Square> squares) {
        this.squares = squares; 
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }
    
    public int getPlayerTurnIndex() {
        return this.playerToPlayIndex;
    }

    public void PrintPlayers() {
        for ( int i = 0; i < this.players.size(); i++) {
            System.out.println(this.players.get(i).toString());
        }
    } 
    public void PrintSquares() {
        for ( int i = 0; i < MAX_SQUARES_NUMBERS; i++) {
            System.out.println(this.squares.get(i).toString());
        }
    }
    public int getPlayersNumber() {
        return this.players.size();
    }
    
    public int getMaxSquareNumber() {
        return this.MAX_SQUARES_NUMBERS;
    }
    
    public int getPlayerPos(String name) {
        // must check name before calling this method
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player.getPosition();
            }
        }
        return 0;
    }
}
