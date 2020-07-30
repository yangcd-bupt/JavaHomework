package SaleCode;

/**
 * 按百分比进行优惠的策略
 */
public class _2018210913_杨成栋_大作业_PercentageStrategy implements _2018210913_杨成栋_大作业_IPricingStrategy {
    private int discountPercentage;
    private double total;

    public _2018210913_杨成栋_大作业_PercentageStrategy(){}

    public _2018210913_杨成栋_大作业_PercentageStrategy(int discountPercentage){
        this.discountPercentage=discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public double getSubTotal(_2018210913_杨成栋_大作业_SaleLineItem saleLineItem) {
        total=saleLineItem.getCopies()*saleLineItem.getProdSpec().getPrice()*(1-discountPercentage*0.01);
        return total;
    }
}
