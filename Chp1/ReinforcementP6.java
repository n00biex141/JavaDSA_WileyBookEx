/*
Write a short Java method that takes an integer n and returns the sum of the squares of all positive integers less
than or equal to n.
*/

public class ReinforcementP6{
    public static void main(String[] args){
        System.out.print(allSquareNum(4));
    }

    public static int allSquareNum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += Math.pow(i, 2);
        return sum;
    }
}