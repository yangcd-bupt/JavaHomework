package GUI;

import SaleCode.*;
import javax.swing.*;
import static GUI._2018210913_杨成栋_大作业_ShowSwing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

public class _2018210913_杨成栋_大作业_MainInterface extends JFrame {
    private _2018210913_杨成栋_大作业_Sale sale=new _2018210913_杨成栋_大作业_Sale();
    private ArrayList<_2018210913_杨成栋_大作业_SaleLineItem> items=new ArrayList<>();
    private _2018210913_杨成栋_大作业_PricingStrategyFactory pricingStrategyFactory= _2018210913_杨成栋_大作业_PricingStrategyFactory.getInstance();

    private JPanel inputPanel=new JPanel();
    private JLabel labelCopies=new JLabel("copies");
    private JTextField textFieldCopies=new JTextField(10);
    private JLabel labelIsbn=new JLabel("isbn");
    private JTextField textFieldIsbn=new JTextField(10);
    private JLabel labelTitle=new JLabel("title");
    private JTextField textFieldTitle=new JTextField(10);
    private JLabel labelBookType=new JLabel("bookType");
    private JTextField textFieldBookType=new JTextField(10);
    private JLabel labelPrice=new JLabel("price");
    private JTextField textFieldPrice=new JTextField(10);
    private JButton submitButton=new JButton("submitButton");
    private JTextArea showBook=new JTextArea(10,70);
    private JLabel labelTotal=new JLabel("total");
    private JTextField textFieldTotal=new JTextField(10);

    private JPanel changePanel=new JPanel();
    private JLabel discountPerBook=new JLabel("discountPerBook");
    private JTextField discountPerBookText=new JTextField(10);
    private JLabel discountPercentage1=new JLabel("discountPercentage1");
    private JTextField discountPercentage1Text=new JTextField(10);
    private JLabel discountPercentage2=new JLabel("discountPercentage2");
    private JTextField discountPercentage2Text=new JTextField(10);
    private JButton change=new JButton("change");

    private ActionListener submit=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int type;
            String copies=textFieldCopies.getText();
            String isbn=textFieldIsbn.getText();
            String title=textFieldTitle.getText();
            String bookType=textFieldBookType.getText();
            String price=textFieldPrice.getText();

            showBook.append(copies+"          ");
            showBook.append(isbn+"      ");
            showBook.append(title+"      ");
            showBook.append(bookType+"      ");
            showBook.append(price+"      ");
            textFieldCopies.setText("");
            textFieldIsbn.setText("");
            textFieldTitle.setText("");
            textFieldBookType.setText("");
            textFieldPrice.setText("");

            _2018210913_杨成栋_大作业_SaleLineItem saleLineItem=new _2018210913_杨成栋_大作业_SaleLineItem();
            _2018210913_杨成栋_大作业_ProductSpecification productSpecification=new _2018210913_杨成栋_大作业_ProductSpecification();

            if(bookType.equals("教材类"))
                type=1;
            else if(bookType.equals("连环画类"))
                type=2;
            else if(bookType.equals("非教材类计算机"))
                type=3;
            else
                type=0;

            productSpecification.setIsbn(isbn);
            productSpecification.setPrice(Integer.valueOf(price).intValue());
            productSpecification.setTitle(title);
            productSpecification.setType(type);

            saleLineItem.setCopies(Integer.valueOf(copies).intValue());
            saleLineItem.setProdSpec(productSpecification);
            saleLineItem.setStrategy(pricingStrategyFactory.getPricingStrategy(type));

            items.add(saleLineItem);
            sale.setItems(items);

            showBook.append(new BigDecimal(saleLineItem.getSubTotal()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()+"\n");
            textFieldTotal.setText(new BigDecimal(sale.getTotal()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()+"");
        }
    };

    private ActionListener changeDiscount=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pricingStrategyFactory.setDiscountPerBook(Double.valueOf(discountPerBookText.getText()));
            pricingStrategyFactory.setDiscountPercentage1(Integer.valueOf(discountPercentage1Text.getText()));
            pricingStrategyFactory.setDiscountPercentage2(Integer.valueOf(discountPercentage2Text.getText()));
            discountPerBookText.setText("");
            discountPercentage1Text.setText("");
            discountPercentage2Text.setText("");
        }
    };


    public _2018210913_杨成栋_大作业_MainInterface(){
        labelCopies.setText("copies");
        labelIsbn.setText("isbn");
        labelTitle.setText("title");
        labelBookType.setText("bookType");
        labelPrice.setText("price");
        showBook.setText("copies      isbn      title      bookType      price      subTotal\n");

        submitButton.addActionListener(submit);
        change.addActionListener(changeDiscount);

        setLayout(new FlowLayout());
        inputPanel.add(labelCopies);
        inputPanel.add(textFieldCopies);
        inputPanel.add(labelIsbn);
        inputPanel.add(textFieldIsbn);
        inputPanel.add(labelTitle);
        inputPanel.add(textFieldTitle);
        inputPanel.add(labelBookType);
        inputPanel.add(textFieldBookType);
        inputPanel.add(labelPrice);
        inputPanel.add(textFieldPrice);
        add(inputPanel);
        add(submitButton);
        add(new JScrollPane(showBook));
        add(labelTotal);
        add(textFieldTotal);
        changePanel.add(discountPerBook);
        changePanel.add(discountPerBookText);
        changePanel.add(discountPercentage1);
        changePanel.add(discountPercentage1Text);
        changePanel.add(discountPercentage2);
        changePanel.add(discountPercentage2Text);
        add(changePanel);
        add(change);
    }
    public static void main(String[] args){
        run(new _2018210913_杨成栋_大作业_MainInterface(),800,380);
    }
}
