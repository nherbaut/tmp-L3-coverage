package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.pantheonsorbonne.IntegerSumComputer;

public class IntegerSumComputerTest {

    @Test
    public void testSum1(){
        assertEquals(3, IntegerSumComputer.getSumOfInteger(1, 2));
    }

    @Test
    public void testSum2(){
        assertEquals(1275, IntegerSumComputer.getSumOfInteger(1, 50));
    }

    @Test
    public void testSum3(){
        assertThrows(IllegalArgumentException.class, () -> IntegerSumComputer.getSumOfInteger(-1, 3));
    }

    @Test
    public void testSum4(){
        assertThrows(IllegalArgumentException.class, () -> IntegerSumComputer.getSumOfInteger(3, 2));
    }
    
}
