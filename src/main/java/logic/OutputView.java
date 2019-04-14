package logic;

import domain.Game;

public class OutputView {

    public static void printGameResult(Game game) {
        System.out.println("\n실행 결과");
        game.proceedGame();
    }

    public static void printWinners(Game game) {
        String winner = String.join(",", game.getWinnerList());
        System.out.println(winner + "가 최종 우승했습니다.");
    }
}
