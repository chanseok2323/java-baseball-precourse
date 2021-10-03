package baseball.domain;

import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class BaseballGame {

    private Referee referee;

    public void createGame() {
        do{
            play();
        } while (OutputView.isFinish());
    }

    public void play() {
        List<Integer> computer = RandomGenerator.createRandom();

        List<Integer> player;
        do{
            referee = new Referee();
            player = InputView.getPlayerNumber();
        } while (!referee.compareValue(computer, player));
    }
}
