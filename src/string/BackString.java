package string;

import java.util.Scanner;

public class BackString {


    public static void function(String s,String t){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String t = sc.nextLine();
            StringBuilder newS = new StringBuilder(s);
            int j = 0;
            for(j = 0; j < s.length(); j++){
                if(newS.toString().equals(t)){
                    System.out.println("Yes");
                    break;
                }else{
                    newS = new StringBuilder(newS.append(newS).substring(s.length()-1,s.length()*2-1));
                }
            }
            if(j == s.length()){
                System.out.println("No");
            }

        }


    }
}
