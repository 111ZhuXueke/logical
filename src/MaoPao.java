import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序
 * @author : zhuxueke
 * @since : 2018-02-26 15:49
 **/
public class MaoPao {
    public static void printResult(){
        int[] ints = {0,5,4,9,8,1};

        for(int i=0;i<ints.length-1;i++){//外层循环控制排序趟数
            for(int j=0;j<ints.length-1-i;j++){//内层循环控制每一趟排序多少次
                if(ints[j]>ints[j+1]){
                    int temp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
    public static void main(String[] args){
        printResult();
    }
}
