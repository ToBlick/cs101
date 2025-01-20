---
layout: presentation
title: Course overview
permalink: /slides/welcome/
---

class: center, middle
# Welcome

Intro to Computer Science

---

# Agenda

1. [Introductions](#introductions)
2. [What you know you knew](#know-knew)
3. [What you didn't know you knew](#didnt-know-knew)
4. [What you knew you didn't know](#knew-didnt-know)
5. [What you didn't know you didn't know](#didnt-know-didnt-know)
6. [How this course works](#how-course-works)
7. [What to do now](#do-now)
8. [Conclusions](#conclusions)

---

name: introductions

# Introductions

---

template: introductions
name: introductions-1

## This course

Introduction to Computer Science

- Syllabus: [syllabus](../../syllabus)
- Schedule: [schedule](../../schedule)

---

template: introductions-1

Official description:

> How to design algorithms to solve problems and how to translate these algorithms into working computer programs. Experience is acquired through projects in a high-level programming language. Intended primarily for computer science majors but also suitable for students of other scientific disciplines. Programming assignments.

---

template: introductions

## Me

Tobias Blickhan

tobias.blickhan@nyu.edu

Warren Weaver Hall 402 (251 Mercer St, New York)

template: introductions

## You

- Probably an aspiring programmer.
- Perhaps an aspiring computer scientist.
- Hopefully interested in making things and solving problems.
- Willing to spend hours by yourself reading and staring at code.

---

template: introductions

## Computer science

The study of the theory and practice of computation. Very open-ended.

```python
not programming == computer_sciencing
```

```python
computer_sciencing.find(computers) == -1
```

```python
computer_sciencing not in sciences
```

---

name: know-knew

# What you know you knew

---

template: know-knew

## Data types

Programs usually think of data in terms of rigid stereotypes.

- integers
- floating point numbers
- booleans
- strings
- lists
- dictionaries/hash tables/associative arrays
- nonetypes/null/nil

Review [data types](https://github.com/nyu-python-programming/data-types-practice).

---

template: know-knew

## Input and output

There are many ways to input and output data from / to external sources.

```python
response = input("What's your name?")
```

```python
print("Hi '{}'!".format(response.capitalize()))
```

Review [input and output](https://github.com/nyu-python-programming/input-output-expressions).

---

template: know-knew

## Boolean logic and decision-making

Programs can adapt to context.

```python
if this or that and the_other is not also_that:
    thats_wonderful()
```

Review [boolean logic](https://github.com/nyu-python-programming/boolean-expressions) and [decision-making](https://github.com/nyu-python-programming/decision-making-practice).

---

template: know-knew

## Functions

Functions are modular blocks of code usually designed to perform a single task.

```python
def thats_wonderful():
    print("That's wonderful")
```

---

# What you know you knew

## Modules

A module is a simply a reusable library of code.

```python
# import random module
import random

def thats_wonderful():
    # use a function from the random module
    if random.randint(1,10) > 5:
        print("That's wonderful")
    else:
        print("Okay...")
```

Review [modules](https://github.com/nyu-python-programming/modules-virtual-environments-examples).

---

# What you know you knew

## For loop and while loops

You have choices when repeating blocks of code.

```python
for i in range(10):
    print("Welcome!")
```

```python
i = 0
while i < 10:
    print("Welcome!")
    i = i + 1
```

Review [for loops](https://github.com/nyu-python-programming/for-loop-practice) and [while loops](https://github.com/nyu-python-programming/ninety-nine-bottles-of-beer-assignment).

---

# What you know you knew

## Lists

Lists are useful for storing a set of related values.

```python
favorite_foods = [
    "Pizza",
    "Noodles",
    "Vegemite Sandwich"
    ]
```

---

# What you know you knew

## Dictionaries

Dictionaries contain key/value pairs.

```python
phone_numbers: {
    "Alice": "646-888-5623",
    "Bob":      "212-717-3297",
    "Carlos":      "747-211-8451"
}
```

---

# What you know you knew

## Text files

Data can be stored and retrieved from text files.

```python
# open file in read mode
f = open('data.csv', 'r')
```

```python
# print out each line of the file
for line in f:
    data = line.split(",")
```

---

# What you know you knew

## Strings

Languages offer many ways to analyze and manipulate text data.

```python
text = "This,That,The other"
text = text.lower()
pos = text.find(",")
if pos > 0:
    data = text.split(",")
```

---

name: didnt-know-knew

# What you didn't know you knew

---

# What you didn't know you knew

## Variables, literals, expressions, and function calls

There are many ways to express value in programs.

```python
"I am literally a literal"
```

```python
I_am_not
```

```python
math.pow(washington, 2) + park
```

---

# What you didn't know you knew

## Dot notation

Dots indicate belongingness.

```python
random.randint(5, 10)
```

```python
math.pow(2, 2)
```

```python
'help me'.islower()
```

---

# What you didn't know you knew

## Other languages

Try to convince me that you don't understand this code:

```java
int x = 5;
boolean y = true;
if (x < 10 && y == true) {
    System.out.println("Easy peasy!");
}
```

```julia
x = 5
y = true
if x < 10 && y == true
    println("Easy peasy!")
end
```

---

name: knew-didnt-know

# What you knew you didn't know

---

# What you knew you didn't know

A popular way to think about programs with interacting parts.

- Object-oriented programming

```python
alice = new Student("Alice")
```

```python
bob = new Professor("Bob")
```

```python
bob.say_hello(alice)
```

Jump ahead half a semester to [object-oriented programming](../../slides/object-orientation)

---

name: didnt-know-didnt-know

# What you didn't know you didn't know

---

template: didnt-know-didnt-know
name: didnt-know-1

## Basic computer concepts and terminology

Can you answer these questions?

- What is a file? What is a folder?

--

- What are good names for files and folders?

--

- How do you use the command line?

--

- What is a compiler? What is an interpreter? An assembler?

--

- What is an operating system? What is an application?

--

---

# What you didn't know you didn't know

## Alias vs. copy

What is printed?

```python
x = 5
y = x
x = 10
print(y)
```

Try it out!

---

# What you didn't know you didn't know

## Raw strings

How many lines are printed?

```python
x = "First line\nSecond line"
print(x)
```

```python
x = r"First line\nSecond line"
print(x)
```

---

# What you didn't know you didn't know

## Multidimensional arrays

```python
row1 = [1, 2, 3]
row2 = [4, 5, 6]
row3 = [7, 8, 9]
```

```python
data = [row1, row2, row3]
```

```python
print(data[1][2])
```

Jump ahead half a semester to [multi-dimensional arrays](../../slides/arrays-multidimensional).

---

# What you didn't know you didn't know

## Recursion

How many times is the function called?

```python
def foo(x):
  if x < 3:
      foo(x+1)
      foo(x+1)

foo(1)
```

Jump ahead almost a semester to [recursion](../../slides/recursion).

---

# What you didn't know you didn't know

## You can place out of this class

If you are comfortable with multi-dimensional arrays, object-oriented programming, and recursion, consider taking a placement exam to skip this course.

Learn about [placement exams](https://cs.nyu.edu/home/undergrad/placement_sample_exams.html).

---

name: how-course-works

# How this course works

---

template: how-course-works
name: how-course-works-1

## Lecture

I will speak for 75 minutes about twice each week.... that's 150 minutes of talking each week.

--

Please do interrupt me and ask questions. Lectures are more effective when they are not a monologue.

---

template: how-course-works

## Notes

There are notes for most lecture topics by [Amos Bloomberg](https://knowledge.kitchen/). You may find them useful but incomplete.

---

template: how-course-works

## Slides

The slides are available on the [schedule](../../schedule). The slides are more of a table of contents of the lecture and are not meant to replace the textbook, notes, or example code.

---

template: how-course-works

## Reading

There are many resources available in the form of textbooks, blog articles, the [java docs](https://docs.oracle.com/en/java/), video tutorials, ....

See what works best for you.

---

template: how-course-works

## Assignments

You will have somewhere around 8 assignments.

Extensions are available on request.

---

template: how-course-works

## Quizzes

There will be multiple-choice online quizzes. These are meant to help you practice and do not influence your grade.

In-class quizzes are there for you to check your knowledge before the exams. You will have an idea of when they will take place.

---

template: how-course-works

## Exams

You will take 3 exams.

---

template: how-course-works

## Practice

“Tell me and I will forget, show me and I may remember; involve me and I will understand.” - Supposedly Confucius (孔子), but I could not find a reliable citation.

This course is a bit like a mix between a language class and a math class.

A lot of it is "learning by doing". The vast majority of your exam prep should be writing code and working on coding problems. I do not plan to ask you memorization questions. You will be allowed a sheet of notes in exams and quizzes.

Practice problems can be found
- in the [corresponding repo](https://github.com/ToBlick/cs101-examples/tree/main)
- on online programming learning platforms (these are very popular for anyone practicing for interview questions)
- by asking your favorite LLM to generate you some
- by talking to your fellow students

---

template: how-course-works

## Grading

- 15% in-class quizzes
- 15% assignments
- 20% first exam
- 20% second exam
- 30% third exam

---

template: how-course-works

## How tough is this course?

Programming can feel very binary: things work or they do not. This can be both very rewarding and very frustrating.

On a scale from 1 (easy) to 5, the course was rated 3.9 and 4.5 in previous semesters. Note that these are ratings from those students who did not end up dropping the course. Roughly half of the students stated they spend 3 to 5 hours a week on the course, the other half 6 to 8.

The exams are challenging. The idea behind this is that small errors, "typos" and oversights do not drag down your grade much.

---

template: how-course-works

## Communication

Announcements concerning the course will be posted on Brightspace. There is also a discussions forum there. You can always talk to me before or after class. If you want to meet outside of those times, please reach out via email.

---

template: how-course-works

## Tutoring

Tutors are available to answer your questions and help you with anything related to the course.

See them often and early.

The tutoring schedule is released on Brightspace.

---

# What to do now

---

# What to do now

## Check the syllabus

The [syllabus](../../syllabus) contains basic information on how this course works.

---

# What to do now

## Bookmark the schedule

The [schedule](../../) contains a day-by-day breakdown of everything you need to know and do in this course.

---

# What to do now

## Download JDK

The Java Development Kit (JDK) is a necessary set of tools that help develop Java programs. Install the Standard Edition (SE) Version 17. Assignments will be tested against Java 17.

---

# What to do now

## Install a shell

- Windows (WSL):
 - [Install WSL](https://learn.microsoft.com/en-us/windows/wsl/install)
 - If using VSCode: [Set VSCode to use WSL Bash](https://devblogs.microsoft.com/commandline/tips-and-tricks-for-linux-development-with-wsl-and-visual-studio-code/#setting-the-default-shell)
- alternatively: Windows (Git)
 - [Install Git for Windows](https://gitforwindows.org/).
 - To set Git Bash up in VSCode [the second answer here](https://stackoverflow.com/questions/42606837/how-do-i-use-bash-on-windows-from-the-visual-studio-code-integrated-terminal) by **Mahade Walid** and edited by **FruityOatyBar** (ignore the first answer, which is outdated).
- Linux and Mac users already have a UNIX command shell in the form of the terminal.

---

name: conclusions

# Conclusions

--

- Welcome!
