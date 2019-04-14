package domain;

import util.InputUtil;

public class Car {
    private static final String LOAD = "-";

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            this.position++;
        }
    }

    public String getLine() {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < this.position; i++) {
            ret.append(LOAD);
        }
        return ret.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
