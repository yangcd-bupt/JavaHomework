package SaleCode;

import java.util.ArrayList;

/**
 * 1次销售会对应多个销售项目
 */
public class _2018210913_杨成栋_大作业_Sale {
    private ArrayList<_2018210913_杨成栋_大作业_SaleLineItem> items;//依次销售
    private double total;

    public _2018210913_杨成栋_大作业_Sale(){
        items=new ArrayList<>();
    }

    public void setItems(ArrayList<_2018210913_杨成栋_大作业_SaleLineItem> items) {
        this.items = items;
    }

    public ArrayList<_2018210913_杨成栋_大作业_SaleLineItem> getItems() {
        return items;
    }

    /**
     * 用于返回本次销售的优惠后总价
     * @return 本次销售的优惠后总价
     */
    public double getTotal(){
        total=0;
        for(int i=0;i<items.size();i++)
            total+=items.get(i).getSubTotal();

        return total;
    }
}
