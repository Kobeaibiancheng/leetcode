package xj915;

public class Demo3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9999; i++) {
            int a = i/1000;
            int b = i/100%10;
            int c = i/10%10;
            int d = i%10;
            if (c*1000+a*100+b*10+d*1+i == 9102){
                System.out.print(a+""+b+""+c+""+d);
                System.out.print(" ");
            }
        }
    }
}
