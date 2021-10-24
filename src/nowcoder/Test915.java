package nowcoder;

import java.util.Scanner;

public class Test915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            System.out.println(str1);
            char[] arr = str1.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
