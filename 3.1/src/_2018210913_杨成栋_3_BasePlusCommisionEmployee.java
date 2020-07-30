/**
 * 基本加佣金员工
 */
public class _2018210913_杨成栋_3_BasePlusCommisionEmployee extends _2018210913_杨成栋_3_CommisionEmployee {
    private double  baseSalary;

    /**
     * BasePlusCommisionEmployee的全参构造函数
     * @param baseSalary 基本工资
     */
    public _2018210913_杨成栋_3_BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);//调用父类的构造函数
        setBaseSalary(baseSalary);//获取基本工资
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * 重写父类的earning函数
     */
    @Override
    public void earning() {
        System.out.printf("%.2f%n",grossSales*commissionRate+baseSalary);
    }

    @Override
    public String toString() {
        return super.toString();//调用父类的toString函数
    }
}
