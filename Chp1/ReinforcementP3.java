/*
Write a short Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your method
cannot use the multiplication, modulus, or division operators.
*/

public class ReinforcementP3{
    public static void main(String[] args){
        System.out.print(isOdd(2));
    }

    public static boolean isOdd(int n){
        if((n & 1) == 1)
            return true;
        else
            return false;
    }
}