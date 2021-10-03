package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void 스트라이크3개일때True반환() {
        Result baseball = new Result(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        boolean result = baseball.isSuccess();
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void 스트라이크가3개가아닐때False반환() {
        Result baseball = new Result(Arrays.asList(3,2,1), Arrays.asList(1,2,3));
        boolean result = baseball.isSuccess();
        Assertions.assertThat(result).isFalse();
    }
}