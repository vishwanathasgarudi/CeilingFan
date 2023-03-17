package main.java.com.medavie;

import java.time.LocalDate;

public class CeilingFan {

    private int speed = 0; //  ceiling fan starts off
    
    private boolean reverse = false; // ceiling fan starts with forward direction
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isReverse() {
        return reverse;
    }
    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public void pullCord1() {
        if (LocalDate.now().getMonthValue() == 12 && LocalDate.now().getDayOfMonth() == 25) { // checking for 25th of December
            System.out.println("Ceiling fan is off on December 25th.");
            return;
        }
        if (speed < 3) {
            speed++;
        } else {
            speed = 0;
        }
        if (speed == 0) {
            System.out.println("Fan is off.");
        } else {
            System.out.println("Fan speed is " + speed);
        }
    }

    public void pullCord2() {
        if (LocalDate.now().getMonthValue() == 12 && LocalDate.now().getDayOfMonth() == 25) { // checking for 25th of December
            System.out.println("Ceiling fan is off on December 25th.");
            return;
        }
        reverse = !reverse;
        if (reverse) {
            System.out.println("Fan direction is reversed.");
        } else {
            System.out.println("Fan direction is forward.");
        }
    }
}
