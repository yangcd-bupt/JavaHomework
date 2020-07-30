package SaleCode;

/**
 * 按每本优惠x元的策略
 */
public class _2018210913_杨成栋_大作业_FlatRateStrategy implements _2018210913_杨成栋_大作业_IPricingStrategy {
    private double discountPerBook;
    private double total;

    public _2018210913_杨成栋_大作业_FlatRateStrategy(){}

    public _2018210913_杨成栋_大作业_FlatRateStrategy(double discountPerBook){
        this.discountPerBook=discountPerBook;
    }

    public void setDiscountPerBook(double discountPerBook) {
        this.discountPerBook = discountPerBook;
    }

    public double getDiscountPerBook() {
        return discountPerBook;
    }

    @Override
    public double getSubTotal(_2018210913_杨成栋_大作业_SaleLineItem saleLineItem) {
        total=saleLineItem.getCopies()*(saleLineItem.getProdSpec().getPrice()-discountPerBook);
        return total;
    }
}
