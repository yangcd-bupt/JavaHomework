package GUI;

import EmployeeCode._2018210913_杨成栋_5_Factory;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import static GUI._2018210913_杨成栋_5_ShowSwing.*;

public class _2018210913_杨成栋_5_ShowEmployee extends JFrame {
    private _2018210913_杨成栋_5_Factory factory=new _2018210913_杨成栋_5_Factory();
    private _2018210913_杨成栋_5_ShowEmployee showEmployee=this;//表示主窗口，用来获取子窗口的数据

    private JMenuBar menuBar=new JMenuBar();//菜单栏
    private JMenu inputMenu=new JMenu("EmployeeInfoInput");//一级菜单EmployeeInfoInput
    private JMenuItem commisionMenu=new JMenuItem("CommisionEmployee");//菜单项CommisionEmployee
    private JMenuItem plusCommisionMenu=new JMenuItem("BasePlusCommisionEmployee");//菜单项BasePlusCommisionEmployee
    private JMenu searchMenu = new JMenu("Search");//一级菜单Search
    private JMenuItem averageMenu=new JMenuItem("AverageEarningSearch");//菜单项AverageEarningSearch
    private JMenu nullMenu=new JMenu("                                                                                                                               ");
    private JTextArea showEmployees=new JTextArea(10,50);//用来显示输出信息

    private JLabel totalLabel=new JLabel("average");
    private JTextField totalText=new JTextField(10);

    private ActionListener addCommision=new ActionListener() {//选择菜单项CommisionEmployee
        @Override
        public void actionPerformed(ActionEvent e) {
            run(new _2018210913_杨成栋_5_AddCommisionEmployee(showEmployee),900,200,false);//创建子窗口，并将主窗口作为参数传递
        }
    };

    private ActionListener addPlusCommision=new ActionListener() {//选择菜单项BasePlusCommisionEmployee
        @Override
        public void actionPerformed(ActionEvent e) {
            run(new _2018210913_杨成栋_5_AddPlusCommisionEmployee(showEmployee),850,200,false);//创建子窗口，并将主窗口作为参数传递
        }
    };

    private ActionListener submitListener=new ActionListener() {//输出每个员工的信息和平均工资
        @Override
        public void actionPerformed(ActionEvent e) {
            String outPut=factory.printEmployees();//获取输出信息
            showEmployees.setText("");//清空之前信息
            showEmployees.setText(outPut);//显示当前信息
            totalText.setText(factory.showAverage());
        }
    };

    /**
     * 统一设置字体，父界面设置之后，所有由父界面进入的子界面都不需要再次设置字体
     */
    private static void InitGlobalFont(Font font) {
        FontUIResource fontRes = new FontUIResource(font);
        for (Enumeration<Object> keys = UIManager.getDefaults().keys();
             keys.hasMoreElements(); ) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                UIManager.put(key, fontRes);
            }
        }
    }

    public _2018210913_杨成栋_5_Factory getFactory() {
        return factory;
    }

    public _2018210913_杨成栋_5_ShowEmployee(){
        InitGlobalFont(new Font("Times New Roman", Font.PLAIN, 20));  //统一设置字体
        commisionMenu.addActionListener(addCommision);//选择此菜单项触发事件
        plusCommisionMenu.addActionListener(addPlusCommision);//选择此菜单项触发事件
        averageMenu.addActionListener(submitListener);//选择此菜单项触发事件

        setLayout(new FlowLayout());
        inputMenu.add(commisionMenu);
        inputMenu.add(plusCommisionMenu);
        menuBar.add(inputMenu);
        searchMenu.add(averageMenu);
        menuBar.add(searchMenu);
        menuBar.add(nullMenu);
        add(menuBar);
        add(showEmployees);
        add(totalLabel);
        add(totalText);
    }
    public static void main(String[] args){
        run(new _2018210913_杨成栋_5_ShowEmployee(),600,300,true);//初始化主窗口
    }
}
