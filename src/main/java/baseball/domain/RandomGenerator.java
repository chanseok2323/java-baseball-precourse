package baseball.domain;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private static final int START_INDEX = 1;
    private static final int FINAL_INDEX = 9;

    public static List<Integer> createRandom() {
        List<Integer> result = new ArrayList<>();
        while(result.size() < 3) {
            int number = Randoms.pickNumberInRange(START_INDEX, FINAL_INDEX);
            if(!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
