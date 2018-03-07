package logicals;

/**
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
    a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 b = x
 c = y
 a = z
 * @author : zhuxueke
 * @since : 2018-02-28 16:07
 **/
public class PingBangBall implements Base{
    @Override
    public void printResult() {
        for (char a = 'x'; a <= 'z'; a++){
            for (char b = 'x'; b <= 'z'; b++){
                if(a != b){
                    for (char c = 'x'; c <= 'z'; c++){
                        if(c != a && b != c){
                            if(a != 'x' && b != 'x' && c != 'z')
                                System.out.printf("a -- %c\nb -- %c\nc -- %c\n", a, b, c);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        new PingBangBall().printResult();
    }
}
