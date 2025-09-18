package string;

import java.util.Scanner;

/**
 * 小红拿到一个仅有包含含小写字母的字符串s，下标从1开始，对于每个下标p，如果p的二进制表示中1的个数是奇数，则将第p个字符转换成对应的大写字母
 */
public class StringOfXiaoHong {


    public static int function(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++){
                String s = sc.nextLine();
                StringBuilder str = new StringBuilder();
                for(int j = 1; j <= s.length(); j++){
                    char c = s.charAt(j-1);
                    if(function(j)%2 == 1){
                        str.append(Character.toUpperCase(c));
                    }else{
                        str.append(c);
                    }
                }
                System.out.println(str.toString());
            }
        }
    }
}
