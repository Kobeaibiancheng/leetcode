package nowcoder;

class Book {
    String name;
    int stock;
    double price;
    int saleCount;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", saleCount=" + saleCount +
                '}';
    }
}
