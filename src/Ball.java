import java.util.Scanner;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 *  求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * @author : zhuxueke
 * @since : 2018-02-28 15:42
 **/
public class Ball implements Base {
    @Override
    public void printResult() {
        float count = 100,high = 100;
        for (int i = 0; i < 10; i++) {
            high = high / 2;
            count = count + high * 2;
        }
        System.out.printf("总距离：%f 最后反弹高度：%f",count,high);
    }

    public static void main(String[] args){
        new Ball().printResult();
    }
}
