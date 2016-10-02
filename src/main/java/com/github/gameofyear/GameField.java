package com.github.gameofyear;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Євгеній on 02.10.2016.
 */
public class GameField {
    private List<Party> parties = new ArrayList<Party>();
    private int widht;
    private int height;


    public void addParty(Party party){
        parties.add(party);
    }

    public void deleteParty(Party party){
        parties.remove(party);
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Party getActiveParty() {
        Party partyWithMinLazy = parties.get(0);
        for (Party party : parties) {
            if (party.getCurrentLazy().compareTo(partyWithMinLazy.getCurrentLazy())<0){
                partyWithMinLazy = party;
            }
        }

        return partyWithMinLazy;
    }

    public void turnFinish(){
        Party activeParty = getActiveParty();
        BigDecimal currentLazy = activeParty.getCurrentLazy();
        for (Party party : parties) {
            party.setCurrentLazy(party.getCurrentLazy().subtract(currentLazy));
        }
        activeParty.setCurrentLazy(activeParty.getLazy());
    }

    public void doAction(Action action) {
        action.doAction(this);
    }
}
