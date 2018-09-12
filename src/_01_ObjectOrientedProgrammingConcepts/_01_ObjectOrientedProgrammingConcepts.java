package _01_ObjectOrientedProgrammingConcepts;

import _01_ObjectOrientedProgrammingConcepts.model.Bicycle;

public class _01_ObjectOrientedProgrammingConcepts {
    public static void main(String[] args) {
        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

    }
//Zadania

    /*
    Questions
1. Real-world objects contain ___ and ___.
2. A software object's state is stored in ___.
3. A software object's behavior is exposed through ___.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data ___.
5. A blueprint for a software object is called a ___.
6. Common behavior can be defined in a ___ and inherited into a ___ using the ___ keyword.
7. A collection of methods with no implementation is called an ___.
8. A namespace that organizes classes and interfaces by functionality is called a ___.
9. The term API stands for ___?

    Exercises
1. Create new classes for each real-world object that you observed at the beginning of this trail. Refer to the Bicycle class if you forget the required syntax.
2. For each new class that you've created above, create an interface that defines its behavior, then require your class to implement it. Omit one or two methods and try compiling. What does the error look like?


    Answers to Questions
1. Real-world objects contain state and behavior.
2. A software object's state is stored in fields.
3. A software object's behavior is exposed through methods.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
5. A blueprint for a software object is called a class.
6. Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword.
7. A collection of methods with no implementation is called an interface.
8. A namespace that organizes classes and interfaces by functionality is called a package.
9. The term API stands for Application Programming Interface.
    * */

}
