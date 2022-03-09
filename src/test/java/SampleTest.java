import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void fact_of_negative_should_produce_an_exception() {
        int n = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> Sample.fact(n));
    }

    @Test
    void multiplying_10_by_2_should_produce_20() {
        int a = 10; // (1)
        int b = 2;
        int res = Sample.op(Sample.Operation.MULT,a, b); // (2)
        Assertions.assertThat(res).as("multiplication of 10 with 2")
                .isEqualTo(20); // (3)
    }

    @Test
    void adding_1_and_1_should_produce_2() {
        int a = 1;
        int res = Sample.op(Sample.Operation.ADD,a,a);
        Assertions.assertThat(res).as("Addition of 1 and 1")
                .isEqualTo(2);
    }

    @Test
    void fact_of_3_should_produce_6() {
        int a = 3;
        int res = Sample.fact(a);
        Assertions.assertThat(res).as("Fact of 3")
                .isEqualTo(6);
    }
}