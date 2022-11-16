package tdd;

public class Bike {
    private boolean poweredOn = false;
    private int speed;
    private  int gear;
    public void turnOn(boolean value) {
        poweredOn = value;
    }

    public boolean isOn() {
        return poweredOn;
    }

    public int getaccelerates() {

        return gear;
    }

    public int speedrate(int rate){
        speed = rate;
        if (speed > 21 && speed >31 && speed >41)
            speed = gear + 1;
        return speed;
    }

    public void accelerates(int gearNumber){
            gear = gearNumber;
    }

    public int getspeedrate(){
        return speed;
    }
}




