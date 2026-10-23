import java.util.Scanner;
/*  notes day 1: comment space practice 
Vocab
algorithum:a step by step process to accomplish a task
pseudocode:simplified code to outline programs/algorithum. (ex- add func ()
                                                                  num 1
                                                                  num 2
                                                                  1+2 prints) (this helps us with sequencing-the order of steps)*/
/* What is the difference between java script and java? They are entirely different languages but they have a shared name due to 1990s marketing. Java is a statically typed, class-based language that compiles to bytecode to run on a Virtual Machine (JVM), making it most useful for Android apps, corporate backends, and enterprise software. JavaScript is a dynamically and weakly typed, prototype-based scripting language that runs natively in web browsers to create interactive websites and full-stack web applications. While Java relies on multi-threading to handle complex, concurrent tasks, JavaScript uses a single-threaded asynchronous event loop to keep web pages responsive.*/

public class Main {
   public static void main(String []args) {
      // all code goes here 
      /* notes day 2: Object-oriented programming: programming built on classes and objects
      ex.
      public class MyClass{
      ~~~~~~~~~~~~~~~~~(numofStudent)
      ~~~~~~~~~~~~~(Subject)
      }
      Class:blueprint of an object (no memory)
      Object:actual implementation(gets stored in memory)
      method:reusable chunk of code that accomplishes an action(function)
      ex. main method (entry point to our code)
      -> main(){
      }
      we code in an IDE with a compiler
      compilers translate our java to binary

      /*.... */ /*bulk comment */

      //......// line comment

      //every action in java ends with a //;// \ */ 

      /* notes day 3: 
      permitive type: restoring simple information/data (ex. int x = 5;)
      object (reference) type- storing complex data/objects (ex. creature cat = new creature())

      primitive variable types to know: 
      1. int - stores integer/ positive or negative whole numbers 
      2. double - stores decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
      3. boolean - stores logic when it is a binary, only options are True or False

      Object variable types to know:
      1. String - stores text between quotes ex. "5.0", "Hello world"

      Setting up variables in code:
      Declaring + Assigning (effiecient at times when a variable is missing, like not knowing the string)
      1. Declare Variable --> int x; String name; (entire line of code, just labeling the variables) 
      2. Assign Variable --> x = 5; name= "Asiya"

      double average;
      average(list of gradees)
      average = calculus

      Or do it in ONE STEP 
      Initialize Variable --> int x = 5; String name = "Asiya"
      */

      /* Notes day 4 9/22

      Object-oriented programming: programming built on classes and objects
      ex.
      public class MyClass{
      ~~~~~~~~~~~~~~~~~(numofStudent)
      ~~~~~~~~~~~~~(Subject)
      }
      Class: blueprint of an object (no memory)
      Object: actual implementation(gets stored in memory)

      method: reusable chunk of code that accomplishes an action (function)
      ex. main method (entry point to our code)
      -> main(){
      }
      we code in an IDE with a compiler
      compilers translate our java to binary

      /*.... */ /*bulk comment */

      //......// line comment

      //every action in java ends with a //;//
      
      // Notes 9/28

      //declare a variable
      /*double myGradeAverage;
      //asign a value
      myGradeAverage = 95.0;

      //initialize a variable -- declare and assign in one statement

      double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)

      System.out.println("My current grade is:" + myGradeAverage);

      System.out.println("My current grade is:" + myDreamGrade);

      //print statement for ideal graade

      int vacationsPerYear;

      vacationsPerYear = 7;

      System.out.println("My dream number of vacations per year is:" + vacationsPerYear);

      //Assignment 9/28
      System.out.print("Hi ");
      System.out.print("there");
      System.out.print("!"); */

      //printing a quote using an escape sequence
      //escape sequences always use a backslash \
      // backslash n gives a new line "\n"
      //if you want to print a backslash you write \\
      //System.out.print("My teacher \\always says, \n\"Study for your test!\"");

      //System.out.println("My mom always tells me to \"Aim for higher than a \"" + myGradeAverage + "\"");

      //arithmetic operations (+ - * /)
      //working with only ints, output will be an int
      // int/int does TRUNCATING DIVISION removes the decimal, does not round if you are dividing by two numbers that give you a decimal
      System.out.println(12/10);
      //if we want to divide and get a decimal, we need to divided with a double
      //System.out.println(19/10.5);
      //System.out.println(10 + 12.0);
      // % givves us the remainder
      //System.out.println(12%10);  
      
      
      int myNum = 7; 
      int newNum = myNum;
      newNum = 8; 

      //System.out.println(myNum);
      //System.out.println(newNum); 
      
      //incrementing variable;
      myNum = myNum + 1;
      myNum = myNum + 1;
      //efficient way- myNum++; special short hand case that handles assignment and addition all at once. 
      
     /* System.out.println(myNum);
      //System.out.println(newNum); 
      //decreementing 
      myNum= myNum - 1;
      myNum--; 
      //working with scanner class and text input
      System.out.println("Greetings human! What is your name?");
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      System.out.print("Hello " + name); 
      
      scan.close(); */

     /* System.out.println("Hello World");

    //Lesson 1.5 Notes, on Casting- it allows us to change from one data type to another. We are reshaping the value type. 
    //we cast by using a cast opperator written in () before out expression
    */
    double doubleNum = 5.0; 
    System.out.println((int)doubleNum / 2); 

/* if i want to cast from a double to an int, it will truncate out double 
   casting from an int to a double just adds .0 to the end */

      System.out.println((int) 4.3); 
      System.out.println((double) 8); 
      
      double number; //positive value from somewhere
      double negNumber; //negative value from somewhere

      number = 4.0;
      negNumber = -3.6; 
      int nearestint = (int)(number + 0.5);
      int nearestNegInt = (int)(negNumber = 0.5); 

      system.out.println(nearestInt);
      system.out.println(nearestNegInt); 

      // 1) declare and initialize grades
// int grade1 = 65;
// int grade2 = 97;
// int grade3 = 86;

// 2) declare sum
// int sum; 248

// 3) declare average as double
// double average; 82.67

// 4) compute sum 
// int sum = grade1 + grade2 + grade3;

// 5) compute average with casting
// average = (double) sum / 3;

// 6) print result
// System.out.println(average);
/*notes 10/6/26 compound assignment operators 
-conpound assignment operators always have the math symbol first, and then the equal sign

average= average + 1; 
average+=1; // These two lines do the same exact thing 
average++;//most condensed version only increments one or decrements by 1
System.out.println(average);

//We can do compound operators with any number, not just 1. 

average-=2;
average--; //most condensed version only increments one or decrements by 1. 
System.out.println(average); 

//Task 

int score=0;
System.out.println(score); //0 

score++;           //+1
system.out.println(score); //1

score *=2;         // x2
system.out.println(score); //2

int penalty = 5; 
score -=penalty / 2;   //2-
(5/2) -> 2 - 2 ->

/* Pre condition- before the method runs, what must be true. Postcondition- after method runs, what must be true */

/* test on tuesday oct.20th Lessons 1-9 and hw assignment due next week(use as a study guide)
*/

//method- a named block (connected to a class and can store code- like information in a variable) of code that performs a task/process when it is called. 
//main method: main(takes things in) {block of code} *what is takes in- data is called a perameter*
//procedural abstraction- allowing a programmer to use a method without knowing how it works (w/o knowing all of the details), i.e. "abstracting way" the details. 
//a method header is the first line of a method that defines: method name, return type and perameter list

/*Calling Static Methods and Non-Void Methods- notes hw
A static method, also called a class method, is a method that belongs to the class itself rather than to a specific object: it belongs to the class, so you can call it using the class name without creating an object.
- a short example: school fire drill, the instructions apply to everyone and you dont need to ask a student for an indivisual procedure
*/
public class MathFunctions {
    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        sayHello();
        MathFunctions.sayHello();
    }
}
//both methods print hello- sayHello(); calls the method directly because it is in the same class.
//- MathFunctions.sayHello(); calls the method using its class name.
//the dot opperator connects a class name to a method name when calling a static method from another class.
/* Break down of static method - public static void sayHello()
Part	   Meaning
public	   The method can be accessed from other classes, subject to access rules.
static	   The method belongs to the class.
void	   The method does not return a value.
sayHello	The method's name.
()	The parentheses have the parameters, (if any) */ // for this part of my notes I used some ai because i wanted a more in depth example and was a little confused, please let me know if this is unacceptable and I will delete it. 

/*Void methods vs. Non-void methods 
Void method performs a value but does not return a value
Non-Void method calcutlates or gets a value and sends it back using return. 
The return statement sends a value back to the place where the method was called. It also immediately ends that method's execution.
- public static int calcArea(int length, int width) {
    int area = length * width;
    return area;
} The return type is int because the method returns an integer.
Key rule: The return type in the method header must match the type of value returned.

Non-Void Method(calling)- When a non-void method returns a value, you should use that value. Two common ways are storing it in a variable or using it directly in an expression.
- int y = calcArea(3,5); // store return value, calcArea(3, 5) returns 15. 
System.out.println(answer)prints 15.
System.out.println(y); 
System.out.println(calcArea(4,2)); // use directly, Java calls the method, gets the returned value 8, and passes it to println.

Memorize 
Class methods are associated with the class (not instances of the class which we will see in later lessons).
Class methods include the keyword static in the header before the method name.
A void method does not have a return value and is therefore not called as part of an expression.
A non-void method returns a value that is the same type as the return type in the header.
To use the return value when calling a non-void method, it must be stored in a variable or used as part of an expression.
Common errors with methods are mismatches in the order or type of arguments, return values, and forgetting to do something with the value returned from a method. When you call a method that returns a value, you should do something with that value like assigning it to a variable or printing it out.
Class methods are typically called using the class name along with the dot operator. When the method call occurs in the defining class, the use of the class name is optional in the call.

Common Mistakes with non-void methods 
Forgetting to use the return value — If a method returns a value, assign it to a variable or use it in an expression.
Mismatched types — Ensure the type you store the return value in matches the method’s return type.
Incorrect argument types/order — Match the method signature exactly.


Calling Methods from Another Class
In the examples above, we called the methods just by using the method name since they were defined in that same class. However, if we call a method from a different class, another Java program, we need to include its class name. Class methods are typically called using the class name along with the dot operator (.).

*/




   }
}