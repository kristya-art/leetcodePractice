package ja.medium;

public class MultiplyStrings3 {
    public static void main(String[]args){
        String result = multiply("123456789","987654321");

        System.out.println(result);


    }

    public static String multiply(String num1, String num2){

        int length2 = num2.length();
        int result = 0;
        int j = length2-1;

        String stringResult = "0";

        int one = 0;
        one = Integer.parseInt(String.valueOf(num1));
        int two = 0;
        int twoCheck = Integer.parseInt(String.valueOf(num2));
//        if(one==0||twoCheck==0){return stringResult;}
        int multiplier = 1;

        while(j>=0){
            two = Integer.parseInt(String.valueOf(num2.charAt(j)));
            result += one*two*multiplier;
            if(j>0){
            j=j-1;}
            else{break;}
            multiplier *=10;

        }
       stringResult = String.valueOf(result);
       return stringResult; //"121932631112635269"

    }
}
