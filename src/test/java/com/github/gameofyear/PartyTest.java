package com.github.gameofyear;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Євгеній on 02.10.2016.
 */
public class PartyTest {
    @Test
    public void Party_getHeroCount(){
        Party party = new Party();
        party.setUnitHp(10);
        party.setTotalHp(100);
        assertEquals(party.getHeroCount(), 10);
    }

    @Test
    public void Party_getHeroCount2(){
        Party party = new Party();
        party.setUnitHp(10);
        party.setTotalHp(15);
        assertEquals(party.getHeroCount(), 2);
    }

    @Test
    public void Party_setHeroCount(){
        Party party = new Party();
        party.setUnitHp(10);
        party.setHeroCount(5);

        assertEquals(party.getTotalHp(), 50);
    }
}
