package extendsAndImplement;

public class ManHuaBookService extends AbstractBookCalculateService{
    @Override
    protected Double doCalculate(String userId, String bookName, double originalPrice) {
        System.out.println(bookName);
        double deductionPrice = originalPrice - 20;
        System.out.println("原价为"+originalPrice+" 减二十块，现价为" + deductionPrice);
        return deductionPrice;
    }
}
