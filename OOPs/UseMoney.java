import pakageDemo.Money;
import pakageDemo.proj.src.MoneyTwo;;

public class UseMoney {

    public static void main(String[] args) {

        Money m1 = new Money();
        MoneyTwo m2 = new MoneyTwo();

        // without using import pakageDemo.Money;

        // pakageDemo.Money m1=new pakageDemo.Money();
    }
}

/*
 * Packages In Java
 * Package in Java is a mechanism to encapsulate a group of classes, sub
 * packages and interfaces
 * 
 * 
 * // All the classes and interfaces of this package
 * // will be accessible but not subpackages.
 * import package.*;
 * 
 * Important points:
 * 
 * 1. Every class is part of some package.
 * 2. If no package is specified, the classes in the file goes into a special
 * unnamed package (the same unnamed package for all files).
 * 3. All classes/interfaces in a file are part of the same package. Multiple
 * files can specify the same package name.
 * 4. If package name is specified, the file must be in a subdirectory called
 * name (i.e., the directory name must match the package name).
 * 5. We can access public classes in another (named) package using:
 * package-name.class-name
 */
