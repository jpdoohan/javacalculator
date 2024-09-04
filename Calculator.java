import java.util.Scanner;

public class Calculator {
    // Class body here ^public is the access modifier, class is declaring a class, and Calculator is
    // the name of the class. The curly braces {} indicate that everything within them like methods
    // and variables belong to this class.
    public static void main(String[] args) {
        //Code goes here
        //static ensures this method belongs to a class and not a specific instance of a class...you can 
        //call this method without creating an object of the class. 
        //void is the return type of the method, i.e. this method does not return a value, it just
        //starts the program in this case.
        //Main is the name of the method-the entry point of the program. Every java application
        //needs a main method to run
        //string [] args is the paramater- an array of string objects. It'll allow the method to 
        //accept input from the command line when the program is started. 

        Scanner scanner = new Scanner (System.in);

        //Scanner scanner - This declares a variable named scanner, of the type Scanner that we imported in, which we
        //can use to create an object of the Scanner class.
        //new Scanner (system.in); creates the scanner object. System.in tells the Scanner to read
        //input from the keyboard (system.inPUT). We've configured it to pick up user input from
        //the keyboard and send it to the program.

        System.out.print ("Enter first number: "); 
        double num1 = scanner.nextDouble();

        //system.out tells system to output, print means to print the text we enter next. 
        //double is the type, and is used to store numbers wit decimal places. num1 is the name of the
        //declared variable.

        System.out.print ("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);

        // char operator, declares a variable operator of type char, which is short for character. You
        //use it to store single symbols. 
        //scanner.next- this is a method which reads the next input from the user
        //.charAt(0) is a method which extracts the first char from the string we asked for above^^ which
        //is then stored as the operator variable.  

        double result;

        // declaring a variable called result which is a double type.

        switch (operator) {
            //switch is a statement which evaluated the variable against different arguements, defined below
            //by case. Switch-case is a control-flow structure, like if-else. 
            case '+':
                result = num1 + num2;
                break;
                //if operator is +, adds num1 and num2 and creates a result variable
                //the break statement exists this switch block after executing the code. Without this,
                //the code would carry on through each of the subsequent cases, an behaviour
                // known as "fall through"

            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 !=0) {
                    result = num1 / num2;
                    break;
                    //this checks the number is not 0 before doing the case block
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                // if it is -, it uses the else statement to execute this code, printlng an error message.
                //return exits the main method
            default:
            //The default case if used if the case labels don't match the operator. i.e. they entered in a letter
                System.out.println("invalid Operator!");
                //this tells the user that they've done a bad thing
            return;
        }
        System.out.println("The result is:" + result);
        //After the switch-case block, the system displays this in the console. 

    }
}