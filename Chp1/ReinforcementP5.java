/*
Write a short Java method that takes an integer n and returns the sum of all the even positive integers less than
or equal to n.
*/

public class ReinforcementP5{
    public static void main(String[] args){
        System.out.print(allEvenNum(8));
    }

    public static int allEvenNum(int n){
        int sum = 0;
        for(int i = 2; i <= n; i+=2)
            sum += i;
        return sum;
    }
}