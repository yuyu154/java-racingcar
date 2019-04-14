package domain;

import util.RandomNumberMaker;

import java.util.List;

public class Game {
    private List<Car> carList;
    private int gameCount;

    public Game(List<Car> carList, int gameCount) {
        this.carList = carList;
        this.gameCount = gameCount;
    }

    public void proceedGame() {
        for (int i = 0; i < gameCount; i++) {
            proceedOneGame();
            printResult();
            System.out.println();
        }
    }

    private void proceedOneGame() {
        carList.forEach(car -> car.move(RandomNumberMaker.getRandomNumber()));
    }

    private void printResult() {
        carList.forEach(car -> printCar(car));
    }

    private void printCar(Car car) {
        System.out.println(car + ":" + car.getLine());
    }
}
