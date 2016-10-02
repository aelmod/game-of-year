package com.github.gameofyear;

import java.math.BigDecimal;

/**
 * Created by Євгеній on 02.10.2016.
 */
public class Party {
    private int totalHp;
    private int unitHp;
    private String type;
    private boolean rangeAttack;
    private boolean miliAttack;
    private BigDecimal initiative;
    private int criticalPercent;
    private int positionX;
    private int positionY;
    private int minDamage;
    private int maxDamage;
    private int defence;
    private int cellCount;
    private int lucky;
    private int arrowCount;
    private BigDecimal currentLazy;

    public int getHeroCount(){
        return (int)Math.ceil(totalHp/(float)unitHp);
    }

    public void setHeroCount(int heroCount){
        totalHp = unitHp*heroCount;
    }

    public int getTotalHp() {
        return totalHp;
    }

    public void setTotalHp(int totalHp) {
        this.totalHp = totalHp;
    }

    public int getUnitHp() {
        return unitHp;
    }

    public void setUnitHp(int unitHp) {
        this.unitHp = unitHp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRangeAttack() {
        return rangeAttack;
    }

    public void setRangeAttack(boolean rangeAttack) {
        this.rangeAttack = rangeAttack;
    }

    public boolean isMiliAttack() {
        return miliAttack;
    }

    public void setMiliAttack(boolean miliAttack) {
        this.miliAttack = miliAttack;
    }

    public BigDecimal getInitiative() {
        return initiative;
    }

    public void setInitiative(BigDecimal initiative) {
        this.initiative = initiative;
    }

    public int getCriticalPercent() {
        return criticalPercent;
    }

    public void setCriticalPercent(int criticalPercent) {
        this.criticalPercent = criticalPercent;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }

    public int getLucky() {
        return lucky;
    }

    public void setLucky(int lucky) {
        this.lucky = lucky;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public BigDecimal getLazy(){
        return new BigDecimal(1000).divide(initiative);
    }

    public BigDecimal getCurrentLazy() {

        return currentLazy;
    }

    public void setCurrentLazy(BigDecimal currentLazy) {
        this.currentLazy = currentLazy;
    }
}
