package baseball.view;

import baseball.common.Validator;
import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    public static List<Integer> getPlayerNumber() {
        List<Integer> numbers;
        try {
            numbers = getPlayer();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return getPlayerNumber();
        }
        return numbers;
    }

    private static List<Integer> getPlayer() throws IllegalAccessException {
        List<Integer> numbers = new ArrayList<>();
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        Validator.isValidation(input);
        for (String number : input.split("")) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }

}
