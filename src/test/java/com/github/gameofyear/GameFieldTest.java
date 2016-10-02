package com.github.gameofyear;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Євгеній on 02.10.2016.
 */

public class GameFieldTest {
    @Test
    public void testPriorityQueue() {
        Party party = new Party();
        Party party1 = new Party();
        Party party2 = new Party();
        party.setInitiative(new BigDecimal(10));
        party1.setInitiative(new BigDecimal(120));
        party2.setInitiative(new BigDecimal(110));
        GameField gameField = new GameField();
        gameField.addParty(party);
        gameField.addParty(party1);
        gameField.addParty(party2);
        assertEquals(gameField.getActiveParty(), party1);
    }
    @Test
    public void testPriorityQueue1() {
        Party party = new Party();
        Party party1 = new Party();
        party.setInitiative(new BigDecimal(1550));
        party1.setInitiative(new BigDecimal(120));
        GameField gameField = new GameField();
        gameField.addParty(party);
        gameField.addParty(party1);
        assertEquals(gameField.getActiveParty(), party);
    }
    @Test
    public void testDoAction(){
        GameField gameField = new GameField();
        Party party = new Party();
        party.setInitiative(new BigDecimal(5));
        gameField.addParty(party);

        MoveAction moveAction = new MoveAction();
        moveAction.setPositionX(3);
        moveAction.setPositionY(5);
        gameField.doAction(moveAction);

        assertEquals(party.getPositionX(), 3);
        assertEquals(party.getPositionY(), 5);

    }
    @Test
    public void huina(){
        int[] pidr = new int[]{80,50,60};
        int[] pidrSource = new int[]{80,50,60};
        for (int i = 0; i < 50; i++) {
            int minN = 0;
            for (int j = 0; j < pidr.length; j++) {
                if(pidr[j] < pidr[minN]) {
                    minN = j;
                }
            }System.out.println(minN);
            for (int j = 0; j < pidr.length; j++) {
                if (j==minN){
                    pidr[minN]=pidrSource[minN];
                }else {
                    pidr[j]-=pidr[minN];
                }
            }
        }
    }
}
