package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;


    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    //3.3
    @Test
    void zeroPurchaseAmountAndZeroDiscountTest() {
        double purchaseAmount = 0;
        int discountAmount = 0;
        double expectedDiscountedAmount = 0;
        double actualDiscountedAmount = someService.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    void negativePurchaseAmountTest() {
        double purchaseAmount = -100;
        int discountAmount = 10;
        assertThatThrownBy(() -> someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void discountAmountGreaterThan100Test() {
        double purchaseAmount = 2000.0;
        int discountAmount = 110;
        assertThatThrownBy(() -> someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void negativeDiscountAmountTest() {
        double purchaseAmount = 2000.0;
        int discountAmount = -10;
        assertThatThrownBy(() -> someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void nonZeroPurchaseAmountAndZeroDiscountTest() {
        double purchaseAmount = 2000.0;
        int discountAmount = 0;
        double expectedDiscountedAmount = 2000.0;
        double actualDiscountedAmount = someService.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    void nonZeroPurchaseAmountAndNonZeroDiscountTest() {
        double purchaseAmount = 2000.0;
        int discountAmount = 10;
        double expectedDiscountedAmount = 1800.0;
        double actualDiscountedAmount = someService.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    void testReturnfizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");

    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnfizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnEcho() {
        assertThat(someService.fizzBuzz(14)).isEqualTo("" + 14);
    }

    @Test
    void firstLastSixElement() {
        assertTrue(someService.firstLast6(new int[]{6, 1, 2, 3}));
    }


    @Test
    void LastSixElement() {
        assertTrue(someService.firstLast6(new int[]{1, 2, 3, 6}));
    }

    @Test
    void firstLastNoSixElement() {
        assertFalse(someService.firstLast6(new int[]{1, 2, 3,}));
    }

    @Test
    void luckySumA(){
        assertThat(someService.luckySum(13,2,3)).isEqualTo(5);
    }

    @Test
    void luckySumB(){
        assertThat(someService.luckySum(2,13,3)).isEqualTo(5);
    }

    @Test
    void luckySumC(){
        assertThat(someService.luckySum(3,2,13)).isEqualTo(5);
    }

    @Test
    void luckySumNot13(){
        assertThat(someService.luckySum(1,2,3)).isEqualTo(6);
    }


}
