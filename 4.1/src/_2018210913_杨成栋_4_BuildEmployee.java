import java.util.Scanner;

/**
 * 减少重复代码（init，add，update处）
 */
public class _2018210913_杨成栋_4_BuildEmployee {
    private _2018210913_杨成栋_4_Employee employee;//其他类向上转型为employee
    private String firstName;//姓
    private String lastName;//名
    private String socialSecurityNumber;//社会保险号

    /**
     * 根据id返回对应的employee
     * @param id employee的类型
     * @param scanner
     * @return 返回建立好的employee
     */
    public _2018210913_杨成栋_4_Employee buildEmployee(int id, Scanner scanner){
        firstName=scanner.next();//获取姓
        lastName=scanner.next();//获取名
        socialSecurityNumber=scanner.next();//获取社会保险号
        switch (id){
            case 0:
                double weeklySalary=scanner.nextDouble();//获取周薪
                employee=new _2018210913_杨成栋_4_SalaridEmployee(firstName,lastName,socialSecurityNumber,weeklySalary);
                break;
            case 1:
                double wage=scanner.nextDouble();//获取时薪
                int hours=scanner.nextInt();//获取工作时长
                employee=new _2018210913_杨成栋_4_HourlyEmployee(firstName,lastName,socialSecurityNumber,wage,hours);
                break;
            case 2:
                double grossSales=scanner.nextDouble();//获取销售额
                double commissionRate=scanner.nextDouble();//获取提成
                employee=new _2018210913_杨成栋_4_CommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
                break;
            case 3:
                grossSales=scanner.nextDouble();//获取销售额
                commissionRate=scanner.nextDouble();//获取提成
                double baseSalary=scanner.nextDouble();//获取月基本工资
                employee=new _2018210913_杨成栋_4_BasePlusCommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate,baseSalary);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + id);//id无效
        }
        return employee;
    }
}
