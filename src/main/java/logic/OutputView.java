package logic;

import domain.Game;

public class OutputView {
    private static final String COMMA = ",";

    public static void printGameResult(Game game) {
        System.out.println("실행 결과");
        game.proceedGame();
    }

    public static void printWinners(Game game) {
        String winner = String.join(COMMA, game.getWinnerList());
        System.out.println(winner + "가 최종 우승했습니다.");
    }
}
