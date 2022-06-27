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

  public double sum_ave(int x, int y) {
    return (x + y) / 2;
  }

  public double factorial_ave(int x, int y) {
    int ans = 0;
    int num = 0;
    for (int i = x; i <= y; i++) {
      ans += i;
      num++;
    }
    return ans / num;
  }

  public int factorial_odd(int x, int y) {
    int ans = 0;
    for (int i = x; i <= y; i++) {
      if (i %= 2 == 0) {

      }
    }
    return ans;
  }
}
