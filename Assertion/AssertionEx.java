import java.io.Console;

// An assertion allows testing the correctness of any assumptions that have been
// made in the program. An
// assertion is achieved using the assert statement in Java. While executing
// assertion, it is believed to
// be true. If it fails, >>> JVM throws an error named AssertionError <<<. It is
// mainly used for testing
// purposes during development.

// The assert statement is used with a Boolean expression and can be written in
// two different ways.

// 1. First way:
// assert expression;

// 2. Second way:
// assert expression1 : expression2;

// >>>> 1. Enabling Assertions
// java –ea Assertion(File Name)
// java –enableassertions Assertion(File Name)

// >>>> 2. Assertion(File Name)
// java –da Assertion(File Name)
// java –disableassertions Assertion(File Name)

// >>> Assertion Vs Normal Exception Handling <<<
// Assertions are mainly used to check logically impossible situations. For
// example, they can be used to
// check the state a code expects before it starts running or the state after it
// finishes running. Unlike
// normal exception/error handling, assertions are generally disabled at
// run-time.

public class AssertionEx {
    public static void main(String args[]) {
        int age;
        Console con = System.console();
        System.out.print("Enter age :- ");
        age = Integer.parseInt(con.readLine());
        assert age > 0 : "age must be +ve";
        System.out.println("Enter age is " + age);
    }
}