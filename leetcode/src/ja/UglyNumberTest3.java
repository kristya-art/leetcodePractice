package ja;

public class UglyNumberTest3 {


    public static int nThUglyNumber(int n){
        int temp = 0;
        int result = 11;

        if(n<7){return n;}
        if(n<10){return n+1;}
        aa:
        for(int i=10;i<=n;i++){
                result = result+1;


//                while(result%7==0 || result%13==0 || result%11== 0 ||
//                        result%17==0 || result%19==0 || result%23==0){
//                    result+=1;
//                }
            temp = result;


       while (temp % 5 == 0 && temp > 7) {
           temp = temp / 5;
           if (temp < 7) {
               continue aa;
           }
       }
       while (temp % 6 == 0 && temp > 7) {
           temp = temp / 6;
           if (temp < 7) {
               continue aa;
           }
       }
            while (temp % 9 == 0 && temp > 7) {
                temp = temp / 9;
                if (temp < 7) {
                    continue aa;
                }
            }

       while (temp % 8 == 0 && temp > 7) {
           temp = temp / 8;
           if (temp < 7) {
               continue aa;
           }
       }


                i=i-1;
        }
        return result;
    }
    public static void main (String[]args){
        long startTime = System.nanoTime();
        int result = nThUglyNumber(400);

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println(result);

    }
}

