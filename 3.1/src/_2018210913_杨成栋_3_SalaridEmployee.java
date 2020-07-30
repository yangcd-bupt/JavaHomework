/**
 * 月薪雇员
 */
public class _2018210913_杨成栋_3_SalaridEmployee extends _2018210913_杨成栋_3_Employee {
    private double weeklySalary;

    /**
     * SalaridEmployee的全参构造函数
     * @param weeklySalary 周薪
     */
    public _2018210913_杨成栋_3_SalaridEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);//调用父类的构造函数
        setWeeklySalary(weeklySalary);//获取周薪
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    /**
     * 重写父类的earning函数
     */
    @Override
    public void earning() {
        System.out.printf("%.2f%n",weeklySalary*4);
    }

    @Override
    public String toString() {
        return super.toString();//调用父类的toString函数
    }
}
