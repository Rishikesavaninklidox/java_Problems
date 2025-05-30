package com.hello.hellorishi;

public class Learn {


    public static void main(String[] args) {
        int score = 10000;
        int bonus = 200;
        int levelCompleted = 8;

        int finalScore = score;
        boolean gameOver = true;

        if(gameOver == true){
            // in this initt value is 10000 after the calu it will changed into the 11600
            finalScore += bonus * levelCompleted;
            System.out.println(" the init final score:" + finalScore);
            // in this if we given the = it just assigine the value to it
            // but if we give the += it will add the value to the variable
            finalScore = bonus * levelCompleted;
            System.out.println("final score:" + finalScore);
            // after thia calu a finalScore will be 1600  the value of bonus * levelCompleted

            finalScore += bonus * levelCompleted;
            System.out.println("final score with the add and equal Opetor :" + finalScore);

        }
    }

}
