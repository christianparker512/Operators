package parker.learningJava;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);
        result = result * 10;
        System.out.println(" 2 * 10 = " + result);
        result = result / 5;
        System.out.println("20/5 = " + result);

        result = result % 3;
        System.out.println(result);

        //result = result +1
        result ++; //1 +1 = 2
        System.out.println("1 + 1 = " + result);

        result --;
        System.out.println("2 - 1 " + result);

        result += 2;
        System.out.println("1 + 2" + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /=3; //30 /3 = 10;
        System.out.println(("30 /3 = "+ result));

        boolean isAlien = false;
//        if(isAlien ==false)
        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 90;
        //if(topScore !=100){
        if(topScore == 100){
            System.out.println("you got the high score!");
        }
        int secondTopScore = 85;
        if(topScore > secondTopScore && topScore <100){
            System.out.println("greater than top score and less than 100");
        }
    }
}
