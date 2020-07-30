/**
 * @Description 学生类，学生的学号、姓名、各科成绩
 * @Author SSEthereal
 * @Date 2020.6.9
 */
public class _2018210913_杨成栋_1_Student {

    private String studentNumber;//学号
    private String studentName;//姓名
    private int markForMaths=-1;//数学成绩
    private int markForEnglish=-1;//英语成绩
    private int markForScience=-1;//科学成绩

    /**
     * @Description 类建立时时传入学号和姓名
     * @param number 学号
     * @param name 姓名
     */
    public _2018210913_杨成栋_1_Student(String number, String name){
        this.studentNumber=number;
        this.studentName=name;
    }

    /**
     * @Description 默认构造函数
     */
    public _2018210913_杨成栋_1_Student(){
    }

    /**
     * @Description 设置学号
     * @param studentNumber
     */
    public void setStudentNumber(String studentNumber){
        this.studentNumber=studentNumber;
    }

    /**
     *@Description 返回学号
     * @return
     */
    public String getNumber() {
        return studentNumber;
    }

    /**
     * @Description 设置姓名
     * @param studentName
     */
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    /**
     * @Description 返回姓名
     * @return
     */
    public String getName() {
        return studentName;
    }

    public void enterMarks(int markForMaths, int markForEnglish, int markForScience) {
        this.markForMaths=markForMaths;
        this.markForEnglish=markForEnglish;
        this.markForScience=markForScience;
    }
    public int getMathsMark() {
        return markForMaths;
    }
    public int getEnglishMark() {
        return markForEnglish;
    }
    public int getScienceMark() {
        return markForScience;
    }

    /**
     * @Description 计算平均分
     * @return
     */
    public double calculateAverage() {
        return (markForMaths+markForEnglish+markForScience)/3.0;
    }
    @Override
    public String toString() {
        return "Number:"+studentNumber+"\n"+
                "Name:"+studentName+"\n"+
                "Math:"+markForMaths+"\n"+
                "English:"+markForEnglish+"\n"+
                "Science:"+markForScience+"\n"+
                "Ave:";
    }

    /**
     * @Description 输出学生信息
     */
    public void showStudent(){
        System.out.println("Student Info:");
        System.out.print("Number:"+studentNumber+"\n"+
                "Name:"+studentName+"\n"+
                "Math:"+markForMaths+"\n"+
                "English:"+markForEnglish+"\n"+
                "Science:"+markForScience+"\n"+
                "Ave:");
        System.out.printf("%.2f%n",calculateAverage());
    }
}
