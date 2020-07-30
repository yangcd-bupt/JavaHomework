package SaleCode;

import java.util.ArrayList;
import java.util.Scanner;

public class _2018210913_杨成栋_大作业_SaleTest {
    public static void main(String[] args) {
        int copies;//书的数目
        String isbn;//书的isbn号
        String title;//书名
        int type;//书的类型
        String bookType;//书的类型
        double price;//单价
        ArrayList<_2018210913_杨成栋_大作业_SaleLineItem> items=new ArrayList<>();

        _2018210913_杨成栋_大作业_Sale sale=new _2018210913_杨成栋_大作业_Sale();
        _2018210913_杨成栋_大作业_PricingStrategyFactory pricingStrategyFactory= _2018210913_杨成栋_大作业_PricingStrategyFactory.getInstance();
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNextInt()){
            _2018210913_杨成栋_大作业_SaleLineItem saleLineItem=new _2018210913_杨成栋_大作业_SaleLineItem();
            _2018210913_杨成栋_大作业_ProductSpecification productSpecification=new _2018210913_杨成栋_大作业_ProductSpecification();

            copies=scanner.nextInt();
            isbn=scanner.next();
            title=scanner.next();
            bookType=scanner.next();
            price=scanner.nextDouble();

            if(bookType.equals("教材类"))
                type=1;
            else if(bookType.equals("连环画类"))
                type=2;
            else if(bookType.equals("非教材类计算机"))
                type=3;
            else
                type=0;

            productSpecification.setIsbn(isbn);
            productSpecification.setPrice(price);
            productSpecification.setTitle(title);
            productSpecification.setType(type);

            saleLineItem.setCopies(copies);
            saleLineItem.setProdSpec(productSpecification);
            saleLineItem.setStrategy(pricingStrategyFactory.getPricingStrategy(type));

            items.add(saleLineItem);
        }
        sale.setItems(items);
        System.out.printf("%.2f%n",sale.getTotal());
    }
}
