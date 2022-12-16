---
# Topices
- Idantefiere / Variables
- Literals
- DataTypes
- Type Conversion
- Operators
- Relational Operators
- Bitwise Operators
- Logical Operators
- Ternary Operators
- Switch Statement
- If Else Statement
- Loopes
- Array
- Console Input Output
- Exceptions Handling
- String and StringBuffer
- Methods(instance and static)
- varargs/ ... / variable length Argument 
- "this" Variable
- this() methode
- Initialization Block (instance and static)
- Constuctors
- Access Attributes
- Pakages
- Import Static 
- Inheritance
- Methods Overloding and Methods Overriding
- Super() Methode
- Polymorphism
- Abstraction
---

# Types of Variables in Java

## 1. Local Variables

## 2. Instance Variables

## 3. Static Variables

### 1. Local Variables

     > These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
     > The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
     > Initialization of the local variable is mandatory before using it in the defined scope.

### 2. Instance Variables

    -  As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
    - Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
    - Initialization of an instance variable is not mandatory. Its default value is 0.
    - Instance variables can be accessed only by creating objects.

### 3. Static Variables

    - These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
    - Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
    - Static variables are created at the start of program execution and destroyed automatically when execution ends.
    - Initialization of a static variable is not mandatory. Its default value is 0.
    - If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically
    - If we access a static variable without the class name, the compiler will automatically append the class name.

---
