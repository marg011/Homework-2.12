package prosky.skyprospringcalculator2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import prosky.skyprospringcalculator2.services.Calculator2Service;
import prosky.skyprospringcalculator2.services.Calculator2ServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator2ParameterizedTest {

    Calculator2Service calculator2Service;

    @BeforeEach
    public void setUp() {
        calculator2Service = new Calculator2ServiceImpl();
    }

    public static Stream<Arguments> ProvideParametersForTestPlus(){
        return Stream.of(
                Arguments.of("5 + 5 = 10", "5", "5"),
                Arguments.of("10 + -80 = -70", "10", "-80")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideParametersForTestPlus")
    void plus(String expected, String num1, String num2) {
        String actual = calculator2Service.plus(num1, num2);
        assertEquals(actual, expected);
    }


    public static Stream<Arguments> ProvideParametersForTestMinus(){
        return Stream.of(
                Arguments.of("5 - 5 = 0", "5", "5"),
                Arguments.of("10 - -80 = 90", "10", "-80")
        );
    }
    @ParameterizedTest
    @MethodSource("ProvideParametersForTestMinus")
    void minus(String expected, String num1, String num2) {
        String actual = calculator2Service.minus(num1, num2);
        assertEquals(actual, expected);
    }


    public static Stream<Arguments> ProvideParametersForTestMultiply(){
        return Stream.of(
                Arguments.of("5 * 5 = 25", "5", "5"),
                Arguments.of("10 * -80 = -800", "10", "-80")
        );
    }
    @ParameterizedTest
    @MethodSource("ProvideParametersForTestMultiply")
    void multiply(String expected, String num1, String num2) {
        String actual = calculator2Service.multiply(num1, num2);
        assertEquals(actual, expected);
    }

    public static Stream<Arguments> ProvideParametersForTestDivide(){
        return Stream.of(
                Arguments.of("5 / 5 = 1", "5", "5"),
                Arguments.of("100 / -10 = -10", "100", "-10")
        );
    }
    @ParameterizedTest
    @MethodSource("ProvideParametersForTestDivide")
    void divide(String expected, String num1, String num2) {
        String actual = calculator2Service.divide(num1, num2);
        assertEquals(actual, expected);
    }
}
