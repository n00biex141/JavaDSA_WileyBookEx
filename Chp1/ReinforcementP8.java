/*
Write a short Java method that uses a StringBuilder instance to remove all the punctuation from string s storing
a sentence, for example, transforming the string "Let's try, Mike!" to "Lets try Mike".
*/

public class ReinforcementP8{
    public static void main(String[] args){
        System.out.print(punCleaner("Let's try, Mike!"));
    }

    public static String punCleaner(String s){
        String s1 = s.replaceAll("\\p{P}", "");
        return s1;
    }
}