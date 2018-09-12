package _04_ExpressionsStatementsCodeBlocks;

public class _04_ExpressionsStatementsCodeBlocks {
    public static void main(String[] args) {
//        Zacznijmy od słów kluczowych (keywords) w JAVIE: https://en.wikipedia.org/wiki/List_of_Java_keywords
//        Expressions and Statements według Oracle: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html

//        Expression - najmniejsza możliwa konstrukcja języka programowania
//        zbudowana ze zmiennych, operatorów i/lub wywołań metod, która "produkuje" jedną wartość
//        Na przykład: 1 + 2

//        Statement to taki odpowiednik zdania w językach naturalnych (polski, angielski, itp). Statement tworzy kompletne polecenie do wykonania.
//        Statement zawsze kończymy znakiem średnika (semicolon) - czyli ;

        double kilometers = (100 * 1.609344);
        int highScore = 50; //to jest Statement lub też assignment expression, a część po lewej stronie (bez średnika - semicolon) to po prostu expression

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

//        Kolejnym ważnym tematem są akapity/wcięcia w kodzie (ang. indention)

        System.out.println("This is" +
                " another" + "and anoooooooother" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");

//Code blocks and if-then-else control statements
//        Code Block to grupa zera lub więcej Statementsów znajdujących się pomiędzy "kręconymi nawiasami" (ang. curly breaces) - {  }
//        Block {} może być użyty wszędzie tam, gdzie pojedyńczy statement jest dozwolony.

        { //początek code block

            boolean condition = true;
            if (condition) { // begin block 1
                System.out.println("Condition is true.");
            } // end block one
            else { // begin block 2
                System.out.println("Condition is false.");
            } // end block 2
        } //koniec code block - zwroccie uwage jak IntelliJ podpowiada po najechaniu kursorem na curly brace

//        "if" statement sprawdza czy dany statement (ten wewnątrz IFa) będzie wykonany czy też nie
//        zależy to od expression - warunku znajdującego sięw nawiasie IFa - jeżeli jest prawdziwy kod się wykona
//        kod do wykonania w ramach danego IFa może być pojedyńczy statement lub wiele statementów znajdujących sięw code blocku {statement; statement;}

//        "else" statement może być dodany po "if" - jest opcjonalny. Jeżeli warunek expressiona z IFa jest negatywny to kod z "else" statement zostanie wykonany.
//        Możemy również dodać "if" do "else" i tak wielokrotnie, aby testować różne - kolejne warunki

           /*
           if (condition) {
               // if statement (block)
           } else if (condition_two){
               // else if statement (block)
           } else{
               // else statement (block)
           }
           */

    }
}
