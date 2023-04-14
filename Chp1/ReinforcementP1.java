/*
Suppose that we create an array A of GameEntry objects, which has an
integer scores field, and we clone A and store the result in array B
If we immediately set A[4].score equal to 550, what is the score value
of the GameEntry object referenced by B[4]?
*/

public class ReinforcementP1{
    public static void main(String[] args){

        GameEntry[] arrayA = {
            new GameEntry(10),
            new GameEntry(14),
            new GameEntry(15),
            new GameEntry(11),
            new GameEntry(13),
        };

        GameEntry[] arrayB = arrayA.clone();

        arrayA[4].setScore(550);

        System.out.print(arrayB[4].getScore());

        /*
        If we clone an array of GameEntry objects,
        a new array with the same size and elements is created, 
        but the elements themselves are not cloned. 
        That means that both arrays will contain references to the same GameEntry objects in memory.
        */
    }
}

class GameEntry{
    private int score;

    public GameEntry(int score){
        this.score = score;
    }

    public int getScore(){ return score; }

    public void setScore(int score) { this.score = score; }
}