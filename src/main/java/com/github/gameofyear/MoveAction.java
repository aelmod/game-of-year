package com.github.gameofyear;

/**
 * Created by Євгеній on 02.10.2016.
 */
public class MoveAction implements Action{
    private int positionX;
    private int positionY;

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void doAction(GameField gameField) {
        Party activeParty = gameField.getActiveParty();
        int xRange = Math.abs(activeParty.getPositionX() - positionX);
        int yRange = Math.abs(activeParty.getPositionY() - positionY);
        if (xRange+yRange>activeParty.getCellCount()){
            throw new IllegalArgumentException("Too Long");
        }
        if (positionX<0||positionX>=gameField.getWidht()||positionY<0||positionY>=gameField.getHeight()){
            throw new IllegalArgumentException("Out of game field");
        }
        activeParty.setPositionY(positionY);
        activeParty.setPositionX(positionX);
    }
}
