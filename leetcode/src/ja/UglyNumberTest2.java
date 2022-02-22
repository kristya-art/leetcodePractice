package ja;

public class UglyNumberTest2 {


    public static int nThUglyNumber(int n){
         int temp = 0;
         int result = 1;
         if(n==1){return 1;}

         for(int i=2;i<=n;i++){
             temp = 2;
             while(temp!=1) {
                 result = result+1;
                 if(result % 7 == 0){result=result+1;}
                 temp = result;
                 while (temp % 2 == 0) {
                     temp = temp / 2;
                 }
                 while (temp % 3 == 0) {
                     temp = temp / 3;
                 }
                 while (temp % 5 == 0) {
                     temp = temp / 5;
                 }

             }
         }
         return result;
    }
    public static void main (String[]args){
        long startTime = System.nanoTime();
        int result = nThUglyNumber(300);
        System.out.println(result);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);

    }
}
