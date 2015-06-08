package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    
    @Test
    public void specForCheckingCellState()  {
        Cell cell = new Cell();
        assertEquals(true,cell.isAlive());
    }
}
