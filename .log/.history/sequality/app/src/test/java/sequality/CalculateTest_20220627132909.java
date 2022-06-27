package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected1 = 5;
    float expected2 = 5;
    int Measured1 = calculate.sum(2, 3);
    float Measured2 = calculate.sum_ave(2, 3);
    assertEquals(expected1, calculate.sum(2, 3));
    assertEquals(expected2, calculate.sum_ave(2, 3));
    System.out.println("Sum of 2 and 3 is 5. Average is 2.5.");
  }
}
