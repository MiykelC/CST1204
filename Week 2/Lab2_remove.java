public class Lab2_remove {
    public int Lab2remove(int[] num, int val) {
        int a = 0;
        for (int b = 0; b < num.length; b++) {
            if (num[b] != val) {
                num[a] = num[b];
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int num[] = {0,1,2,2,3,0,4,2};
        int a = num.length;
        Lab2_remove RE = new Lab2_remove();
        a = RE.Lab2remove(num, 2);
        for (int b = 0; b < a; b++) {
            System.out.print(" " + num[b]);
        }
    }
}