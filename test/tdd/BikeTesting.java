package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BikeTesting{

    @Test
    public void  bmwIsOn(){
        Bike idrisBike = new Bike();
        idrisBike.turnOn(true);
        boolean idrisBikeOn = idrisBike.isOn();
        assertTrue(String.valueOf(true),idrisBikeOn);

    }
    @Test
    public void bmwIsOff(){
        Bike idrisBike = new Bike();
        idrisBike.turnOn(true);
        boolean idrisbikeIsoff = idrisBike.isOn();
        assertTrue(String.valueOf(true),idrisbikeIsoff);

    }
    @Test
    public void bmwIncrementOfOne(){
        Bike gearOne = new Bike();
        gearOne.turnOn(true);
        gearOne.accelerates(1);
        int gearOnen = gearOne.getaccelerates();
        assertEquals(1,gearOnen);

    }
    @Test
    public void bmwIncrementOfTwo(){
        Bike gearTwo = new Bike();
        gearTwo.accelerates(2);
        int gearTwon = gearTwo.getaccelerates();
        assertEquals(2,gearTwon);
    }
    @Test
    public void bmwIncrementOfThree(){
        Bike gearThree = new Bike();
        gearThree.accelerates(3);
        int gearThreen = gearThree.getaccelerates();
        assertEquals(3,gearThreen);

    }
    @Test
    public void bmwIncrementOffour(){
        Bike gearFour = new Bike();
        gearFour.accelerates(4);
        int gearFourr = gearFour.getaccelerates();
        assertEquals(4,gearFourr);
    }
    @Test
    public void deccelerated4(){
        Bike gearfour = new Bike();
        gearfour.accelerates(4);
        gearfour.accelerates(3);
        int gearfourr = gearfour.getaccelerates();
        assertEquals(3,gearfourr);

    }
    @Test
    public void deccelerated3(){
        Bike gear3 = new Bike();
        gear3.accelerates(3);
        gear3.accelerates(2);
        int gearThree = gear3.getaccelerates();
        assertEquals(2,gearThree);
    }

    @Test
    public void deccelerated2(){
        Bike gear2 = new Bike();
        gear2.accelerates(2)  ;
        gear2.accelerates(1);
        int gearTwo = gear2.getaccelerates();
        assertEquals(1,gearTwo);
    }
    @Test
    public void SpeedGearONe(){
        Bike speedTwenthone = new Bike();
        speedTwenthone.accelerates(1);
        speedTwenthone.speedrate(21);
        int speedAt21 = speedTwenthone.getspeedrate();
        assertEquals(21,speedAt21);

    }


}









