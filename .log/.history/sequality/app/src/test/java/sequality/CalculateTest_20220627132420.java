package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    assertEquals(expected, calculate.factorial(x, y));
    assertEquals(expected, calculate.sum(2, 3));
    System.out.println("Sum of 2 and 3 is 5. Average is 2.5.");
    System.out.println("Sum of 2 and 3 is 5. Average is 2.5.");
    System.out.println("Sum of 2 and 3 is 5. Average is 2.5.");
  }
}
