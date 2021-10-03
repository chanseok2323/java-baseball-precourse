package baseball.view;

import nextstep.utils.Console;

public class OutputView {
    public static boolean isFinish() {
        String input = Console.readLine();
        if(Integer.parseInt(input) == 1) {
            return true;
        }
        return false;
    }
}
