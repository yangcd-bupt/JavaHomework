package SaleCode;

/**
 * 代表一个销售项目
 */
public class _2018210913_杨成栋_大作业_SaleLineItem {
    private int copies;
    private _2018210913_杨成栋_大作业_ProductSpecification prodSpec;
    private _2018210913_杨成栋_大作业_IPricingStrategy strategy;
    private double total;

    public _2018210913_杨成栋_大作业_SaleLineItem(){}

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setProdSpec(_2018210913_杨成栋_大作业_ProductSpecification prodSpec) {
        this.prodSpec = prodSpec;
    }

    public void setStrategy(_2018210913_杨成栋_大作业_IPricingStrategy strategy) {
        this.strategy = strategy;
    }

    public int getCopies() {
        return copies;
    }

    public _2018210913_杨成栋_大作业_IPricingStrategy getStrategy() {
        return strategy;
    }

    public _2018210913_杨成栋_大作业_ProductSpecification getProdSpec() {
        return prodSpec;
    }

    public double getSubTotal(){
        total=strategy.getSubTotal(this);
        return total;
    }
}
