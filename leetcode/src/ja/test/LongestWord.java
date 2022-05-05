package ja.test;

import java.util.regex.Pattern;
public class LongestWord {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
        System.out.println(LongestWord("fun&!! time"));
        // System.out.println(word.substring(0,1));
    }

    public static String LongestWord(String sen) {
        // code goes here
        //s.matches("^[a-zA-Z]*$")

        StringBuilder strB = new StringBuilder(sen);
        StringBuilder temp = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        int count = 0;

        String matchesStr = "^[a-zA-Z]*$";
        // sen.matches("^[a-zA-Z]*$");
        int j = 1;
        int i = 0;

        while(j!=sen.length()){
          while(sen.substring(i,j).matches(matchesStr))  {
              temp.append(sen.charAt(j-1));
              if(j<sen.length()){
              j=j+1;}
              else{break;}

          }
          if(j<sen.length()){
          i=j;
          j=j+1;}
          if(temp.length()> result.length()){
              result = temp;
          }
            temp = new StringBuilder("");
        }


        return result.toString();
    }


}