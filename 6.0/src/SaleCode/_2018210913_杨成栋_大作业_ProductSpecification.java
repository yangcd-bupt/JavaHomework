package SaleCode;

/**
 * 书的描述信息
 * 共有5种书
 * 需要创建5个ProductSpecification对象
 */
public class _2018210913_杨成栋_大作业_ProductSpecification {
    private String isbn;//书的isbn号
    private double price;//单价
    private String title;//书名
    private int type;//书的类型

    public _2018210913_杨成栋_大作业_ProductSpecification(){}

    public _2018210913_杨成栋_大作业_ProductSpecification(String isbn, double price, String title, int type){
        this.isbn=isbn;
        this.price=price;
        this.title=title;
        this.type=type;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return price;
    }
}
