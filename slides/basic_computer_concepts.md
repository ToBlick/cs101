---
layout: presentation
title: Basic Computer Concepts
permalink: /slides/basic_computer_concepts/
---

## Memory

Data is stored in a complex sequence of switches called _bits_

--

Computers work 8 bits at a time called a _byte_
- In many languages a "character" is 1 byte. For example, in UTF-8, 'A' = 65

--

It's the easiest place to store data in programs
- Variables and "state" are typically stored in memory
- CPUs have faster memory in "cache" (~10-100x)
- Drives can store much more, but are much slower (~10-100x)

Cache < Memory < Disk

---
## System-on-Chip

Nowadays, different components are integrated into a single chip (example: Apple M1)
<img src="https://cdn.arstechnica.net/wp-content/uploads/2020/11/Mac-M1-diagram.png"/>
<a href="https://arstechnica.com/gadgets/2020/11/apple-dishes-details-on-its-new-m1-chip/">ars technica</a>

---
## System-on-Chip

Nowadays, different components are integrated into a single chip (example: Apple M1)
<img src="https://docs.nvidia.com/dgx/dgxh100-user-guide/_images/dgx-h100-system-topology.png"/>
<a href="https://docs.nvidia.com/dgx/dgxh100-user-guide/introduction-to-dgxh100.html">NVIDIA DGX H100/H200 user guide</a>


---
## Larger architectures

<img src="../files/greene.png"/>
<a href="https://sites.google.com/nyu.edu/nyu-hpc/hpc-systems/greene/hardware-specs">NYU High Performance Computing</a>

---

name: operating_systems

## Operating systems

Sits between hardware and users
- Handles data input / output
- Schedules which software has access to different resources and when

---

## Operating systems

![](https://raw.githubusercontent.com/EG-tech/digipres-posters/master/OS_kernel_timeline.jpg)

---

## Text files

Lines of human-readable characters, potentially separated into lines. No colors, no formatting (italics/bold/etc), no images/media.

Writing software (source code) almost always involve manipulating text files.

<a href="https://github.com/petsc/petsc/tree/main"><img src="../files/gmres.png" width="66%" \></a>

---
## Creating and editing text files

Multi-platform
- Visual Studio Code
- [Vi](https://ex-vi.sourceforge.net/) ( [VIM](www.vim.org) , [NeoVim](neovim.io))
- [Emacs](gnu.org/software/emacs) 
- [Sublime Text](sublimetext.com)
- [QtCreator](www.qt.io/product/development-tools)

Windows
- [Visual Studio](https://visualstudio.microsoft.com/)
- [Notepad++](https://notepad-plus-plus.org/)

OSX
- [XCode](developer.apple.com/xcode)
- [TextMate](macromates.com)

More language-specific
- [JetBrains](jetbrains.com) products (IntelliJ IDEA, PyCharm, CLion, etc...)
- [Eclipse](eclipse.org)


---

## Representing numbers

If our memory can store 0s and 1s (think: on/off or up/down), then we can represent an integer in binary:

$$719 = 1011001111 = 2^9 + 2^7 + 2^6 + 2^3 + 2^2 + 2^1 + 2^0$$

10 bits. This number can already not be represented in 8 bits: 0, 1, ..., 255. 

If you want to represent negative numbers, one bit has to hold the sign, so you are left with -128,-127,...,126,127.


---

## Representing numbers

Adding numbers in binary is simple: just carry the ones.

$$ 719 = 1011001111 = 2^9 + 2^7 + 2^6 + 2^3 + 2^2 + 2^1 + 2^0 $$

$$ 720 = 1011010000 = 2^9 + 2^7 + 2^6 + 2^4 $$

If all bits are 1s, then you loop around to 000...001 or something of the sort, which is either a very small or a negative number!

[Wikipedia](https://en.wikipedia.org/wiki/Integer_overflow) has some examples of integer overflow bugs - from aviation to game consoles.

---

## Representing numbers

This system obviously has its flaws. We need 80 bits to represent the Avogadro constant 6.02214076e23 (one holds the sign).

Let's go back to [Float32 (IEEE 754 standard)](https://en.wikipedia.org/wiki/Single-precision_floating-point_format):

<img src="../files/float32.png" width="60%"\>

$$(-1)^{\mathrm{sign}} \times 2^{\mathrm{exponent}} \times 1.{\mathrm{fraction}} $$

Not all bits are treated equally now: One holds the sign, 8 hold the exponent, and 23 hold the fraction, i.e. the digits after the 1. 

They can represent \\(\ \{-1,+1\},\{-126,...,127\}, \{1,1+2^{-23},...,2-2^{-23}\} \\). Exponents with all ones and all zeros are reserved (Inf, NaN, 0).

The smallest representable number is now \\(\ 2^{−126} × 2^{−23} \approx 1.4 \times 10^{-45} \\).

The smallest number larger than one is \\(\ 1 + 2^{−23} \approx 1 + 1.2 \times 10^{-7}\\).

Most calculations are done in double or Float64 format.

---

## How does a computer actually compute?

At the lowest level: how do we add two bits? Input: two bits. Output: 

$$ \{0,0\} \mapsto \{ 0, \text{carry } 0\}. $$
$$ \{0,1\} \mapsto \{ 1, \text{carry } 0\}. $$
$$ \{1,0\} \mapsto \{ 1, \text{carry } 0\}. $$
$$ \{1,1\} \mapsto \{ 0, \text{carry } 1\}. $$

Call the two inputs A, B and the output S, C. You can translate this to:

S = "A or (exclusive!) B". C = "A and B".

If you can build a circuit (or a mechanical system!) that implements "exclusive or" as well as "and", you can add two bits! You can then chain these elements together to add more bits (have to consider carried bits as input now!).

---

## Transistors and Gates

[A NAND gate](../files/nand.jpg) (from Wikipedia).

Outout is "on" if and only if A and B are not both "on".

Basic logic gates: NOT, AND, OR, XOR, NAND, NOR, NXOR.

"XOR" refers to exclusive or: A OR B, but not both. 
---

## Transistors and Gates

[A half adder made from NAND gates](../files/half_adder.jpg) and [one made with an XOR and AND gate](../files/half_adder_xor.png) (also from Wikipedia)

$$ \{0,0\} \mapsto \{ 0, \text{carry } 0\}. $$
$$ \{0,1\} \mapsto \{ 1, \text{carry } 0\}. $$
$$ \{1,0\} \mapsto \{ 1, \text{carry } 0\}. $$
$$ \{1,1\} \mapsto \{ 0, \text{carry } 1\}. $$

S = "A or (exclusive!) B". C = "A and B".

---

## Conclusion

An idea for how components of a computer operate.

A little excursion into number representation.

A little excursion into how to build a bit adder.
