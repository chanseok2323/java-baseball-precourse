package baseball.utils;

import java.util.List;

public class CompareUtil {
    public int count(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for(int i=0; i < computer.size(); i++) {
            if(player.contains(computer.get(i))) {
                result++;
            }
        }
        return result;
    }

    public boolean hasValue(List<Integer> player, int index, int value) {
        return player.get(index) == value;
    }
}
