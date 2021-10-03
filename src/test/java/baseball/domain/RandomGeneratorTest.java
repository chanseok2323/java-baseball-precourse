package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RandomGeneratorTest {

    @Test
    void 랜덤값생성3개() {
        List<Integer> generator = RandomGenerator.createRandom();
        Assertions.assertThat(generator.size()).isSameAs(3);
    }
}