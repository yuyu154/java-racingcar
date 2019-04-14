package logic;

import domain.Car;
import domain.Game;
import util.RandomNumberMaker;

import java.util.List;

public class Player {

    private int gameCount;
    private List<Car> carList;

    public Player() {
        init();
    }

    private void init() {
        gameCount = InputView.getGameCount().intValue();
        carList = InputView.getCarsList();
    }

    public void play() {
        Game racingGame = new Game(carList, gameCount);
        OutputView.printGameResult(racingGame);
        OutputView.printWinners(racingGame);
    }
}
