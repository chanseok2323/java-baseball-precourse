package baseball.domain;

import java.util.List;

public class Rule {

    private int containCnt;

    public int strike(List<Integer> computer, List<Integer> player) {
        return getStrike(computer, player);
    }

    public int ball(List<Integer> computer, List<Integer> player) {
        int cnt = containCnt(computer, player);
        if(cnt == 0) return 0;

        int strike;
        strike = getStrike(computer, player);

        return containCnt - strike;
    }

    private int getStrike(List<Integer> computer, List<Integer> player) {
        int strike = 0;
        for (int index = 0; index < computer.size(); index++) {
            if(hasValue(computer, index, player.get(index))) strike++;
        }
        return strike;
    }

    public int containCnt(List<Integer> computer, List<Integer> player) {
        this.containCnt = 0;
        for(int i=0; i < computer.size(); i++) {
            if(player.contains(computer.get(i))) {
                this.containCnt++;
            }
        }
        return this.containCnt;
    }

    public boolean hasValue(List<Integer> computer, int index, int value) {
        return computer.get(index) == value;
    }

}
