package lab6;
import java.util.HashMap;


public class lab6 {
  public static int firstUniqueChar(String s) {
    HashMap<Character, Integer> count = new HashMap<Character, Integer>();
    int n = s.length();
    // building a hash map
    // to know how many times a character appears
    // in the string
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      count.put(c, count.getOrDefault(c, 0) + 1);
    }

    // find the index of the string
   // where the first unique character appears
    for (int i = 0; i < n; i++) {
      if (count.get(s.charAt(i)) == 1)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    String s = "leetcode";
    String s2 = "loveleetcode";
    System.out.println(firstUniqueChar(s));
    System.out.println(firstUniqueChar(s2));
  }
}
