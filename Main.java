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
      System.out.println("Hello World");
   }
}

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
      double myGradeAverage;
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
      System.out.print("!");

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
      
      System.out.println(myNum);
      //System.out.println(newNum); 
   //decreementing 
   myNum= myNum - 1;
   myNum-; 
//working with scanner class and text input
System.out.println("Greetings human! What is your name?");
Scanner scan = new Scanner(System.in);
   



      
      
