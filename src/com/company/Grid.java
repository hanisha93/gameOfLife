package com.company;

import java.util.LinkedList;
import java.util.Map;

public class Grid {

    LinkedList<Map.Entry<Cell, Cell>> grid = new LinkedList<>();

    public Grid(LinkedList grid) {
        this.grid = grid;
    }

}
