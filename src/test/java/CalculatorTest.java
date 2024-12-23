import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("테스트 함수 실행")
    public void test1(){
        System.out.println("test1");
    }

    @Test
    @DisplayName("run 함수 실행")
    public void t2(){
        Calc calc = new Calc();
        int rs = calc.run("1");
    }

    @Test
    @DisplayName("1+1 실행")
    public void t3(){
        Calc calc = new Calc();
        String rs = calc.calcu("1 + 1");
        Assertions.assertThat(rs).isEqualTo("2");
    }

    @Test
    @DisplayName("단항식 실행")
    public void t4(){
        Calc calc = new Calc();
        String rs = calc.calcu("1 + 1 * 3");
        Assertions.assertThat(rs).isEqualTo("4");
    }

    @Test
    @DisplayName("run 함수 단항식 체크")
    public void t5(){
        Calc calc = new Calc();
        int rs = calc.run("1 + 1");
        Assertions.assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("run 함수 다항식 체크")
    public void t6(){
        Calc calc = new Calc();
        int rs = calc.run("((3 + 5) * 5 + -10) * 10 / 5");
        Assertions.assertThat(rs).isEqualTo(60);
    }
}
