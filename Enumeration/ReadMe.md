```
Points to remember for Java Enum
    1.Enum improves type safety

    2.Enum can be easily used in switch

    3.Enum can be traversed

    4.Enum can have fields, constructors and methods

    5.Enum may implement many interfaces but cannot extend any class because it internally extends Enum class

    6. Constructor of enum type is private. If you don't declare private compiler internally creates private constructor. so we can't create the instance of Enum by new keyword

    7.we can  have an abstract method in the Enum ,we can have abstract methods and can provide the implementation of these methods.
```

```
1.values() = The Java compiler internally adds the values() method when it creates an enum. The values() method returns an array containing all the values of the enum.

2.valueOf() = The Java compiler internally adds the valueOf() method when it creates an enum. The valueOf() method returns the value of given constant enum.

3.ordinal() = The Java compiler internally adds the ordinal() method when it creates an enum. The ordinal() method returns the index of the enum value.

4.range() =

```

```
Difference between Enums and Classes

    An enum can, just like a class, have attributes and methods. The only difference is that enum constants     are public, static and final (unchangeable - cannot be overridden).

    An enum cannot be used to create objects, and it cannot extend other classes (but it can implement  interfaces).

Why And When To Use Enums?

    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
```
