package ja;

import java.util.ArrayList;

/**
 * An ugly number is a positive integer whose prime factors are limited
 * to 2,3, and 5. Given an integer n, return the nth ugly number.
 */
public class UglyNumber2 {
    public static int nthUglyNumber(int n) {
            int outputNumber = 6;
            int temp = 1;
            int countForfive=1;

            if(n<7){return n;}


            int i = 7;
                     while (i !=(n+1)) {
                     outputNumber = outputNumber + 1;
                  //   if(outputNumber%7==0){outputNumber=outputNumber+1;}
                     temp = outputNumber;





                      while(temp%2==0){temp=temp/2;}

                      while(temp%3==0){temp=temp/3;}
                      while(temp%5==0){temp=temp/5;}



                      if(temp==1) {
                          i=i+1;
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

