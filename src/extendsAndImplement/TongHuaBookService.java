package extendsAndImplement;

public class TongHuaBookService extends AbstractBookCalculateService{
    @Override
    protected Double doCalculate(String userId, String bookName, double originalPrice) {
        System.out.println(bookName);
        double deductionPrice = originalPrice - 30;
        System.out.println("原价为"+originalPrice+" 减三十块，现价为" + deductionPrice);
        return deductionPrice;
    }
}
