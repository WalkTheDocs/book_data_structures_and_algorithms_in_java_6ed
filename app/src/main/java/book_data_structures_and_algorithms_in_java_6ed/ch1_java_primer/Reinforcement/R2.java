package book_data_structures_and_algorithms_in_java_6ed.ch1_java_primer.Reinforcement;

/**
 * Suppose that we create an array A of GameEntry objects, which has an integer
 * scores field, and we clone A and store the result in an array B. If we then
 * immediately set A[4].score equal to 550, what is the score value of the
 * GameEntry object referenced by B[4]?
 */
public class R2 {
    public static void main(String[] args) {
        GameEntry[] A = { new GameEntry(), new GameEntry(), new GameEntry(), new GameEntry(), new GameEntry() };
        GameEntry[] B = A;
        A[4].score = 550;
        System.out.println(B[4].score);
    }
}

class GameEntry {
    public int score;

    GameEntry() {
        this.score = 0;
    }

    GameEntry(int score) {
       this.score = score; 
    }
}
