package GUI;

import EmployeeCode._2018210913_杨成栋_5_BasePlusCommisionEmployee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2018210913_杨成栋_5_AddPlusCommisionEmployee extends _2018210913_杨成栋_5_AddCommisionEmployee {
    private double  baseSalary;//基本工资

    private JLabel baseLabel=new JLabel("baseSalary");
    private JTextField baseText=new JTextField(10);//基本工资输入

    private ActionListener submitPlusCommision=new ActionListener() {//点击提交按钮时将员工加入factory
        @Override
        public void actionPerformed(ActionEvent e) {
            firstName=firstNmeText.getText();
            lastName=lastNmeText.getText();
            socialSecurityNumber=numberText.getText();
            grossSales=Double.valueOf(saleText.getText());
            commissionRate=Double.valueOf(rateText.getText());
            baseSalary=Double.valueOf(baseText.getText());
            employee=new _2018210913_杨成栋_5_BasePlusCommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate,baseSalary);
            showEmployee.getFactory().addEmployee(employee);
            dispose();
        }
    };
    public _2018210913_杨成栋_5_AddPlusCommisionEmployee(){
        super();
    }

    /**
     *获取主窗口以传递数据
     */
    public _2018210913_杨成栋_5_AddPlusCommisionEmployee(_2018210913_杨成栋_5_ShowEmployee showEmployee){
        this.showEmployee=showEmployee;
        submit.addActionListener(submitPlusCommision);

        setLayout(new FlowLayout());
        panel1.add(firstNameLabel);
        panel1.add(firstNmeText);
        panel1.add(lastNameLabel);
        panel1.add(lastNmeText);
        panel1.add(numberLabel);
        add(panel1);
        panel1.add(numberText);
        panel2.add(saleLabel);
        panel2.add(saleText);
        panel2.add(rateLabel);
        panel2.add(rateText);
        panel2.add(baseLabel);
        panel2.add(baseText);
        add(panel2);
        add(submit);
    }
}
