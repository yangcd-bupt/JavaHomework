import java.util.Scanner;

public class _2018210913_杨成栋_1_StudentListTest {
    public static void main(String[] args){
        _2018210913_杨成栋_1_StudentList studentList=new _2018210913_杨成栋_1_StudentList(20);
        int no;
        Scanner scanner=new Scanner(System.in);
        lableA:
        while(scanner.hasNextInt()){
            _2018210913_杨成栋_1_Student student=new _2018210913_杨成栋_1_Student();
            String number;
            String name;
            int math;
            int english;
            int science;
            int i=scanner.nextInt();
            switch (i){
                case 1://向StudentList中添加项目，并显示数组中的所有学生信息
                    number=scanner.next();
                    name=scanner.next();
                    math=scanner.nextInt();
                    english=scanner.nextInt();
                    science=scanner.nextInt();
                    student.setStudentNumber(number);
                    student.setStudentName(name);
                    student.enterMarks(math,english,science);
                    studentList.add(student);
                    studentList.showStudentList();
                    break;
                case 2:
                    number=scanner.next();
                    studentList.remove(number);
                    break;
                case 3:
                    no=scanner.nextInt();
                    studentList.remove(no);
                    break;
                case 4:
                    if(studentList.isEmpty())
                       System.out.println("true");
                    else
                       System.out.println("false");
                    break;
                case 5:
                    no=scanner.nextInt();
                    student=studentList.getItem(no);
                    if(student!=null){
                       student.showStudent();
                    }
                    else
                        System.out.println("No such student");
                    break;
                case 6:
                    number=scanner.next();
                    student=studentList.getItem(number);
                    if(student!=null){
                        student.showStudent();
                    }
                    else
                        System.out.println("No such student");
                    break;
                case 7:
                    if(studentList.getTotal()>0)
                        studentList.showStudentList();
                    else
                        System.out.println("No such student");
                    break;
                case 8:
                    break lableA;
            }
        }
    }
}
