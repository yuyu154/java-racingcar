package logic;

import domain.Car;
import domain.GameCount;
import util.InputUtil;

import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public static List<Car> getCarsList() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요. 쉼표 기준으로 구분하시고 " +
                    ",가 포함된 이름을 쓸 수 없습니다");
            return makeCarList(InputUtil.getStrSplitWithComma());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCarsList();
        }
    }

    private static List<Car> makeCarList(List<String> stringList) {
        return stringList.stream()
                .map(carname -> carname.trim())
                .map(carname -> new Car(carname))
                .collect(Collectors.toList());
    }

    public static GameCount getGameCount() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            return new GameCount(InputUtil.getInt());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameCount();
        }
    }
}
