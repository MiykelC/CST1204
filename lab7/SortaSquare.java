package lab7;

import java.util.Set;
import java.util.HashSet;

public class SortaSquare {

    public static Set<Integer> getSortaSquares(Set<Integer> s) {
       
        Set<Integer> resultSet = new HashSet<Integer>();
        for (Integer x : s) {
            if (check(x)) {
                resultSet.add(x);
            }
            ;
        }
        
        return resultSet;
    }

    private static boolean check(Integer x) {
        boolean result = false;
        int n = -1;
        int b = (int) Math.sqrt(x);
        while (b > 0) { // my stopping criteria
            int a = 1;
            while (a < b) {
                n = a  * b;
                if (n == x) {
                    result = true;
                    break;
                }
                a++;
            }
            b--;
        }
        return result;
    }
}
