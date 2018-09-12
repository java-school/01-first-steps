package _02_Variables._02_1_PrimitiveDataTypes;

public class _02_1_Variables_PrimitiveDataTypes {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//**********************************************
//
//1. Czym są zmienne?
//        Teoria z materiałów
//
//**********************************************

        Rectangle mySmallRectangle = new Rectangle();

        mySmallRectangle.a = 5;                 //instance variable
        mySmallRectangle.b = 6;                 //instance variable

        String units = mySmallRectangle.UNITS;  //class variable (static field)
        units = Rectangle.UNITS;                //class variable (static field)

        checkLocalVariables(units);             //To jest metoda. 'units' jest zmienną przekazaną do metody 'checkLocalVariables'. Metoda ma paramter typu String.

        int _k___2343_lkf_WWW = 2;

        String imie = "Tomek";
        String _imie = "Adam";
        String Imie = "Ania";

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);

//**********************************************
//
//      2. Primitive Data Types
//
//**********************************************

        byte myByteNumber;      // 8-bitowa ze znakiem, liczby całkowite w przedziale od: -128 do 127
        short myShortNumber;    //16-bitowa ze znakiem, liczby całkowite w przedziale od: -32 768 do 32767
        int myIntNumber;        //32-bitowa ze znakiem, liczby całkowite w przedziale od: -2^31 do (2^31) - 1
        long myLongNumber;      //64-bitowa ze znakiem, liczby całkowite w przedziale od: -2^63 do (2^63) - 1
        float myFloatNumber;    //32-bitowa liczba zmienno przecinkowa IEEE 754. Liczba zapisana w postaci:
        double myDoubleNumber;
        boolean myBooleanValue;
        char myCharValue;

        myByteNumber = Byte.MAX_VALUE;
        myShortNumber = Short.MAX_VALUE;
        myIntNumber = Integer.MAX_VALUE;
        myLongNumber = Long.MAX_VALUE;
        myFloatNumber = Float.MAX_VALUE;
        myDoubleNumber = Double.MAX_VALUE;
        myBooleanValue = Boolean.TRUE;
        myCharValue = Character.MAX_VALUE;

//        Konwerter liczb float -> HEX -> binary
//        https://www.h-schmidt.net/FloatConverter/IEEE754.html

        myFloatNumber = Float.intBitsToFloat(0x42f6e666); //liczba 123.45
        int intBits = Float.floatToIntBits(myFloatNumber); //w Debug prawym myszy na zmienna intBits -> View as -> HEX

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue  = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

//         Zadanie

        // 1. Utwórz zmienną typu byte i przypisz do niej dowolną wartość typu byte
        // 2. Utwórz zmienną typu short i przypisz do niej dowolną wartość typu short
        // 3. Utwórz zmienną typu int i przypisz do niej dowolną wartość typu int
        // 4. Utwórz zmienną typu long i przypisz do niej wartość równą:
        //    50000 + 10 razy suma byte plus short plus int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

//        Zadanie

        // Konwertuj podaną wagę w funtach (waga) na kilogramy
        // 1. Utwórz zmienną aby przechować wartość funtów
        // 2. Oblicz wagę w kilogramach dla powyższej liczby i zapisz w zmiennej.
        // 3. Wydrukuj na konsoli wynik
        //
        // UWAGI: 1 funt jest równy 0.45359237 kilograma.

// Rozwiązanie:
        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185

//**********************************************
//
//      2.1. Primitive Data Types - String
//
//**********************************************

//        Oprócz tego JAVA wspiera jeszcze napisy - String

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

//**********************************************
//
//      2.2. Primitive Data Types - Default Values
//
//**********************************************

//        Domyślne wartości dla zmiennych primitive
/*
        Data Type	             |   Default Value (for fields)
        byte	                 |   0
        short	                 |   0
        int	                     |   0
        long	                 |   0L
        float	                 |   0.0f
        double	                 |   0.0d
        char	                 |   '\u0000'
        String (or any object)   |	 null
        boolean	                 |   false
  */

//**********************************************
//
//        3. Literals
//
//**********************************************

