/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.ArrayList;
import java.util.Random;

public class ChanceCards {
    private ArrayList<Chance> cards;
    public ChanceCards() {
        this.cards = new ArrayList<>();
    }
    public void addCard(Chance chance) {
        this.cards.add(chance);
    }
    public Chance getRandomCard() {
        Random rd = new Random();
        int random = rd.nextInt(cards.size());
        return this.cards.get(random);
    }
}
