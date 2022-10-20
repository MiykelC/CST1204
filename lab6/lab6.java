package lab6;

public class lab6 {
  public static int firstUniqueChar(String s) {
    int[] count = new int[26];

    int n = s.length();
    for (int i = 0; i < n; i++) {
      int index = s.charAt(i) - 'a';
      count[index]++;
    }
    for (int i = 0; i < n; i++) {
      int index = s.charAt(i) - 'a';
      if (count[index] == 1) {
        return i;
      }

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
