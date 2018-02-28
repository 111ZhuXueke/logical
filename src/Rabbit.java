/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *  假如兔子都不死，问到第8个月时的兔子总数为多少？
 * @author : zhuxueke
 * @since : 2018-02-28 14:38
 **/
public class Rabbit implements Base{
    @Override
    public void printResult() {
        // 1月份 - 3月份 1对兔子，共两只
        int[] mon = new int[8];
        mon[0] = 1;
        mon[1] = 1;
        // 1月份 1对
        // 2月份 1对
        // 3月份 2对
        // 4月份 3对
        // 5月份 5对
        // 6月份 8对
        // 7月份 13对
        // 8月份 21对
        for (int i = 2; i < 8; i++) {
            // 每个月的兔子 刚好是 == 上一个月的 + 新出生的，新出生的 == 不满三个月的，也就是2个月前的
            mon[i] = mon[i-1] + mon[i-2];
            System.out.printf("第 %d 个月有 %d 对兔子，共 %d 只兔子\n", i + 1, mon[i], 2 * mon[i]);
        }

    }
    public static void main(String[] args){
        new Rabbit().printResult();
    }
}
