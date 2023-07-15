package woni.class1.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator;
  @Test
  @DisplayName("13 더하기 5는 18이 나온다")
  void calculatorTest() {


    int[] arr = new int[2];
    arr[0] = 13;
    arr[1] = 5;
    int result = arr[0] + arr[1];

    assertEquals(18,result);

  }

}