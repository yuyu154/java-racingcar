package logic;

import domain.Car;
import util.InputUtil;

import java.util.List;

public class Player {

    private int gameCount;
    private List<Car> carList;

    public Player() {
        init();
    }

    private void init() {
        gameCount = InputView.getGameCount();
        carList = InputView.getCarsList();
    }

    public void play() {
        InputUtil.test(gameCount);
        InputUtil.test(carList);
    }
}
