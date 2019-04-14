package domain;

public class Car implements Comparable<Car> {
    private static final String LOAD = "-";
    private static final String BLANK_REGEX = "\\s*";

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
        checkIfValidName();
        checkIfBlank();
    }

    private void checkIfBlank() {
        if (name.matches(BLANK_REGEX)) {
            throw new IllegalArgumentException("이름에 빈칸을 입력하지마세요");
        }
    }

    private void checkIfValidName() {
        if (name.length() > 5) {
            throw new IllegalArgumentException("5자 이하의 이름을 입력하세요");
        }
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

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Car o) {
        return new Integer(this.position)
                .compareTo(o.position);
    }

    public boolean isMaxPositoin(int maxPosition) {
        return this.position == maxPosition;
    }
}
