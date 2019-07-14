/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raptors;

/**
 *
 * @author Team Raptors
 */
public class CardGame {
    // enum
public enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};
    private Suit s; //encapsulation principle applied
                  
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KING, QUEEN, JACK, PRINCESS, ACE};
    
    
    private Value v; 
    // constructor
    
    public CardGame(Suit s, Value v)
    {
        this.s=s;
        this.v=v;
    }

    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
}
