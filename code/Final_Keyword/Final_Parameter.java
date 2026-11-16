class Solution {
  static void display(final int age) {
    System.out.println(age);
    // age = 25; // Compilation error
  }
}

public class Final_Parameter {
  public static void main(String[] args) {
    Solution s1 = new Solution();
    s1.display(29);
  }
}
