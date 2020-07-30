/**
 * 周薪雇员
 */
public class _2018210913_杨成栋_4_HourlyEmployee extends _2018210913_杨成栋_4_Employee {
    private double wage;
    private int hours;

    /**
     *HourlyEmployee的全参构造函数
     * @param wage 时薪
     * @param hours 工作时长
     */
    public _2018210913_杨成栋_4_HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours){
        super(firstName,lastName,socialSecurityNumber);//调用父类的构造函数
        setHours(hours);//获取时薪
        setWage(wage);//获取工作时长
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * 重写父类的earning函数
     */
    @Override
    public void earning() {
        earn=wage*hours;
    }

    @Override
    public String toString() {
        return super.toString();//调用父类的toString函数
    }
}
