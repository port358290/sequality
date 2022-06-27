package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected1 = 5;
    double expected2 = 2.5;
    double delta = 0;
    int arg1 = 2, arg2 = 3;
    int measured1 = calculate.sum(arg1, arg2);
    double measured2 = calculate.sum_ave(arg1, arg2);
    assertEquals(expected1, measured1);
    assertEquals(expected2, measured2, delta);
    System.out.println("Sum of" + arg1 + " and" + arg2 + "is " + measured1 + ". Average is " + measured2 + ".");
    arg1 = 1;
    arg2 = 10;
    measured1 = calculate.factorial(arg1, arg2);
    measured2 = calculate.factorial_ave(arg1, arg2);
  }
}
