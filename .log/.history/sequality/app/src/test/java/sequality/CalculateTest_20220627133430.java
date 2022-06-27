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
    int Measured1 = calculate.sum(arg1, arg2);
    double Measured2 = calculate.sum_ave(arg1, arg2);
    assertEquals(expected1, Measured1);
    assertEquals(expected2, Measured2, delta);
    System.out.println("Sum of" + expected1 + " and " + e + "is 5. Average is 2.5.");
  }
}
