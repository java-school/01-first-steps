package _03_Operators;

public class _03_Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less then 100");

        // 1. Utwórz zmienną typu double i przypisz do niej wartość 20
        // 2. Utwórz drugą zmienną typu dpuble i przypisz do niej wartość 80
        // 3. Dodaj obydwie liczby i pomnóż przez 25
        // 4. Użyj operatora reszty dzielenia (reminder) aby wyznaczyć resztę z dzielenia sumy z pkt.3 podzielonej przez 40
        // 5. Napisz instrukcję if, która wyświetli komunikat "Total was over the limit"
        //      jeżeli reszta z dzielenia pkt.4 jest równa lub mniejsza niż 20

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if (theRemainder <= 20)
            System.out.println("Total was over the limit");

//        Podumowanie: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

//        Pierwszeństwo operatorów: https://introcs.cs.princeton.edu/java/11precedence/

//        Zadania:

/*
1. Zrefaktoruj poniższy program aby użyć compound assigments (operator skrótowy np: +=):
class ArithmeticDemo {

     public static void main (String[] args){

          int result = 1 + 2; // result is now 3
          System.out.println(result);

          result = result - 1; // result is now 2
          System.out.println(result);

          result = result * 2; // result is now 4
          System.out.println(result);

          result = result / 2; // result is now 2
          System.out.println(result);

          result = result + 8; // result is now 10
          result = result % 7; // result is now 3
          System.out.println(result);
     }
}


2. W poniższym programie wytłumacz dlaczego wartość "6" została wyświetlona dwukrotnie
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
*/
    }
}
