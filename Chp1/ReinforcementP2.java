/*
Write a short Java method, isMulitple that takes two long values, n and m, and returns true
if and only if n is multiple of m, that is, n = mi for some integer i
*/

public class ReinforcementP2{
    public static void main(String[] args){
        System.out.print(isMultiple(12, 4));
    }

    static boolean isMultiple(long n, long m){
        if(n == 0 || m == 0)
            return false;

        if(n % m == 0)
            return true;
        else
            return false;
    }
}