 # Data Types in Java 


## Class 

 At its most basic level, a class is a collection of variables (fields) and functions called methods. A program is a collection of classes. The basic code for declaring a Java class is as follows:

### class 

` MyClass{
    // This is a single-line comment.
    /*  This is also a comment.
        This type of comment can span several lines
    */
}`

When declaring a class, the name should always start with a capital letter; this signifies to certain compilers (and human readers of your code) that it is a class (or other similarly-behaved structure that you'll learn about later). If you wish to use a compound phrase (e.g.: "my class") as your class name, you should write it in CamelCase; this means you should capitalize each word and remove spaces between words (e.g.: "MyClass").


###  __Note__: Class names cannot begin with numbers or contain any spaces.

## variable

<img width="764" alt="Regular Expressions Patterns in Java" src="https://github.com/jaimehernan95/data-types-java/blob/main/image/eclipse.png">

## Function

### A sequence of packaged instructions that perform a task.

## Method
### in Object-Oriented programming, a method is a type of function that operates on the fields of a class.

 * ` int myMethod(){
    // ...does cool stuff.
}
void myMethod(int myInt){
    // ...does cool stuff.
}`

## Object
## Stream


#### **source**: https://www.hackerrank.com/challenges/30-hello-world/tutorial

> This file contains  3 examples of data type and one challenge has been solved using Java 7, below you can find the screentshoots from the objective and the result

## Objective

### An Object is an instance (or variable) of a class.

## Stream

 Think of this as the flow of data from one place to another. Most of our challenges require you to read input from System.in (also known as stdin, the standard input stream), and write output to System.out (also known as stdout, the standard output stream). In Java, the Scanner class is widely used to read input, but each language has its own mechanism for handling IO (input and output).


The syntax for reading from stdin using the Scanner class is as follows:

` Scanner scan = new Scanner(System.in);`

This creates a new Scanner object that reads from the System.in stream and can be accessed using the variable name . To read in information from stdin, you just need to apply Scanner's methods to your scanner object. Here are two basic examples:

* `scan.next(); // returns the next token of input
* scan.hasNext(); // returns true if there is another token of input (false otherwise)
* scan.nextLine() // returns the next LINE of input
* scan.hasNextLine();// returns true if there is another line of input`

When you are finished reading from an input stream, you should close it to avoid a resource leak. The following line of code closes the Scanner object referenced by our  scan variable:

` **scan.close();**`
Let's say we want to assign a value received from stdin to some String that we'll name s , and then print it. We can accomplish this with the following code:

* ` Scanner scan = new Scanner(System.in); // open scanner
* String s = scan.next(); // read the next token and save it to 's'
* scan.close(); // close scanner
* System.out.println(s); // print 's' to System.out, followed by a new line
* If the input token is Hi!, the above code will print Hi!.`


You can also print text in quotes using System.out.println, or combine quoted text with a variable (e.g.: System.out.println("Input received: " + s);).


# Code

` public class Solution {
public static void main(String[] args) {
    // Create a Scanner object to read input from stdin.
    Scanner scan = new Scanner(System.in); 
    // Read a full line of input from stdin and save it to our variable, inputString.
    String inputString = scan.nextLine();
    // Close the scanner object, because we've finished reading 
    // all of the input from stdin needed for this challenge.
    scan.close();
    // Print a string literal saying "Hello, World." to stdout.
    System.out.println("Hello, World." );
    // TODO: Write a line of code here that prints the contents of inputString to stdout.
    System.out.println(inputString);
}
}`


# Result  hello world
`Compiler Message
Success`

`Input (stdin)`

`Welcome to 30 Days of Code!`

`Expected Output`

`Hello, World.
Welcome to 30 Days of Code!`


<img width="764" alt="data types Java" src="https://github.com/jaimehernan95/data-types-java/blob/main/image/datatypes.png">


## Problem Data types
### Task

Complete the code in the editor below. The variables i ,d , s  and  are already declared and initialized for you. You must:

1. Declare 3 variables: one of type int, one of type double, and one of type String.
2. Read 3  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  3 variables.
3. Use the **+** operator to perform the following operations:
Print the sum of i plus your int variable on a new line.
Print the sum of  d plus your double variable to a scale of one decimal place on a new line.
Concatenate s  with the string you read as input and print the result on a new line.

> **Note**: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

### Input Format

* The first line contains an integer that you must sum with i.
* The second line contains a double that you must sum with d.
* The third line contains a string that you must concatenate with s.

### Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

### Sample Input

* 12
* 4.0
* is the best place to learn and practice coding!

### Sample Output

* 16
* 8.0
*HackerRank is the best place to learn and practice coding!

### Explanation

* When we sum the integers 4 and 12, we get the integer 16.
* When we sum the floating-point numbers 4.0  and 4.0, we get 8.0.




### Data types Solution in Java ( See code in the scr files)

`import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
        public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";`
        
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
         int i2;
         double d2;
         String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 =  scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();

        s2 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */

        System.out.println(d + d2);
        
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(s.concat (s2));

        scan.close();`


## Result

* Input (stdin)
    * 12
    * 4.0
* is the best place to learn and practice coding!

* Your Output (stdout)
    * 16
    * 8.0
* HackerRank is the best place to learn and practice coding!

* Expected Output
    * 16
    * 8.0
* HackerRank is the best place to learn and practice coding!

#### **source**: https://www.hackerrank.com/challenges/30-hello-world/tutorial
