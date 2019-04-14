package util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtil {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String COMMA = ",";

    public static int getInt() {
        try {
            return Integer.parseInt(getString());
        } catch (RuntimeException e) {
            System.out.println("숫자를 입력하세요");
            return getInt();
        }
    }

    public static List<String> getStrSplitWithComma() {
        try {
            return Arrays.asList(getString().split(COMMA));
        } catch (RuntimeException e) {
            return getStrSplitWithComma();
        }
    }

    private static String getString() {
        return SCANNER.nextLine();
    }
}
