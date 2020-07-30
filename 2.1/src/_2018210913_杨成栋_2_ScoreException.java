/**
 * @Description 输入的学生成绩不在[0,100]区间时，抛出该异常。
 * @Author SSEthereal
 * @Date 2020.6.10
 * @Version 0.1.0
 */
public class _2018210913_杨成栋_2_ScoreException extends Exception{
    public _2018210913_杨成栋_2_ScoreException(){
        super("Illegal score format");
    }
}

