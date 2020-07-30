/**
 * @Description 输入的学号不满足下述条件，则抛出该异常。条件为：学号为10位，第1位为2，第2位为0，其余位为数字0~9.
 * @Author SSEthereal
 * @Date 2020.6.10
 * @Version 0.1.0
 */
public class _2018210913_杨成栋_2_NumberException extends Exception{
    public _2018210913_杨成栋_2_NumberException(){
        super("Illegal number format");
    }
}

