/*
 * Parser.java
 */

package domain;

import java.util.ArrayList;
import java.util.List;

class Parser {
	private final static String COMMA_PATTERN = ",";
	private final static String BLANK_PATTERN = "\\s*";
	private static final int NAME_MAX = 5;

	public static List<Car> strToListOfCar(String input) throws InputException {
		checkBlank(input);
		return makeCarList(input);
	}

	private static List<Car> makeCarList(String input) throws InputException {
		List<Car> carList = new ArrayList<>();
		String[] strArr = splitStrWithComma(input);
		for (String carName : strArr) {
			carList.add(makeCar(carName.trim()));
		}
		return carList;
	}

	private static Car makeCar(String carName) throws InputException {
		checkBlank(carName);
		checkCarName(carName);
		return new Car(carName);
	}

	private static String[] splitStrWithComma(String inputOfCarNames) {
		return inputOfCarNames.split(COMMA_PATTERN);
	}

	private static void checkBlank(String input) throws InputException {
		if (input.matches(BLANK_PATTERN)) {
			throw new InputException("빈 칸을 입력했습니다");
		}
	}

	private static void checkCarName(String input) throws InputException {
		if (input.length() > NAME_MAX) {
			throw new InputException("자동차 이름을 5자 이상 입력했습니다");
		}
	}

	public static int strToInt(String input) throws InputException {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new InputException ("숫자를 입력해주세요");
		}
	}

}
