# Kotlin for beginners

#### Tutorial 1- Hello world  
#### Tutorial 2- Data types
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

#### Tutorial 3- Control flow
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

#### Tutorial 4- Class and Object
- Class and object
    - New object can be created like `newClass()`
- Nested class
    - Nested class is always static.
    - Can be called like this- `Outer.Nested().foo()`