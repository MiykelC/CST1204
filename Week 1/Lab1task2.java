

public class Lab1task2 {
    static void solution(int[] array) {
       int dup = 0;
       int length = array.length - 1;
       for (int a = 0; a <= length - dup; a++) {
           if (array[a] == 0) {
               if (a == length - dup) {

                   array[length] = 0;
                   length -= 1;
                   break;
               }
               dup++;
           }
       }
       int last = length - dup;
       for (int b = last; b >= 0; b--) {
           if (array[b] == 0) {
               array[b + dup] = 0;
               dup--;
               array[b + dup] = 0;
           } else {
               array[b + dup] = array[b];
           }
       }
   }


   public static void main(String[] args) {
        int [] arr = new int[]{1,0,2,3,0,4,5,0};
        solution(arr);
        System.out.println(arr[2]); //0
        System.out.println(arr[6]); //0
        System.out.println(arr[7]); //4

   }
}
