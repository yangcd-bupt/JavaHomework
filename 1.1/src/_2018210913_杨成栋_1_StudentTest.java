import java.util.Scanner;

/**
 * @Description 学生类，学生的学号、姓名、各科成绩
 * @Author SSEthereal
 * @Date 2020.6.10
 * @Version 0.1.0
 */
public class _2018210913_杨成栋_1_StudentTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.next();//从控制台获取学号输入
        String name=sc.next();//从控制台获取姓名输入
        int math=sc.nextInt();//从控制台获取数学成绩输入
        int english=sc.nextInt();//从控制台获取英语成绩输入
        int science=sc.nextInt();//从控制台获取科学成绩输入
        _2018210913_杨成栋_1_Student student=new _2018210913_杨成栋_1_Student(number,name);
        student.enterMarks(math,english,science);
        student.showStudent();
        sc.close();
    }
}