//      Nie zawsze używamy słówka new podczas tworzenia obiektów. Zmienne typu primitive można inicjalizować poprzez literals:
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

//**********************************************
//
//        3.1 Integer Literals
//
//**********************************************

        // The number 26, in decimal
        int decVal = 26;
//  The number 26, in hexadecimal
        int hexVal = 0x1a;
// The number 26, in binary
        int binVal = 0b11010;

//**********************************************
//
//        3.2 Floating-Point Literals
//
//**********************************************

        double d1 = 123.4;
// same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;

//**********************************************
//
//        3.2 Character and String Literals
//
//**********************************************

//        Każda zmienna typu char lub String może zawierać znak Unicode (UTF-16)
//        Dodaje się to używając tak zwanego escape character '\' - backslash. Np: \u0108
        char character = '\u0108';                  // litera C z akcentem -> Ĉ
        String siSenor = "S\u00ED Se\u00F1or";      //Sí Señor

        // Tabela UNICODE: https://unicode-table.com/pl/
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Znajdź UNICODE dla symbolu Registered (R w kółku)
        // 2. Utwórz zmienną typu char i przypisz do niej wartość UNICODE tego symbolu
        // 3. Wyświetl na ekranie

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);

//**********************************************
//
//        3.2 Using Underscore Characters in Numeric Literals
//
//**********************************************

//        Przykłady jak jeszcze można zapisać liczby

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

//        Przykłady jak można i nie można ;)

    /*                                            //<<<<<<<<=========USUŃ TĄ LINIĘ ORAZ TAKĄ SAMĄ LINIĘ PONIŻEJ
        // Invalid: cannot put underscores
// adjacent to a decimal point
        float pi1 = 3_.1415F;
// Invalid: cannot put underscores
// adjacent to a decimal point
        float pi2 = 3._1415F;
// Invalid: cannot put underscores
// prior to an L suffix
        long socialSecurityNumber1 = 999_99_9999_L;

// OK (decimal literal)
        int x1 = 5_2;
// Invalid: cannot put underscores
// At the end of a literal
        int x2 = 52_;
// OK (decimal literal)
        int x3 = 5_______2;

// Invalid: cannot put underscores
// in the 0x radix prefix
        int x4 = 0_x52;
// Invalid: cannot put underscores
// at the beginning of a number
        int x5 = 0x_52;
// OK (hexadecimal literal)
        int x6 = 0x5_2;
// Invalid: cannot put underscores
// at the end of a number
        int x7 = 0x52_;
//        Aż do poniższego:

    */                                            //<<<<<<<<=========USUŃ TĄ LINIĘ ORAZ TAKĄ SAMĄ LINIĘ POWYŻEJ


//        Zadania:
        /*

    Questions
1. The term "instance variable" is another name for ___.
2. The term "class variable" is another name for ___.
3. A local variable stores temporary state; it is declared inside a ___.
4. A variable declared within the opening and closing parenthesis of a method signature is called a ____.
5. What are the eight primitive data types supported by the Java programming language?
6. Character strings are represented by the class ___.
7. An ___ is a container object that holds a fixed number of values of a single type.

    Exercises

8. Create a small program that defines some fields. Try creating some illegal field names and see what kind of error the compiler produces. Use the naming rules and conventions as a guide.
9. In the program you created in Exercise 1, try leaving the fields uninitialized and print out their values. Try the same with a local variable and see what kind of compiler errors you can produce. Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.


    Answers to Questions
1. The term "instance variable" is another name for non-static field.
2. The term "class variable" is another name for static field.
3. A local variable stores temporary state; it is declared inside a method.
4. A variable declared within the opening and closing parenthesis of a method is called a parameter.
5. What are the eight primitive data types supported by the Java programming language? byte, short, int, long, float, double, boolean, char
6. Character strings are represented by the class java.lang.String.
7. An array is a container object that holds a fixed number of values of a single type.
        * */
    }

    private static void checkLocalVariables(String parameter) {     //metoda ma paramter typu String o nazwie parameter
        System.out.println(parameter);              //Co się wyświetli?

        String units = "Czy to się wyświetli?";

        System.out.println(units);                  //A tu co się wyświetli?
    }
}
