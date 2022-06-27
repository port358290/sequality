package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int factorial(int x, int y) {
    int ans = 0;
    for (int i = x; i <= y; i++) {
      ans += i;
    }
    return ans;
  }

  public int sum_ave(int x, int y) {
    return (x + y) / 2;
  }

  public int factorial_ave(int x, int y) {
    return (x + y) / 2;
  }
}
