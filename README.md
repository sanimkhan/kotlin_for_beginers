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
        - `init{}` block gets caled as soon as object created from class.
    
### Tutorial 6- Inheritance
- Everything in Kotlin is by default final.
- We need to use the keyword “open” in front of the class declaration to make it allowable to inherit.
- When overriding a method, kotlin use keyword "override" before the method name. 
- Cde Ex: `class BCD : ABC() { return }`  

### Tutorial 7- Interface
- Kotlin doesn’t support multiple inheritances,.
- But implementation of multiple interface is allowed.
- Single interface Ex: `class interface.InterfaceImp : InterfaceA {}`
- Multiple interface Ex: `class interface.InterfaceImp : InterfaceA, InterfaceB {}`

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

### Tutorial 9- Extension
- Function extension
    - Kotlin allows to define a method outside of the dataClass.main class.
    - Ex: 
        - assume there is a class `Student`. 
        - Student has methods `getTeacher()`, `getSubject()`.
        - Student might need a method `getTuition()`.
        - getTuition() can be declared outside of `Student` class.
        - Ex: `fun Student.getTuition(a: Student): String {  return }`
- Object extension
    - Its like `static` in Java
    - Basically its extending the object of the same class to use some of the member functions.
    
### Tutorial 10- Data Class
- Like Pojo in Java.
- If a class is marked as Data class, it can can use some of the inbuilt function of that data class such as `toString()`,`hashCode()`.

### Tutorial 11- Sealed class
- A sealed class as name suggests only take the values from a limited set of values.
- `when` requires `else` block.

### Tutorial 12- Generics
- Basic generic
    - Ex: `class Cage<T>(var animal: T) {}`
- Generic with defined class hierarchy
    - Ex: `class Cage<T : Animal>(var animal: T) {}`
- Variance: `cageDog<Dog>` is not equal to `cageDog<Cat>`
- Declaration-site Variance
    - Covariance
        - When we want to assign the generic type to any of its super type
        - Ex: `class covariantExample<out T>(input:T) { return }` 
    - Contravariance
            - When we want to assign the generic type to any of its sub type
            - Ex: `class contraVariantExample<in T>(input:T) { return }`

### Tutorial 13- Functions
- Function
    - Ex: `fun MyFunction(x: String): String { return }`
- Lambda
    - Ex: `val mylambda :(String)->Unit  = {s:String->print(s)}`
- Inline: Passing lambda function to another function
    - Ex: `fun myFun(a :String, action: (String)->Unit) { return }`

### Tutorial 14- Destructuring declarations
- Calling multiple variable at once is called **Destructuring declarations**
- Ex: `val (name, age) = person`

### Tutorial 15- Exception handling

