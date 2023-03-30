package p1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumCalculator {

    List<Integer> numlist = Arrays.asList(1,2,3);
    int sum=0;

    public int calSumFor(){
        for (int i : numlist){
            sum = sum+i;
        }
        return sum;
    }
    public int calSumWhile(){
        Iterator iterator = numlist.iterator();
        int j = numlist.stream().findFirst().get();
        while (j<=numlist.size()){
            sum = sum+j;
        }
        return sum;
    }


    public static void main(String[] args) {
        SumCalculator s = new SumCalculator();
        s.calSumFor();
        s.calSumWhile();
    }
}
