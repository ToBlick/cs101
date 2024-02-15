---
layout: presentation
title: Methods
permalink: /slides/methods/
---

class: center, middle

# Methods

> "Take a method and try it. If it fails, admit it frankly, and try another. But by all means, try something."
>
> -[Franklin D. Roosevelt](https://en.wikipedia.org/wiki/Franklin_D._Roosevelt)

---

# Agenda

1. [Overview](#concept)
1. [Simple Methods](#simple)
1. [Parameters & Arguments](#parameters)
1. [Return Values](#return)
1. [Overloading](#overloading)
1. [Conclusions](#conclusions)

---

name: overview

# Overview

--

## Concept

Methods are modular reusable blocks of code.

--

- The control flow of a program can easily switch to code within a method from anywhere else in the code.

--

- Switching to code within a method is termed 'calling' or 'invoking' that method.

--

- Calling a method is a form of unconditional branching - disrupting the 'usual' flow of a program.

--

- Once the control flow reaches the end of an invoked method, the control flow returns to the line of code from which it originally branched.

---

## Why methods?

--

- methods allow us to split a large program into manageable (read: small) sub-problems - "divide and conquer".

--

- modular code is easier to read.

--

- modular code is re-usable code.

--

- modular code is easier to write and debug.

---

## Method abstraction

--

- A user (e.g. you) can use a method without knowing its implementation. The only thing the user needs to know is the methods signature (how to call it) and return type.

--

- If the implementation changes "behind the scenes", the user does not need to modify their code that builds on the method (as long as the signature did not change).

---

name: simple

# Simple Methods

--

## Super simple

At their simplest, methods can have no parameters and no return value.

For example, a method named 'doSomething1':

```java
public static void doSomething1() {
    System.out.println("Running  doSomething1");
    // imagine some useful stuff happens in the middle here
    System.out.println("Exiting  doSomething1");
}
```

---

## Defining methods

Methods are comprised of a header and a body. Syntax:

```java
modifiers returnType methodName(parameters) {
    [...] // stuff happens here
    return result;
}
```

The `returnType` can be any data type or `void` (i.e. the method does not return a value).


---

template: simple
name: simple-2

## Methods calling methods

Of course, methods can call other methods, as our `doSomething1` already displayed - it called the `System.out.println` method several times.

Note the order in which the print statements are executed.

```java
public static void doSomething1() {
    System.out.println("Begin doSomething1");
    // imagine some useful stuff happens in the middle here
    System.out.println("End doSomething1");
}

public static void doSomething2() {
    System.out.println("Begin doSommething2");
    doSomething1(); // call the method
    System.out.println("End doSomething2");
}
```

---

template: simple
name: simple-3

## Call stack

The order is determined by the control flow of the program.

--

- Each method invocation creates a new 'stack frame' - an area of memory dedicated to the newly invoked method.

--

- The Java interpreter is only ever looking at the method invocation at the top of the stack - the most recently invoked method.

--

- Each stack frame has its own variable namespace, so you can have two variables named `x` in two different method invocations, and they will be different variables in two different areas of memory with potentially different values.

--

- Once a method that has been invoked completes, its stack frame is popped (deleted) from the call stack and its memory is wiped clean.

---

name: parameters

# Parameters

--

## Concept

Methods can accept 'arguments' - values sent into the method.

--

- These arguments are stored in 'parameters' - local variables within the namespace of the method invocation's stack frame.

--

- Once the method invocation completes, any local variables, including parameters, are wiped out of memory.

--

```java
public static void doSomething1(int x) {
    x++; // increment x
    System.out.println("Begin doSomething1, x=" + x);
    System.out.println("End doSomething1, x=" + x);
}
```

---

## Arguments

Arguments are passed by value. Their value gets copied to variables that are specific to that method.

--

```java
public static void addOne(int x) {
    x++; // increment x
}
public static void main(String[] args) {
    int i = 1;
    addOne(i);
    System.out.println("i is " + i); // i is 1
}
```

---

## Arguments

--

This naming can be confusing, since the value of an array variable is (essentially) its address in memory:

```java
    public static void addOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        printarray(array);   // prints 123
        addOne(array);
        printarray(array);  // prints 234
    }
```

We will discuss this further in the coming weeks.

---

name: return

# Return values

--

## Concept

Methods can return a single value in Java.

--

- The method signature line must state the data type of the returned value

--

- This value is returned to the part of the code from which the method was originally invoked.

--

- Think of it as if the method invocation is replaced by that method's return value.

--

```java
public static int doSomething1(int x) {
    x++; // increment x
    System.out.println("Begin doSomething1, x=" + x);
    System.out.println("End doSomething1, x=" + x);
    return x;
}
```

---

name: overloading

# Overloading

--

## Concept

Java allows multiple methods with the same name but different parameter sets. These are called overloaded methods.

--

- Which version of the method is invoked depends upon the arguments in the method call.

--

```java
public static void foo() {
    ...
}

public static void foo(String bar) {
    ...
}

public static void foo(String bar, boolean baz) {
    ...
}
```

---

# Documentation

--

Javadoc allows us to write documentation so users understand what our methods do. Take the following example:

```java

/**
 * Computing the square root with Heron's method.
 * @param x a strictly positive number.
 * @return the square root of x.
 */
public double myRoot(double x) {
	if (x == 0.0) {
        return x;
    } else if (x < 0.0) {
		System.out.println("Error: Negative number entered.");
		return 0.0; 
        // this is not ideal but we will discuss exception handling later
	}
	int max_it = 10;
	double s = 0.5 * x;
	for (int i = 1; i <= max_it; i++) {
		s = 0.5 * (s + x/s);
	}
    return s;
}

```

---

<img src="../files/javadocs.png"/>

---

name: conclusions

# Conclusions

--

You now have a basic understanding of methods in Java.

--
