package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void 볼3개일경우() {
        Rule rule = new Rule();
        int result = rule.ball(Arrays.asList(1, 3, 2), Arrays.asList(3, 2, 1));
        Assertions.assertThat(result).isSameAs(3);
    }

    @Test
    void 스트라이크가3개일경우() {
        Rule rule = new Rule();
        int result = rule.strike(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        Assertions.assertThat(result).isSameAs(3);
    }

    @Test
    void 낫싱일때() {
        Rule rule = new Rule();
        int result = rule.containCnt(Arrays.asList(1, 2, 3), Arrays.asList(7, 8, 9));
        Assertions.assertThat(result).isSameAs(0);
    }
}