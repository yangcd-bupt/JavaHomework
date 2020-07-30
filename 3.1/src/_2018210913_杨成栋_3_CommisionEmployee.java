/**
 * 佣金员工
 */
public class _2018210913_杨成栋_3_CommisionEmployee extends _2018210913_杨成栋_3_Employee {
    protected double grossSales;
    protected double commissionRate;

    /**
     * CommisionEmployee的全参构造函数
     * @param grossSales 销售额
     * @param commissionRate 提成
     */
    public _2018210913_杨成栋_3_CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName,lastName,socialSecurityNumber);//调用父类的构造函数
        setCommissionRate(commissionRate);//获取销售额
        setGrossSales(grossSales);//获取提成
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * 重写父类的earning函数
     */
    @Override
    public void earning() {
        System.out.printf("%.2f%n",grossSales*commissionRate);
    }

    @Override
    public String toString() {
        return super.toString();//调用父类的toString
    }
}
