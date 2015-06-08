package com.company;

public class Cell {
    boolean state;

    public Cell(boolean state) {
        this.state = state;
    }

    public int neighbours() {
        return 3;
    }

    public boolean isAlive() {
        return state;
    }

}
