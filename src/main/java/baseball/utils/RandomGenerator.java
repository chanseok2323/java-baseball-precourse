package baseball.utils;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    public static List<Integer> createRandom() {
        List<Integer> result = new ArrayList<>();
        while(result.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if(!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
