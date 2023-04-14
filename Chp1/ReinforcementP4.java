/*
Write a short Java method that takes an integer n and returns the sum of all positive integers less than or equal to n.
*/

public class ReinforcementP4{
    public static void main(String[] args){
        System.out.print(allNum(4));
    }

    public static int allNum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}