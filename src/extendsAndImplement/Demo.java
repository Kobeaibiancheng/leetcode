package extendsAndImplement;

public class Demo {
    public static void main(String[] args) {
        IBookService iBookService = new KeXueBookService();
        iBookService.calculate("yuxaing","科学书",100.00);
    }
}
