package SaleCode;

public class _2018210913_杨成栋_大作业_NoDiscountStrategy implements _2018210913_杨成栋_大作业_IPricingStrategy {
    private double total;
    @Override
    public double getSubTotal(_2018210913_杨成栋_大作业_SaleLineItem saleLineItem) {
        total=saleLineItem.getCopies()*saleLineItem.getProdSpec().getPrice();
        return total;
    }
}
