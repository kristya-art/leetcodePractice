package ja.test;

public class FirstFactorial {
    public static void main(String []args){
        System.out.println(firstFactorial(3));
    }

    public static int firstFactorial(int num){
        if(num==1){return 1;}
        int result = 1;
        for(int i=num;i>0;i--){
            result = result*i;
        }
        return result;
    }
}
