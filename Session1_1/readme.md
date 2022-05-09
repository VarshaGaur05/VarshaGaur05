1. File Extension -> .java
2. Compilation & Execution:
    a. Source code gets converted to bytecode. Bytecode file -> <name>.class. Bytecode is platform independent. Any device capable of running java can run the bytecode file. 
    b. When we run the program, bytecode is executed on JVM (Java Virtual Machine)
3. In java entire code goes into a class
4. Main method is the entry point for execution. Whatever is written in the main method gets executed. JVM scans the class you want to execute for the main method. At least one class in your project shall have main method. 
5. Two kinds of variables in java -> Primitive and object reference variable. 
6. Primitive: 
    a. boolean 
    b. char - 16 bits
    Integers
    c. byte - 8 bits - |0 0 0 0 0 0 0 0|
        |0 0 0 0(*2^4) + 1(*2^3) + 0(*2^2) + 0(*2^1) + 0(*2^0)| = 8
        |0 1 1 1 1 1 1 1| = 1+2+4+8+16+32+64 = 127
    d. short - 16 bits -> 32767
    e. int - 32 bits -> 2147483648
    f. long - 64 bits -> huge
    Floating point
    g. float - 32 bits
    h. double - 64 bits
7. local and instance variables
8. First letter of variable name shall start from an alphabet or an underscore or a dollar sign. It cant start from a number. After the first letter, numbers can be included in variable name. Reserved keywords in java like "public" static" "void" and more cant be used for variable naming. 
9. Compiler wont let you assign a bigger variable type to a smaller one, even though smaller variable can hold the value. 
7. Functions are used to make our code modular and non redundant. Functions can take parameters as input. Any type of parameters. Functions can return values. Every method is defined with a return type. If a method is not returning anything its return type is void. If your method is supposed to return a value, it must return that. A method can only return one value. You can return anything which can be implicitly converted to the actual return type of the method. In java its not necessary that you have to assign or use the returned value. 
10. Pass by reference: 
    x -->    [9]  <-- y

    pass by copy:
    x -->  [7]
    y -->  [9]
11. Java is pass by copy
12. Memory for function execution and local variables of a function is being allocated on stack. 
13. Class is a blueprint consisting of various properties (instance variables) which certain "alike things" can have and actions (methods) those "alike things" can do. 
14. Objects are enities holding actual data on the lines of the structure defined in the class to which they belong.  
15. Animal firstAnimal = new Animal() /// An object reference variable "first Animal" is created. An actual object is created. The reference variable "firstAnimal" starts pointing to the object being created. ////  firstAnimal      ---->>>>               [height:7 ; weight:20 ]
16. Objects are always assigned memory on the heap.
17. Object refernce variables, if local to a function main like "firstAnimal" is, are assigned memory on the stack.
18. When an object becomes unreachable (no reference variable is pointing to it), its liable for garbage collection. GC service frees up the obect and deallocate the memory given to that object.
19. Encapsulation - hide inner workings of the class. 
20. An example of encapsulation - dont expose instance variables directly. mark them private. Make getters and setters for instance variables and make them public. We can have all sorts of restrictions within these getters and setters which dont allow unacceptable values to be set for instance variables. 
21. Subclass extends superclass. Subclass inherits the members (instance variables and methods) of superclass. Subclass can add new methods & instance variables of its own. A subclass inherits all public instance variables and methods & does not inherit private ones.  
22. For method overriding:
     a. both functions shall have same list of parameters. 
     b. Return type must be compatible. 
     c. If a method is public in superclass and we try to override it in the subclass. Then the method in the subclass shall also be public. Access level must be the same or friendlier. 
23. An object reference variable of superclass can point to object of subclass.
24. A reference variable of super class, even though its pointing to an object of its subclass wont be able to access the methods defined in the subclass. You can only call a method on an object reference variable if that method is defined in the class of that object reference variable.
25. Abstract class - In a lot of cases it does not make sense to instantiate a class. In that case we define a class as abstract. We cant make objects of an abstract class. An abstract class is there in the project only to be inherited. But we can make object reference variables of an abstract class. 
26. Abstract method: A method marked as abstract does not have any body of its own. It ends with a semicolon. An abstract method should be overridden by the first concrete class in the inheritance tree. If a class has abstract methods, than that class shall also be marked as abstract. However, abstract class can have a mix of abstract as well as non-abstract methods.
27. Interfaces: Multiple inheritance is not allowed in Java. We have the concept of interfaces, where a subclass can only extend (or inherit) one superclass but can implement multiple interfaces. When implementing an interface all the methods of the interface are available to the implmenting subclass as well. All the methods in the interface are public and abstract by default. So the concrete subclass implementing the interface shall override the abstract methods defined in the interface as well. 
28. Constructors: When we create an object of a class by saying new ClassName() we call the constructor function on that class. Constructor is a special method of the class which has the same name as that of the class. A constructor does not have any return type. If we dont create a constructor of our own for a class, compiler does it for us and create a public constructor for us. The most common use of constructors is to initialise the instance variables of the class. So to do that, we can have our own constructors which takes parameters. We can create multiple constructors for the same class.
29. Constructors in inheritance: Whenever we call constructor of a subclass, the constructor of the superclass gets called too. All the constructors in an object’s inheritance tree must run when you make a new object. To invoke a superclass constructor, you just say super() and that shall be the first line of the code in subclass constructor because a child cant exist before a parent. If you don’t put that line, compiler will put that for you. If superclass constructor takes an argument than subclass constructor should take too and pass on the relevant args while invoking super(). 
