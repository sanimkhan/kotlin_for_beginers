# Kotlin for beginners

### Tutorial 1- Hello world  
### Tutorial 2- Data types
- Variable  
    - Variable can be declared with/without data types  
`var boolean: Boolean = true`  
`var boolean = true`
    - Variable can be declared with `var` or `val`  
  Read only variables are declared with `val`
- Collection
    - 2 types: immutable, mutable
    - Collection creatioon: `listOf(1, 2, 3, 4, 5, 6, 7, 8)`
- Range
    - Ex: `if (i in 1..10)`
    - `if (i in 1..10)` is equivalent of `1 < = i && i < = 10`

### Tutorial 3- Control flow
- If else
- When
    - Ex: `when (x) { 1 -> print("x is 1") }` 
    - Its similar to switch
    - when is equivalent to multiple if block
- For loop
    - Pattern 1 `for (i in items) {`
    - Pattern 2 `for ((index, value) in items.withIndex()) {`
 - Break and Continue
    - Can be done with label
    - Ex:   
            `myLabel@ for (x in 1..10) {`  
                `break@myLabel`  
                `continue@myLabel`   
            `}`

### Tutorial 4- Class and Object
- Class and object
    - New object can be created like `newClass()`
- Nested class
    - Nested class is always static.
    - Methods can be called like this- `Outer.Nested().foo()`
    - Nested class can not access its outer class members.
- Inner class
    - Methods can be called like this- `Outer().Inner().foo()`
    - Inner class can access its outer class members.
- ~~Anonymous Inner class~~
    - The concept of creating an object of interface using runtime object reference is known as anonymous class.
    - Can create object of an interface.
- ~~Type Aliases~~

### Tutorial 5- Constructor
- Type: 
    - Primary
        - 1 primary constructor per class
    - Secondary
        - 1 or more secondary constructor per class
        - Secondary constructor must call primary constructor, if there is any.  
          Ex: `constructor(name: String) : this(name, age) { return true }`  
          Here `this(name, age)` is Primary constructor call. 
    
### Tutorial 6- Inheritance
- Everything in Kotlin is by default final.
- We need to use the keyword “open” in front of the class declaration to make it allowable to inherit.
- When overriding a method, kotlin use keyword "override" before the method name. 
- Cde Ex: `class BCD : ABC() { return }`  

### Tutorial 7- Interface
- Kotlin doesn’t support multiple inheritances,.
- But implementation of multiple interface is allowed.
- Single interface Ex: `class Interface.InterfaceImp : InterfaceA {}`
- Multiple interface Ex: `class Interface.InterfaceImp : InterfaceA, InterfaceB {}`

### Tutorial 8- Access Modifier
- Private
    - Class, Method, Package can be declared Private
    - Private members are accessible only within immediate scope.
- Protected
    - Class, Method ~~, Package~~ can be declared Protected
    - Protected members are accessible by its subclass only.
- Internal
    - Internal class interface is visible only by other class present inside the same package or the module.
- Public
    - Accessible from anywhere.
    - If no access modifier is declared, then default is public.
     