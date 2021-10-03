package baseball.domain;

import java.util.List;

public class Referee {

    private Result baseball;

    public boolean compareValue(List<Integer> computer, List<Integer> player) {
        baseball = new Result(computer, player);
        baseball.getResult();

        return baseball.isSuccess();
    }
}
