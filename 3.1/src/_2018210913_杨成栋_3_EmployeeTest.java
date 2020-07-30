import java.util.Scanner;

/**
 * @Author SSEthereal
 * @version 0.1
 * @Date 2020.7.15
 */
public class _2018210913_杨成栋_3_EmployeeTest {
    public static void main(String[] args){
        int id;//获取代表对象类型的id
        String firstName;//姓
        String lastName;//名
        String socialSecurityNumber;//社会保险号
        _2018210913_杨成栋_3_Employee employee;//其他类向上转型为Employee类
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            id=scanner.nextInt();//获取id
            firstName=scanner.next();//获取
            lastName=scanner.next();//获取
            socialSecurityNumber=scanner.next();
            switch (id){
                case 0:
                    double weeklySalary=scanner.nextDouble();//获取周薪
                    employee=new _2018210913_杨成栋_3_SalaridEmployee(firstName,lastName,socialSecurityNumber,weeklySalary);
                    break;
                case 1:
                    double wage=scanner.nextDouble();//获取时薪
                    int hours=scanner.nextInt();//获取工作时长
                    employee=new _2018210913_杨成栋_3_HourlyEmployee(firstName,lastName,socialSecurityNumber,wage,hours);
                    break;
                case 2:
                    double grossSales=scanner.nextDouble();//获取销售额
                    double commissionRate=scanner.nextDouble();//获取提成
                    employee=new _2018210913_杨成栋_3_CommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
                    break;
                case 3:
                    grossSales=scanner.nextDouble();//获取销售额
                    commissionRate=scanner.nextDouble();//获取提成
                    double baseSalary=scanner.nextDouble();//获取月基本工资
                    employee=new _2018210913_杨成栋_3_BasePlusCommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate,baseSalary);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + id);//id无效
            }
            System.out.print(employee);//输出employee基本信息
            employee.earning();//输出月薪
        }
        scanner.close();
    }

}
