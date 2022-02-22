package ja;

public class UglyNumberTest4 {


    public static int nThUglyNumber(int n){
        int temp = 0;
        int result = 11;
        int count = 9;


        if(n<7){return n;}
        if(n<10){return n+1;}

            temp = 2;
            while(count!=n) {
                result = result+1;


                temp = result;
                    while (temp % 5 == 0 && temp > 7) {
                        temp = temp / 5;
                        if (temp < 7) {
                            count = count + 1;
                        }
                    }


                    while (temp % 3 == 0 && temp > 7) {
                        temp = temp / 3;
                        if (temp < 7) {
                            count = count + 1;
                        }
                    }


                    while (temp % 2 == 0 && temp > 7) {
                        temp = temp / 2;
                        if (temp < 7) {
                            count = count + 1;
                        }
                    }
                }

        return result;
    }
    public static void main (String[]args){
        long startTime = System.nanoTime();
        int result = nThUglyNumber(400);

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println(result);

    } // 7000 // 20
}


