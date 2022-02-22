package ja;

import java.util.ArrayList;

// 1 2 3 4 5 6 8 9 10 12 14 15 16 18 20
public class UglyNumbersGeneration {
    public static int nThUglyNumber(int n){


        return 0;
    }

    public static ArrayList<Integer> numbersGenerator(int num){
        int i =0;
        ArrayList<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);


        int temp2 = 2;
        int temp3 = 3;
        int temp5 = 5;
        while(i<num){
            temp2  = temp2*2;
            i+=1;
            temp3 = temp3*2;
            i+=1;
            temp5 = temp5*2;
            i+=1;
            numlist.add(temp2);
            numlist.add(temp3);
            numlist.add(temp5);
        }

        return numlist;
    }
    public static void main (String []args){
        double startTime = System.nanoTime();

        ArrayList<Integer> numList = new ArrayList<>();
        numList = numbersGenerator(10);
        System.out.println(numList);
        double endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
