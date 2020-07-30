import java.util.*;

/**
 * @Author SSEthereal
 * @Version 0.1
 * @Date 2020.7.15
 */
public class _2018210913_杨成栋_4_FactoryTest {
    public static void main(String[] args){
        int id=-1;//获取代表对象类型的id
        String command;//命令
        _2018210913_杨成栋_4_Employee employee;//用来存储返回值
        _2018210913_杨成栋_4_BuildEmployee buildEmployee=new _2018210913_杨成栋_4_BuildEmployee();//减少重复代码
        _2018210913_杨成栋_4_Factory factory=new _2018210913_杨成栋_4_Factory();
        List<_2018210913_杨成栋_4_Employee> es = new ArrayList<>();//存储初始化时的employee
        Scanner scanner = new Scanner(System.in);

        command=scanner.next();
        while (command.equals("init")){//初始化
            id=scanner.nextInt();//获取id
            if(id==-1)//初始化数据导入完成
                break;
            employee=buildEmployee.buildEmployee(id,scanner);
            es.add(employee);
            command=scanner.next();
        }
        factory.initEmployees(es);//factory初始化
        while(scanner.hasNext()){
            command=scanner.next();
            if(command.equals("get")){//查找并返回社会保险号为empSecNum的员工
                String empSecNum=scanner.next();
                employee=factory.getEmployee(empSecNum);
                if(employee!=null)
                    employee.printEmployee();
                else
                    System.out.println("get: employee not found.");
            }
            else if(command.equals("add")){//添加参数定义的员工对象到HashMap中
                id=scanner.nextInt();//获取id
                _2018210913_杨成栋_4_Employee stu=buildEmployee.buildEmployee(id,scanner);
                employee=factory.addEmployee(stu);
                if(employee!=null)
                    employee.printEmployee();
                else
                    System.out.println("add: employee exists.");
            }
            else if(command.equals("update")){//更新员工集合中社会保险号为empSecNum的员工对象信息，更新后的信息为emp
                id=scanner.nextInt();//获取id
                _2018210913_杨成栋_4_Employee emp=buildEmployee.buildEmployee(id,scanner);
                employee=factory.updateEmployee(emp.getSocialSecurityNumber(),emp);
                if(employee!=null)
                    employee.printEmployee();
                else
                    System.out.println("update: employee not found.");
            }
            else if(command.equals("delete")){//从HashTable中删除社会保险号为empSecNum的员工，并返回该员工对象的引用
                String empSecNum=scanner.next();
                employee=factory.deleteEmployee(empSecNum);
                if(employee!=null)
                    employee.printEmployee();
                else
                    System.out.println("delete: employee not found.");
            }
            else if(command.equals("print")){//输出每一个员工的信息，并结束
                factory.printEmployees();
                break;
            }
        }
    }
}
