/*
Write a short Java method that counts the number of vowels in a given character string.
*/

public class ReinforcementP7{
    public static void main(String[] args){
        System.out.print(vowelCounter("The quick brown fox jump Over the lazy dog".toLowerCase()));
    }

    public static int vowelCounter(String s){
        int count = 0;

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++)
            if(chars[i] == 'a' || 
               chars[i] == 'e' || 
               chars[i] == 'i' || 
               chars[i] == 'o' || 
               chars[i] == 'u')
                    count++;

        return count;
    }
}