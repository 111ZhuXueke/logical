import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [1,1,0,2,2,2,4,3,3,4,2,0,0] 切割成 [[1,1],[0],[2,2,2],[4],[3,3],[4,2],[0,0]]
 * @author : zhuxueke
 * @since : 2018-02-26 10:38
 **/
public class QiePian {
    static Integer point = 0;
    public static void printResult(){
        List<Integer> listInt = Arrays.asList(1,1,0,2,2,2,4,3,3,4,2,0,0);
        List<ArrayList> integers = new ArrayList<>();
        for (int i = 0; i < listInt.size(); i++) {
            if(point > 0){
                if(i <= point){
                    continue;
                }
            }
            ArrayList arrayList = new ArrayList();
            digui(i,listInt, arrayList);
            if(arrayList.size() > 0){
                integers.add(arrayList);
            }
        }
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

    private static void digui(int i, List<Integer> listInt, ArrayList arrayList){
            if(listInt.get(i) == listInt.get(i+1)){
                arrayList.add(listInt.get(i));
                point = i + 1;
                if(i+1 == listInt.size()-1){
                    arrayList.add(listInt.get(i+1));
                    return;
                }
                digui(i+1,listInt,arrayList);
            }else{
                arrayList.add(listInt.get(i));
            }


    }

    public static void main(String[] args){
        QiePian.printResult();
    }
}