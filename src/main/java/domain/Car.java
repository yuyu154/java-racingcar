/*
 * Car.java
 */

package domain;

import java.util.Random;

class Car {
    private final String name;
    private int position = 0;
    private static final int MIN_MOVE_NUMBER = 4;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void moveCar() {
        int randomNumber = getRandomNumber();
        if (randomNumber >= MIN_MOVE_NUMBER) {
            this.position++;
        }
    }

    public int getRandomNumber() {
        Random randomNumberMaker = new Random();
        int randomNumber = randomNumberMaker.nextInt(10);
        return randomNumber;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        if (this == obj) {
            return true;
        }
        if ((this.getName().equals(car.getName())) &&
                (this.getPosition() == car.getPosition())) {
            return true;
        }
        return false;
    }
}
