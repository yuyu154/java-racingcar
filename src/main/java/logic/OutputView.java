package logic;

import domain.Game;

public class OutputView {

    public static void printGameResult(Game game) {
        System.out.println("\n실행 결과");
        game.proceedGame();
    }
}
