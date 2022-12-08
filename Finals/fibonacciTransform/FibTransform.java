package Finals.fibonacciTransform;




import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class FibTransform {

  /**
   * Transform a number into a Fibonacci number using at most m steps: Of
   * these steps, one can be a doubling step, and the other steps increase
   * the number at hand by adding 1.
   * 
   * We are only interested in Fibonacci numbers that can represented as
   * Integer or int.
   * 
   * @param n
   *          the number to transform to a Fibonacci number, n >= 0
   * @param m
   *          the number of transformation steps permitted, m >= 0
   * @return true if the transformation is possible and false otherwise
   */
  public static boolean isPossible_onlyOneDoubling(int n, int m) {
    if (n == 0 && m == 0) {
      return true;
    } else if (n == 0 || m == 0) {
      return false;
    }

    Set<Integer> set = new HashSet<Integer>();
    set.add(1);
    set.add(2;)
  }

  /**
   * Transform a number into a Fibonacci number using at most m steps: One can
   * use any sequence of doubling (*2) or addition (+1) steps as long as the
   * total number of steps used is no more than m.
   * 
   * We are only interested in Fibonacci numbers that can represented as
   * Integer or int.
   * 
   * @param n
   *          the number to transform to a Fibonacci number, n >= 0
   * @param m
   *          the number of transformation steps permitted, m >= 0
   * @return true if the transformation is possible and false otherwise
   */
  public static boolean isPossible(int n, int m) {
    
    return false;
     
  }

}