package tdd;

public class AirCondition {
    private boolean powerOn;


    public void turnOnAirCondition(boolean value) {
        powerOn = value;
    }

    public boolean getMyAirCondition() {
        return powerOn;
    }
}
