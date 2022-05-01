package ja.medium;

import java.math.BigInteger;

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
 * also represented as a string. in this solution I use BigInteger
 */
public class MultiplyStrings {
    public static void main(String[]args){
        String result2 = multiply("123456789","987654321");
        String result = multiply("0","10");


        System.out.println(result);


    }

    public static String multiply(String num1, String num2){

        int length2 = num2.length();
        BigInteger result = BigInteger.valueOf(0);
        int j = length2-1;

        String stringResult = "0";
        BigInteger tempResult = BigInteger.valueOf(0);

        BigInteger one = new BigInteger(num1);

        int two = 0;
        BigInteger multiplier = BigInteger.valueOf(1);

        while(j>=0){


            two = Integer.parseInt(String.valueOf(num2.charAt(j)));
            tempResult = one.multiply(BigInteger.valueOf(two).multiply(multiplier));
            result =  result.add(tempResult);
            if(j>0){
                j=j-1;}
            else{break;}
            multiplier = multiplier.multiply(BigInteger.valueOf(10));

        }
         stringResult = String.valueOf(result);
        return stringResult;

    }
}

