package nowcoder;







import java.util.Scanner;

public class Test915 {
    //判断是否是回文串
    /*public static boolean isReverse(String str) {
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true;
    }*/

    public static void main(String[] args) {
        Book[] books = new Book[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书籍信息");
        for (int i = 0; i < 30; i++) {
            books[i] = new Book();
            String name = sc.next();
            books[i].name = name;
            int stock = sc.nextInt();
            books[i].stock = stock;
            double price = sc.nextDouble();
            books[i].price = price;
            books[i].saleCount = 0;
        }
        for (int i = 0; i < 100; i++) {
            String name = sc.next();
            for (int j = 0; j < 30; j++) {
                if (books[j].name.equals(name)) {
                    books[j].stock--;
                    books[j].saleCount++;
                }
            }
        }
        //System.out.println(isReverse(sc.nextLine()));
        /*while(sc.hasNext()) {
            String str1 = sc.next();
            System.out.println(str1);
            char[] arr = str1.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }*/
    }
}
