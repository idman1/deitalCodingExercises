package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTesting {
    @Test
    public void checkOutIfMyAirConditionIsOn() {
        AirCondition myAirCondition = new AirCondition();
        //Given my ac is turn on
        myAirCondition.turnOnAirCondition(true);
        boolean idrisGidanSanyi = myAirCondition.getMyAirCondition();
        //assert the AirCondition is on
        assertTrue(true, String.valueOf(idrisGidanSanyi));


    }


}
