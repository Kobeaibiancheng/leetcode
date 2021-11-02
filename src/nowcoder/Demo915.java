package nowcoder;
import java.util.Scanner;


//结点的数据结构
class SingleList<T>{
    T data;
    SingleList link;

    //构造方法
    public SingleList(T data) {
        this.data = data;
    }
}

public class Demo915 {
    //查找链表倒数倒数第k个结点
    public static int lastK(SingleList list,int k){
        SingleList fast = list;
        SingleList slow = list;
        for (int i = 0; i < k-1; i++) {
            if (fast.link != null){
                fast = fast.link;
            }else {
                return 0;
            }
        }
        while (fast.link != null) {
            fast = fast.link;
            slow = slow.link;
        }
        if (slow == list){//头结点
            return 0;
        }
        System.out.println(slow.data);
        return 1;
    }

    public static void main(String[] args) {
        SingleList<Integer> singleList = new SingleList(-1);
        SingleList node1 = new SingleList<Integer>(1);
        singleList.link = node1;
        SingleList node2 = new SingleList<Integer>(2);
        node1.link = node2;
        SingleList node3 = new SingleList<Integer>(3);
        node2.link = node3;
        SingleList node4 = new SingleList<Integer>(4);
        node3.link = node4;
        SingleList node5 = new SingleList<Integer>(5);
        node4.link = node5;
        System.out.println(lastK(singleList,6));
    }
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
    public static void main1(String[] args) {
        Book[] books = new Book[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书籍信息");
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("书名");
            books[i].name = sc.next();
            System.out.println("库存");
            books[i].stock = sc.nextInt();
            System.out.println("单价");
            books[i].price = (double) sc.nextInt();
            books[i].saleCount = 0;
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println("书名："+books[i].name+" "+"库存："
                    +books[i].stock+" "+"单价："+books[i].price+" "+"销售量："+books[i].saleCount);
        }
        System.out.println("请输入要购买书籍的书名");
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            for (int j = 0; j < books.length; j++) {
                if (books[j].name.equals(name)) {
                    books[j].stock--;
                    books[j].saleCount++;
                }
            }
        }
        //排序前
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name + " ");
        }
        //对书籍按照销售量进行排序，由大到小排序
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length-1-i; j++) {
                if (books[j+1].saleCount > books[j].saleCount){
                    Book tmp = books[j+1];
                    books[j+1] = books[j];
                    books[j] = tmp;
                }
            }
        }
        //排序后
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name + " ");
        }
        for (int i = 0; i < books.length; i++) {
            System.out.print("书名："+books[i].name+" "+"库存："+books[i].stock+" "+"单价："+books[i].price+" "+"销售量："+books[i].saleCount);
            System.out.println();
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
