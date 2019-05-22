package com.cherkasov.lab10;

public class Car {
    private double speed;
    private double initial_position;

    public void setInitial_position(double initial_position) {
        this.initial_position = initial_position;
    }

    public double getInitial_position() {
        return initial_position;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
