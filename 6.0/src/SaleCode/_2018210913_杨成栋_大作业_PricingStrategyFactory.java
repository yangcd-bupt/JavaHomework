package SaleCode;

/**
 * 负责根据书的类型提供对应的策略类
 * 该策略工厂要设计成单子
 */
public class _2018210913_杨成栋_大作业_PricingStrategyFactory {
    private volatile static _2018210913_杨成栋_大作业_PricingStrategyFactory instance;
    private _2018210913_杨成栋_大作业_IPricingStrategy iPricingStrategy;
    private double discountPerBook=1;
    private int discountPercentage1=7;
    private int discountPercentage2=3;

    private _2018210913_杨成栋_大作业_PricingStrategyFactory(){}

    public static _2018210913_杨成栋_大作业_PricingStrategyFactory getInstance(){
        if (instance == null) {
            synchronized (_2018210913_杨成栋_大作业_PricingStrategyFactory.class) {//双重校验锁
                if (instance == null) {
                    instance = new _2018210913_杨成栋_大作业_PricingStrategyFactory();
                }
            }
        }
        return instance;
    }

    public _2018210913_杨成栋_大作业_IPricingStrategy getPricingStrategy(int bookType){
        switch (bookType){
            case 0:iPricingStrategy=new _2018210913_杨成栋_大作业_NoDiscountStrategy();break;
            case 1:iPricingStrategy=new _2018210913_杨成栋_大作业_FlatRateStrategy(discountPerBook);break;
            case 2:iPricingStrategy=new _2018210913_杨成栋_大作业_PercentageStrategy(discountPercentage1);break;
            case 3:iPricingStrategy=new _2018210913_杨成栋_大作业_PercentageStrategy(discountPercentage2);break;
        }

        return iPricingStrategy;
    }

    public void setDiscountPerBook(double discountPerBook) {
        this.discountPerBook = discountPerBook;
    }

    public void setDiscountPercentage2(int discountPercentage2) {
        this.discountPercentage2 = discountPercentage2;
    }

    public void setDiscountPercentage1(int discountPercentage1) {
        this.discountPercentage1 = discountPercentage1;
    }

    public double getDiscountPerBook() {
        return discountPerBook;
    }

    public int getDiscountPercentage1() {
        return discountPercentage1;
    }

    public int getDiscountPercentage2() {
        return discountPercentage2;
    }
}
