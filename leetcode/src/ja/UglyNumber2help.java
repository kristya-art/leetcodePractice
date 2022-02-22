package ja;

import java.util.ArrayList;

/**
 * An ugly number is a positive integer whose prime factors are limited
 * to 2,3, and 5. Given an integer n, return the nth ugly number.
 */
public class UglyNumber2help {

    public static int nthUglyNumber(int n) {
      ArrayList<Integer> list = new ArrayList<>();
      int outputNumber = 1;
      int temp = 0;
      if(n==1){return outputNumber;}

aa:
        for(int i=2;i<=n;i++) {
          outputNumber = outputNumber + 1;
          temp = outputNumber;
          while (temp != 1) {
              while (temp % 2 == 0) {
                  temp = temp / 2;
              }
              if (temp == 1) {
                  continue aa;
              }

              while (temp % 3 == 0) {
                  temp = temp / 3;
              }
              if (temp == 1) {
                  continue aa;
              }

              while (temp % 5 == 0) {
                temp=temp/5;
              }
              if(temp==1) {
                  continue aa;
              }
              outputNumber=outputNumber+1;
              temp=outputNumber;
          }
      }
      return outputNumber;
    }
    public static void main(String []args){
        long startTime = System.nanoTime();
        System.out.println(nthUglyNumber(300));
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
//298300 - time - version 1

