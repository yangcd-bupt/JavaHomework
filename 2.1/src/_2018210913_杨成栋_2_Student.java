import java.util.regex.Pattern;

/**
 * @Description 学生类，学生的学号、姓名、各科成绩
 * @Author SSEthereal
 * @Date 2020.6.10
 * @Version 0.1.1
 */
public class _2018210913_杨成栋_2_Student {

    private String studentNumber;//学号
    private String studentName;//姓名
    private int markForMaths=-1;//数学成绩
    private int markForEnglish=-1;//英语成绩
    private int markForScience=-1;//科学成绩
    private final String Legal_Student_Number="^[2][0][0-9]{8}";

    /**
     * @Description 类建立时时传入学号和姓名
     * @param number 学号
     * @param name 姓名
     * @throws _2018210913_杨成栋_2_NumberException 学号不符合格式
     */
    public _2018210913_杨成栋_2_Student(String number, String name) throws _2018210913_杨成栋_2_NumberException {
        if(!Pattern.matches(Legal_Student_Number,number))
            throw new _2018210913_杨成栋_2_NumberException();
        this.studentNumber=number;
        this.studentName=name;
    }

    /**
     * @Description 默认构造函数
     */
    public _2018210913_杨成栋_2_Student(){
    }

    /**
     * @Description 设置学号
     * @param studentNumber 学号
     * @throws _2018210913_杨成栋_2_NumberException 学号不符合格式
     */
    public void setStudentNumber(String studentNumber) throws _2018210913_杨成栋_2_NumberException {
        if(!Pattern.matches(Legal_Student_Number,studentNumber))
            throw new _2018210913_杨成栋_2_NumberException();
        this.studentNumber=studentNumber;
    }

    /**
     *@Description 返回学号
     * @return 学号
     */
    public String getNumber() {
        return studentNumber;
    }

    /**
     * @Description 设置姓名
     * @param studentName 姓名
     */
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    /**
     * @Description 返回姓名
     * @return 姓名
     */
    public String getName() {
        return studentName;
    }

    /**
     * @Description 输入三门课程成绩
     * @param markForMaths 数学成绩
     * @param markForEnglish 英语成绩
     * @param markForScience 科学成绩
     * @throws _2018210913_杨成栋_2_ScoreException 成绩不符合规定
     */
    public void enterMarks(int markForMaths, int markForEnglish, int markForScience) throws _2018210913_杨成栋_2_ScoreException {
        if(!JudgeLegalScore(markForMaths))
            throw new _2018210913_杨成栋_2_ScoreException();
        this.markForMaths=markForMaths;
        if(!JudgeLegalScore(markForEnglish))
            throw new _2018210913_杨成栋_2_ScoreException();
        this.markForEnglish=markForEnglish;
        if(!JudgeLegalScore(markForScience))
            throw new _2018210913_杨成栋_2_ScoreException();
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
     * @Description 判断成绩是否合法
     * @param score 学生成绩
     * @return 合法输出true
     */
    private boolean JudgeLegalScore(int score){
        return (score>=0&&score<=100);
    }

    /**
     * @Description 计算平均分
     * @return 平均分
     */
    public double calculateAverage() {
        return (markForMaths+markForEnglish+markForScience)/3.0;
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

    @Override
    public String toString() {
        return "Number:"+studentNumber+"\n"+
                "Name:"+studentName+"\n"+
                "Math:"+markForMaths+"\n"+
                "English:"+markForEnglish+"\n"+
                "Science:"+markForScience+"\n"+
                "Ave:";
    }
}
