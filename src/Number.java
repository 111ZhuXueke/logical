import java.util.Arrays;

/**
 * 给出由5、6、7、8组成的数字不同组合
 * @author : zhuxueke
 * @since : 2018-02-28 15:21
 **/
public class Number implements  Base{
    @Override
    public void printResult() {
        int[] nums = {5,6,7,8};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    for (int l = 0; l < nums.length; l++) {
                        if(nums[i]!= nums[j] && nums[i] != nums[k] && nums[k]!= nums[l]){
                            System.out.printf("%d%d%d%d \n",nums[i],nums[j],nums[k],nums[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        new Number().printResult();
    }
}
