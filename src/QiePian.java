import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [1,1,0,2,2,2,4,3,3,4,2,0,0] 切割成 [[1,1],[0],[2,2,2],[4],[3,3],[4,2],[0,0]]
 * @author : zhuxueke
 * @since : 2018-02-26 10:38
 **/
public class QiePian {
    public static void printResult(){
        List<Integer> listInt = Arrays.asList(1,1,0,2,2,2,4,3,3,4,2,0,0);
        List<ArrayList> integers = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        int j = listInt.get(0);
        arrayList.add(j);
        for (int i = 1; i < listInt.size(); i++) {
            if(j == listInt.get(i)){
                arrayList.add(listInt.get(i));
            }else{
                integers.add(arrayList);
                arrayList = new ArrayList();
                arrayList.add(listInt.get(i));
            }
            j = listInt.get(i);
        }
        integers.add(arrayList);
        for (int i = 0; i < integers.size(); i++) {
            mergeList(i,integers);
        }
        System.out.println(integers);
    }

    private static void mergeList(int i,List<ArrayList> integers){
        if(integers.get(i).size() == 1 && integers.get(i+1).size() == 1){
            integers.get(i).add(integers.get(i+1).get(0));
            integers.remove(i+1);
            mergeList(i,integers);
        }
    }

    public static void main(String[] args){
        QiePian.printResult();

    }
}