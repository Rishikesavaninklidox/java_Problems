package com.hello.hellorishi;
///  this the challenges of udemy course of 50-ep Completed

public class Method_C {


    ///  the Main Method
    public static void main(String[] args) {
        // creating a variable to store the result of the method
      int  disName2 = calculateHighscorePosition(1000);
      // dir called the method and assing the value to the variable and assign the result to the variable
      displyHighscorePosition("Rishi",disName2);

      int  disName = calculateHighscorePosition(500);
      displyHighscorePosition("Siva",disName);

      int  disName1 = calculateHighscorePosition(100);
      displyHighscorePosition("Mari",disName1);
    }

    // The Method For the  Highscore Position
    public static void displyHighscorePosition(String pName , int pPosition) {
        System.out.println(pName + " is the " + pPosition + " st highscore player");

    }
    // this method calculate the position of the player calculateHighscorePosition
    public static int calculateHighscorePosition(int pScore) {
        int postion= 4;
        if(pScore >= 1000){
           postion = 1;
        } else if (pScore >= 500) {
          postion = 2;
        }else if (pScore >= 100){
           postion = 3;
        }
        return postion;
    }

}


 class Vowels {

    // the main method a java JVM Starting point
     public static void main(String[] args) {

System.out.println(vowels("RISHI"));
System.out.println(vowels("A"));
System.out.println(vowels("E"));
System.out.println(vowels("p"));
     }

     // Creating a Method for the Vowels
     // usding the return type boolean for the method to return the result has coincidence a VOWEL
     // of aeiou
     public static String vowels(String pName) {
         String name = pName;
         if (name.toLowerCase().matches( "[aeiou]")){
             System.out.println("the name is lower case : " + name + " : This is not a vowel");
         } else if(name.toUpperCase().matches( "[AEIOU]")){
             System.out.println("the name is upper case : " + name + " : This is a vowel");
         }
         return  name;

//         return  pName.toUpperCase().matches("[AEIOU]");

        //return  pName.contains("a") || pName.contains("e") || pName.contains("i") || pName.contains("o") || pName.contains("u");
     }
}



/// abstract class
abstract  class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void methodCall();
}

class Lion extends Animal {

    void methodCall(){
       System.out.println("This a abstract method");
    }
}

class Cat extends Lion {
    public static void main(String[] args) {
        Lion lionObj = new Lion();
        HappyNumbers numbhap= new HappyNumbers();
        System.out.println(numbhap);
lionObj.eat();
lionObj.methodCall();
    }

}


///  problem of udemy

// teen numbers problem  useing the if-else
class TeenNumberChecker {
    public static boolean hasTeen(int x,int y,int z){


        if((x>=13 && x<=19) || (y>=13 && y<=19) || (z>=13 && z<=19)){
            return true;
        }
return  false;
    }
    public  boolean isTeen(int x){



        if((x>=13 && x<=19)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
      TeenNumberChecker num= new TeenNumberChecker();
   System.out.println(num.hasTeen(1,10,11));
   System.out.println(num.isTeen(13));

    }
}

// teen numbers problem useing der return type
 class TeenNumberCheckerTwo {

    // creating a method and creating a variable's of three interger's
    // hasTeen  mean's it cointain a values of 14teen,16teen
    // using the boolean to check it true are false
    public static boolean hasTeen(int x,int y,int z){

        return (x>=13 && x<=19) || (y>=13 && y<=19) || (z>=13 && z<=19);

    }
    public static boolean isTeen(int x){

        return (x>=13 && x<=19);
    }
}

///  proble to cheak the positive number are negative solved
 class PositiveNegativeZero {

//  the PositiveNegativeZero problem
// step-1 : creating a Method and using a signature of int datatype
// step-2 : using the else-if conditions to check the variable  is greater than 0 || not
// step-3 : if the conditions is true it will print positive else it will print negative


    public static void checkNumber(int number){
        if(number>0){
            System.out.println("positive");
        }else if (number<0){
            System.out.println("negative");
        }else if (number==0){
            System.out.println("zero");
        }
    }


}

///  the happy numbers
class HappyNumbers{

    public static boolean happy(int n){
        // to solve this problem need to while loop
        while (n!=1 && n!=4){
            //We use sum = 0 to start fresh for each round of calculating the sum of squares of the digits of n.
            int sum = 0;
            // inner Loop
            while (n>0){
                //need sperate the numbers so using the mod function % to get the reminder
                int z = n%10;
                // after the mod function need to store into the sum and sqre the value
                sum += z*z;
                // to get the qusent value of the number
                // If n = 19, after getting 9 using n % 10, we do n /= 10 → now n = 1.
                // Next, we process 1. After that, n becomes 0, and the loop ends.
                n/=10;
            }
              n=sum;
        }
        return n==1;
    }
}

///  the BarkingDag Proble Solved
 class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if(hourOfDay <0 || hourOfDay>23){
            return false;
        }

        else if(barking && (hourOfDay < 8 ||hourOfDay> 22)){
            return true;

        }else{
            return false;
        }
    }

    //udemy Problem Of the LeapYear
     class LeapYear {


        public static boolean isLeapYear(int year){

            if(year<=1 || year>= 9999){
                return false;
            }else if(year%4 ==0){
                if(year % 100 != 0 || year % 400 ==0){
                    return true;
                }
            }else{
                return false;
            }
            return false;
        }
    }

}