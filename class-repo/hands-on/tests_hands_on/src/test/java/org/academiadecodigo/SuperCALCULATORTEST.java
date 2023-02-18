package org.academiadecodigo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SuperCALCULATORTEST {

    private Brain brain;
    private Display display;
    private SuperCalculator systemUnderTest;
    private final int MAX_BATTERY = 100;

    //Setup
    @Before
    public void setup(){
        brain = mock(Brain.class);
        display = mock(Display.class);
        systemUnderTest = new SuperCalculator(brain, display);
    }

    @Test
    public void calculatorShouldStartWithMaxBattery(){
        assertEquals(MAX_BATTERY, systemUnderTest.getBattery());
    }

    @Test
    public void calculatorAddShouldDecrementBattery(){
        //Exercise
        systemUnderTest.add();
        //Verification
        assertTrue(MAX_BATTERY > systemUnderTest.getBattery());
    }

    @Test
    public void calculatorShouldProperlyDisplayResult(){
        // setup
        when(display.getUserInput()).thenReturn(5);
        //Exercise
        systemUnderTest.add();
        //Verification
        verify(display, times(2)).getUserInput();
        verify(display).showResult(anyInt());
        verify(brain).sum(anyInt(), anyInt());
    }

    @Test
    public void displayShouldShowErrorWhenBatteryIsDead(){
        //Setup
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        systemUnderTest.add();
        //Exercise
        systemUnderTest.add();
        //Verification
        verify(display).showError(anyString());
    }

}
