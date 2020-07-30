package GUI;

import EmployeeCode._2018210913_杨成栋_5_CommisionEmployee;
import EmployeeCode._2018210913_杨成栋_5_Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2018210913_杨成栋_5_AddCommisionEmployee extends JFrame {
    protected String firstName;//姓
    protected String lastName;//名
    protected String socialSecurityNumber;//社会保险号
    protected double grossSales;
    protected double commissionRate;
    protected _2018210913_杨成栋_5_Employee employee;//员工
    protected _2018210913_杨成栋_5_ShowEmployee showEmployee;//主窗口

    protected JLabel firstNameLabel=new JLabel("firstName");
    protected JTextField firstNmeText=new JTextField(10);
    protected JLabel lastNameLabel=new JLabel("lastName");
    protected JTextField lastNmeText=new JTextField(10);
    protected JLabel numberLabel=new JLabel("socialSecurityNumber");
    protected JTextField numberText=new JTextField(10);
    protected JLabel saleLabel=new JLabel("grossSales");
    protected JTextField saleText=new JTextField(10);
    protected JLabel rateLabel=new JLabel("commissionRate");
    protected JTextField rateText=new JTextField(10);
    protected JButton submit=new JButton("submit");
    protected JPanel panel1=new JPanel();
    protected JPanel panel2=new JPanel();

    private ActionListener submitCommmision=new ActionListener() {//点击提交按钮时将员工加入factory
        @Override
        public void actionPerformed(ActionEvent e) {
            firstName=firstNmeText.getText();
            lastName=lastNmeText.getText();
            socialSecurityNumber=numberText.getText();
            grossSales=Double.valueOf(saleText.getText());
            commissionRate=Double.valueOf(rateText.getText());
            employee=new _2018210913_杨成栋_5_CommisionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
            showEmployee.getFactory().addEmployee(employee);
            dispose();
        }
    };

    public _2018210913_杨成栋_5_AddCommisionEmployee(){
    }

    /**
     *获取主窗口以传递数据
     */
    public _2018210913_杨成栋_5_AddCommisionEmployee(_2018210913_杨成栋_5_ShowEmployee showEmployee){
        this.showEmployee=showEmployee;
        submit.addActionListener(submitCommmision);

        setLayout(new FlowLayout());
        panel1.add(firstNameLabel);
        panel1.add(firstNmeText);
        panel1.add(lastNameLabel);
        panel1.add(lastNmeText);
        add(panel1);
        panel2.add(numberLabel);
        panel2.add(numberText);
        panel2.add(saleLabel);
        panel2.add(saleText);
        panel2.add(rateLabel);
        panel2.add(rateText);
        add(panel2);
        add(submit);
    }
}
