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
}
