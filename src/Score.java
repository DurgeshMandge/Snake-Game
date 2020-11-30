package src;

public class Score {
    private int score;

    //konstruktor
    public Score(){
        this.score=0;
    }

    //menambah score
    public void increaseScore(){
        this.score++;
    }

    //reset Score
    public void resetScore(){
        this.score=0;
    }

    //untuk mengembalikan nilai score ke tampilan Gameplay
    public int getScore(){
        return this.score;
    }
}