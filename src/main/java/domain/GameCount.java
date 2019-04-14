package domain;

public class GameCount {

    private final int gameCount;

    public GameCount(int gameCount) {
        this.gameCount = gameCount;
        if (gameCount <= 0) {
            throw new IllegalArgumentException("0번 이상 게임 횟수 입력하세요");
        }
    }

    public int intValue() {
        return gameCount;
    }
}
