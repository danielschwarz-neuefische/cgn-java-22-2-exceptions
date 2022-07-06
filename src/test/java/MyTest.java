import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    void divide() {
        int result = 10 / 2;
        System.out.println(result);
        Assertions.assertEquals(5, result);
    }

    @Test
    void divide2() {
        int result = 3 / 0;
        System.out.println(result);
        Assertions.assertEquals(5, result);
    }

    @Test
    void outOfBound() {
        int[] numbers = new int[2];
        System.out.println(numbers[2]);
    }

    @Test
    void nullPointer() {
        String a = null;
        a.length();
    }

}
