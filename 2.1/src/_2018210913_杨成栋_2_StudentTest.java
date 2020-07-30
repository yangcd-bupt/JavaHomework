import java.util.Scanner;

public class _2018210913_杨成栋_2_StudentTest {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String number=sc.next();//从控制台获取学号输入
        String name=sc.next();//从控制台获取姓名输入
        int math=sc.nextInt();//从控制台获取数学成绩输入
        int english=sc.nextInt();//从控制台获取英语成绩输入
        int science=sc.nextInt();//从控制台获取科学成绩输入
        try {
            _2018210913_杨成栋_2_Student student=new _2018210913_杨成栋_2_Student(number,name);//输入学号，姓名
            student.enterMarks(math, english, science);//输入成绩
            student.showStudent();
        }
        catch (_2018210913_杨成栋_2_ScoreException e){//学号与格式不符
            System.out.println(e.getMessage());
        }
        catch (_2018210913_杨成栋_2_NumberException e){//成绩不在[0,100]内
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

