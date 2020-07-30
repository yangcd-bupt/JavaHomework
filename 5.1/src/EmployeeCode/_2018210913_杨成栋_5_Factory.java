package EmployeeCode;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author SSEthereal
 * @Version 0.1
 * @Date 2020.7.15
 */
public class _2018210913_杨成栋_5_Factory {
    private HashMap<String, _2018210913_杨成栋_5_Employee> employees;

    public _2018210913_杨成栋_5_Factory(){
        employees=new HashMap<>();
    }
    /**
     * 以socialSecurityNumber为key，将员工对象保存到HashMap中
     * @param es
     */
    public void initEmployees(List<_2018210913_杨成栋_5_Employee> es){
        for(int i=0;i<es.size();i++){
            _2018210913_杨成栋_5_Employee employee= es.get(i);
            employees.put(employee.getSocialSecurityNumber(),employee);
        }
    }

    /**
     * 查找并返回社会保险号为empSecNum的员工
     * @param empSecNum 社会保险号
     * @return 若未找到该员工，返回null, 然后输出”get: employee not found.”.
     *         否则根据返回的员工对象输出员工信息
     */
    public _2018210913_杨成栋_5_Employee getEmployee(String empSecNum){
       return employees.get(empSecNum);
    }

    /**
     * 从HashTable中删除社会保险号为empSecNum的员工
     * @param empSecNum 社会保险号
     * @return 若未找到该员工，返回null, 然后输出”delete: employee not found.”.
     *         否则根据返回的员工对象输出员工信息。
     */
    public _2018210913_杨成栋_5_Employee deleteEmployee(String empSecNum){
        _2018210913_杨成栋_5_Employee employee=getEmployee(empSecNum);
        if(employee!=null)
            employees.remove(empSecNum);
        return employee;
    }

    /**
     * 添加参数定义的员工对象到HashMap
     * @param stu 员工对象
     * @return 如果此员工已经存在，则返回null，然后输出”add: employee exists.” 。
     *         否则返回该员工对象，并输出员工信息。
     */
    public _2018210913_杨成栋_5_Employee addEmployee(_2018210913_杨成栋_5_Employee stu){
        boolean exist=employees.containsKey(stu.getSocialSecurityNumber());
        if(exist==true)
            return null;
        employees.put(stu.getSocialSecurityNumber(),stu);
        return stu;
    }

    /**
     * 更新员工集合中社会保险号为empSecNum的员工对象信息
     * @param empSecNum 社会保险号
     * @param emp 更新后的信息
     * @return 如果不存在该员工，返回null，然后输出”update: employee not found.”。
     *         否则返回emp，并输出员工信息。
     */
    public _2018210913_杨成栋_5_Employee updateEmployee(String empSecNum , _2018210913_杨成栋_5_Employee emp){
        boolean exist=employees.containsKey(empSecNum);
        if(exist!=true)
            return null;
        employees.put(empSecNum,emp);
        return emp;
    }

    /**
     *输出信息
     * @return 返回输出字符串
     */
    public String printEmployees(){
        StringBuilder outPut=new StringBuilder();
        for(Map.Entry<String, _2018210913_杨成栋_5_Employee> entry: employees.entrySet())
        {
            outPut.append(entry.getValue().printEmployee());
        }
        return outPut.toString();
    }

    public String showAverage(){
        double average=0;
        for(Map.Entry<String, _2018210913_杨成栋_5_Employee> entry: employees.entrySet())
        {
            average+=entry.getValue().getEarn();
        }
        average/=employees.size();
        return new BigDecimal(average).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()+"";
    }
}
