/**
 * 自定义的所有类的父类
 */
public abstract class _2018210913_杨成栋_4_Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    protected double earn=-1;

    /**
     * Employee的全参构造方法
     * @param firstName 姓
     * @param lastName  名
     * @param socialSecurityNumber  社会保险号
     */
    public _2018210913_杨成栋_4_Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * 计算并输出月薪
     * 所有子类必须重写
     */
    public abstract void earning();

    /**
     * 输出employee的详细信息
     * @return employee的详细信息：姓、名、社会保险号
     */
    @Override
    public String toString() {
        return "firstName:"+firstName+"; lastName:"+lastName+"; socialSecurityNumber:"+socialSecurityNumber+"; earning:";
    }

    /**
     * 输出所要求的信息
     */
    public void printEmployee(){
        earning();
        System.out.printf("%s%.2f%n",toString(),earn);
    }
}
