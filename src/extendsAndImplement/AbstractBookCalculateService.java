package extendsAndImplement;

public abstract class AbstractBookCalculateService implements IBookService{
    @Override
    public Double calculate(String userId, String bookName, double originalPrice) {
        System.out.println("现在走的是这里");
        if ("yuxiang".equals(userId)) {
            return originalPrice;
        }

        return doCalculate(userId,bookName,originalPrice);
    }

    protected abstract Double doCalculate(String userId, String bookName, double originalPrice);
}
