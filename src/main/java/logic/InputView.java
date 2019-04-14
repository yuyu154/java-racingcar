package logic;

import domain.Car;
import util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static List<Car> getCarsList() {
        System.out.println("경주할 자동차 이름을 입력하세요. 쉼표 기준으로 구분하시고 " +
                ",가 포함된 이름을 쓸 수 없습니다");
        return makeCarList(InputUtil.getStrSplitWithComma());
    }

    private static List<Car> makeCarList(List<String> stringList) {
        List<Car> carList = new ArrayList<>();
        for (String str : stringList) {
            carList.add(new Car(str));
        }
        return carList;
    }

    public static int getGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return InputUtil.getInt();
    }
}
