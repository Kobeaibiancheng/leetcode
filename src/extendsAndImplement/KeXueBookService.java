package extendsAndImplement;

public class KeXueBookService extends AbstractBookCalculateService{
    String userId = "yuxaing";
    String bookName = "科学书1";
    double originalPrice = 100.00;

    @Override
    protected Double doCalculate(String userId, String x, double originalPrice) {
        System.out.println("然后走子类KeXueBookService");
        System.out.println(bookName);
        double deductionPrice = originalPrice - 10;
        System.out.println("原价为"+originalPrice+" 减十块，现价为" + deductionPrice);
        return deductionPrice;
    }
}
