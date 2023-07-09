package prosky.skyprospringcalculator2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prosky.skyprospringcalculator2.exceptions.NotAllParametersAreGivenException;
import prosky.skyprospringcalculator2.services.Calculator2Service;
import prosky.skyprospringcalculator2.services.Calculator2ServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SkyproSpringCalculator2ApplicationTests {

    Calculator2Service calculator2Service;

    @BeforeEach
    public void setUp() {
        calculator2Service = new Calculator2ServiceImpl();
    }

    @Test
    void hello() {

        String actual = calculator2Service.hello();
        String expected = "Welcome to the Calculator!";

        assertEquals(actual, expected);

    }

    @Test
    void plus() {

        String a = "6";
        String b = "3";

        String expected = "6 + 3 = 9";
        String actual = calculator2Service.plus(a, b);

        assertEquals(actual, expected);
    }

    @Test
    void plusOneParameterNotGiven() {

        String a = "6";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.plus(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }


    @Test
    void plusTwoParametersNotGiven() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.plus(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void minus() {

        String a = "6";
        String b = "3";

        String expected = "6 - 3 = 3";
        String actual = calculator2Service.minus(a, b);

        assertEquals(actual, expected);
    }

    @Test
    void minusOneParameterNotGiven() {

        String a = "6";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.minus(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void minusTwoParametersNotGiven() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.minus(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void multiply() {

        String a = "6";
        String b = "3";

        String expected = "6 * 3 = 18";
        String actual = calculator2Service.multiply(a, b);

        assertEquals(actual, expected);
    }

    @Test
    void multiplyOneParameterNotGiven() {

        String a = "6";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.multiply(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void multiplyTwoParametersNotGiven() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.multiply(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void divide() {

        String a = "6";
        String b = "3";

        String expected = "6 / 3 = 2";
        String actual = calculator2Service.divide(a, b);

        assertEquals(actual, expected);
    }

    @Test
    void divideOneParameterNotGiven() {

        String a = "6";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.divide(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void divideTwoParametersNotGiven() {

        String a = "";
        String b = "";

        Throwable exception = assertThrows(NotAllParametersAreGivenException.class, () -> calculator2Service.divide(a, b));
        assertEquals("Not all parameters are given", exception.getMessage());
    }

    @Test
    void divideDivisionByZeroException() {

        String a = "6";
        String b = "0";

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator2Service.divide(a, b));
        assertEquals("Division by zero", exception.getMessage());
    }
}
