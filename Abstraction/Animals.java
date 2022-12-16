package AnimalsPackage;

abstract public class Animals {

    abstract public void sounds();

    abstract public void move();
}

// Abstract classes and Abstract methods :
// 1 .An abstract class is a class that is declared with an abstract keyword.

// 2. An abstract method is a method that is declared without implementation.

// 3. An abstract class may or may not have all abstract methods. Some of them
// can be concrete methods

// 4. A method-defined abstract must always be redefined in the subclass, thus
// making overriding compulsory or making the subclass itself abstract.

// 5. Any class that contains one or more abstract methods must also be declared
// with an abstract keyword.

// 6. There can be no object of an abstract class. That is, an abstract class
// can not be directly instantiated with the new operator.

// 7. An abstract class can have parameterized constructors and the default
// constructor is always present in an abstract class.