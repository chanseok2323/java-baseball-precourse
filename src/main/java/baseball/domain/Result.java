package baseball.domain;

import baseball.common.Const;

import java.util.List;

public class Result {

    private static final int ZERO = 0;
    private static final int DEFAULT_STRIKE_CNT = 3;
    private int strikeCnt;
    private int ballCnt;
    private Rule rule;

    public Result(List<Integer> computer, List<Integer> player) {
        rule = new Rule();
        this.strikeCnt = rule.strike(computer, player);
        this.ballCnt = rule.ball(computer, player);
    }


    public void getResult() {
        StringBuilder sb = new StringBuilder();
        if(strikeCnt == ZERO && ballCnt == ZERO) sb.append(Const.NOTING_MSG);
        if(strikeCnt > ZERO) sb.append(strikeCnt).append(Const.STRIKE_MSG) ;
        if(ballCnt > ZERO) sb.append(ballCnt).append(Const.BALL_MSG);
        System.out.println(sb);
    }

    public boolean isSuccess() {
        if(strikeCnt == DEFAULT_STRIKE_CNT) {
            System.out.println(Const.FINISH_MSG);
            return true;
        }
        return false;
    }
}
