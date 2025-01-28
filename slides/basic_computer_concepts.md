---
layout: presentation
title: Basic Computer Concepts
permalink: /slides/basic_computer_concepts/
---

class: center, middle

# Basic computer concepts

---

# Agenda

1. [Computers](#computers)
  - [Hardware](#hardware)
  - [Operating Systems](#operating_systems)
  - [Applications](#applications)
1. [Desktop Analogy](#desktop_analogy)
  - Files and good practices
1. [Networks](#networks)
1. [Numbers](#numbers)
1. [Conclusions](#conclusion)

<!-- Here is a quick outline of a minimal set of concepts which you must
familiarize yourself with immediately in order to be ready to learn to
be literate in usage of computers in general, not just for any given
course. -->


---


## Computers

Several levels:
- Computer hardware
- Operating system
- Applications

---

name: hardware
## Computer Hardware

CPU

Storage
- Memory
- Drives

Input
- Mouse
- Keyboard
- Camera
- Microphone

Output
- Video
- Speakers/Headphones

I/O
- Network


---

<!-- ## Busses


Motherboard connect all of the components together via busses
- Playstation 5 traces are quite nicely visible (from [here](https://twitter.com/austinnotduncan/status/1578764005350338560/photo/1))
  - Most traces move between components and CPU
  - Both sides visible [here](https://youtu.be/CaAY-jAjm0w?t=295)
  - Interesting to look at [this teardown](https://www.ifixit.com/Teardown/PlayStation+5+Teardown/138280)

<img src="https://pbs.twimg.com/media/FejleAtXkAEEiDz?format=jpg&name=4096x4096" width=500 />

--- -->


## CPU
<!-- Manages much of the data from busses -->
- Controls memory
- Can read and execute commands
- Modern processors schedule commands between multiple cores

<img src="https://pbs.twimg.com/media/FCvOcnYXIAInJhh?format=jpg&name=4096x4096" width=800/>

---

## Memory

Data is stored in a complex sequence of switches called _bits_

--

Computers work 8 bits at a time called a _byte_
- In many languages a "character" is 1 byte

--

It's the easiest place to store data in programs
- Variables and "state" are typically stored in memory
- CPUs have faster memory in "cache" (10x)
- Drives can store much more, but are much slower (~1000x)

Cache < Memory < Disk

(numbers according to [Chandler Carruth in 2014](https://www.youtube.com/watch?v=fHNmRkzxHWs&t=2201))

<!-- ---
## System-on-Chip

Some computers combine parts together
- Makes bus traces shorter
<p><a href="https://commons.wikimedia.org/wiki/File:Apple_M1.jpg#/media/File:Apple_M1.jpg"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Apple_M1.jpg/1200px-Apple_M1.jpg" width="300" alt="Illustration of an M1 processor"></a><br>By &lt;a href="//commons.wikimedia.org/wiki/User:Henriok" title="User:Henriok"&gt;Henriok&lt;/a&gt; - &lt;span class="int-own-work" lang="en"&gt;Own work&lt;/span&gt;, <a href="http://creativecommons.org/publicdomain/zero/1.0/deed.en" title="Creative Commons Zero, Public Domain Dedication">CC0</a>, <a href="https://commons.wikimedia.org/w/index.php?curid=96026688">Link</a></p> -->

---
## System-on-Chip

Some computers combine parts together
<img src="https://cdn.arstechnica.net/wp-content/uploads/2020/11/Mac-M1-diagram.png"/>
<a href="https://arstechnica.com/gadgets/2020/11/apple-dishes-details-on-its-new-m1-chip/">ars technica</a>

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
<!-- 
Most provide more or less the same "basic" functionality but can have different
- code
- ethical principles
- communities -->

---

## Operating systems

![](https://raw.githubusercontent.com/EG-tech/digipres-posters/master/OS_kernel_timeline.jpg)

---
<!-- 
## Applications

Process data
- Multimedia
  - Input: file on disk/URL
  - Output: display on screen or play through speakers
- Games
  - Input: keyboard/mouse inputs
  - Output: display content to screen and audio through speakers
- File decompression
  - Input: file on disk
  - Output: one or multiple files/directories on disk
- Documents
  - Input: file on disk + keyboard/mouse inputs
  - Output: updated document


---

## Python example

read from keyboard input
```python
input_file = input("What file should I open?")
```
request a representation for a file on the drive
```python
with open(input_file,"r") as in_fd:
```
transfer data from disk to memory
```python
    lines = in_fd.readlines()
```
modify the data in memory
```python
    for line in lines:
        line = line.lower()
```
output the data in memory to the screen
```python
        print(line)
```


--- -->

name: desktop_analogy

## Desktop Metaphor
- How do computers store data?
 - All 0's and 1's, but we organize them using software so other software can derive meaning
 - We already had systems for organizing data at our desks, so we modeled off of them

<a href="https://www.youtube.com/watch?v=1UtlOgkOGy4"><img src="../files/apple_desktop_2.png" width="45%"/></a>
<a href="http://toastytech.com/guis/a2desk.html"><img src="../files/apple_desktop.png" width="45%"\></a>
  
.right[images are links to sources]


---

name: files_and_folders
## Files and folders

- Paper analogy
  - Files:

<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-address-book.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-calendar.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-contact.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-document.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-drawing.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-presentation.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-spreadsheet.svg" \>

  - Folders / Directories:

<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/places/96/folder-blue.svg" width="10%"\>
<img src="https://wiki.gnome.org/Apps/Files/Header?action=AttachFile&do=get&target=logo.png" width="10%"\>

.right[Icons from [KDE Breeze icon set](https://github.com/KDE/breeze-icons) and cabinet from [Gnome Nautilus](https://wiki.gnome.org/action/show/Apps/Files?action=show&redirect=Apps%2FNautilus)]

<!-- ???

With the desktop analogy we have the paper analogy.
Traditionally we would store data on paper, and use folders and filing cabinets to store that data.
Directories were tools to help us look up files and folders.

Data on computers is stored in files, and files are organized together into folders and directories to organize the data.
You'd be surprised howe much of computer science comes down to how to organize data, and that's what CS102 is all about. -->


---


## Types of files

We might think of there as being many types of files, associated with differenet applications

<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-address-book.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-calendar.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-contact.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-document.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-drawing.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-presentation.svg" \>
<img src="https://raw.githubusercontent.com/KDE/breeze-icons/master/icons/mimetypes/64/x-office-spreadsheet.svg" \>

Underneath, there are two fundamental kinds of files:
- Text files
- Binary files.

--

Text files still use binary.

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

## Encoding Text Files

- Text is "just" binary data
  - How do computers know what it means?
- Text files follow an encoding for what each character means
- Commonly:
  - ASCII ('A' = 65 = 1000001, 'B' = 66 = 1000010)
  - UTF-8 (Unicode Transformation Format – 8-bit) (some programming languages allow you to use Unicode characters as variables)
- Other encodings
  - [link](https://en.wikipedia.org/wiki/Character_encoding#Common_character_encodings)
- Different computers define new lines differently
  - [link](https://en.wikipedia.org/wiki/Newline#Representation)

---

## Examples of Text Files

Source Code
```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
json
```json
{
    "class": "CSCI-UA-0101-003",
    "professor": "Tobias Blickhan",
    "building": "WWH",
    "room": 402
}
```
---

## Binary files
- There are many other ways to store data

 - Numbers (from wiki on float32)
<img src="../files/float32.png" width="60%"\>

 - Colors (from wiki on bitmap encoding)
<img src="https://upload.wikimedia.org/wikipedia/commons/4/48/BitfieldsSLN.svg" width="60%"\>
- Specialized software might choose their own custom data to a file.
  - Saves space
  - Faster/easier for computers to read
  - Makes it difficult to open files without the right software
- Examples:
  - Multimedia (.png/.jpg/.tif/.mp4) (not .svg!)
  - Programs (.exe)
  - Microsoft Office files (.docx/.xlsx/.pptx)

---

## Surprising Example of a Text File

```xml
<svg
   version="1.1"><metadata
     ...></metadata><defs
     id="defs6"><clipPath
       id="clipPath20"
       clipPathUnits="userSpaceOnUse"><path
         id="path18"
         d="M 0,270 V 0 h 792.809 v 270 z" /></clipPath></defs><g
     transform="matrix(1.3333333,0,0,-1.3333333,0,36)"
     id="g10"><g
       transform="scale(0.1)"
       id="g12"><g
         id="g14"><g
           clip-path="url(#clipPath20)"
           id="g16"><path
             id="path22"
             style="fill:#4f2987;fill-opacity:1;fill-rule:nonzero;stroke:none"
             d="m 340.016,212.883 h 31.121 l 71.836,-94.438 v 94.438 h 33.3 V 59.5117 H 447.582 L 373.305,157.012 V 59.5117 H 340.016 V 212.883" /><path
             id="path24"
             style="fill:#4f2987;fill-opacity:1;fill-rule:nonzero;stroke:none"
             d="m 552.055,119.988 -58.926,92.895 h 39.445 l 36.59,-61.574 37.238,61.574 h 38.321 L 585.805,120.637 V 59.5117 h -33.75 v 60.4763" /><path
             id="path26"
             style="fill:#4f2987;fill-opacity:1;fill-rule:nonzero;stroke:none"
             d="m 659.184,125.242 v 87.641 h 33.75 v -86.77 c 0,-24.968 12.453,-37.8982 33.066,-37.8982 20.578,0 33.086,12.5002 33.086,36.7972 v 87.871 h 33.723 V 126.34 c 0,-46.4377 -26.075,-69.2306 -67.266,-69.2306 -41.164,0 -66.359,22.9961 -66.359,68.1326" /><path
             id="path28"
             style="fill:#ffffff;fill-opacity:1;fill-rule:nonzero;stroke:none"
             d="m 29.3984,17.9102 h 201.746 v 233.34 H 29.3984 Z" /><path
             id="path30"
             style="fill:#4f2987;fill-opacity:1;fill-rule:nonzero;stroke:none"
             d="m 118.977,129.176 c -27.6723,16.512 -24.9028,40.094 -13.434,57.426 0.246,0.363 0.324,0.968 0.246,1.671 -0.48,4.122 -4.977,14.551 -6.8554,17.387 -0.4805,0.719 -0.8906,0.66 -0.9375,0.149 -0.1523,-4.715 -5.5195,-16.532 -13.7344,-30.141 -8.7305,-14.484 -8.75,-45.918 34.5933,-47.145 0.415,-0.011 0.532,0.415 0.122,0.653 z m 7.402,1.219 c -16.543,35.343 16.547,58.171 21.937,63.121 0.762,0.695 0.571,1.336 0.586,2.129 0,11.128 -6.375,29.132 -8.464,31.707 -0.293,0.398 -0.543,0.226 -0.665,-0.176 -2.824,-10.969 -17.882,-27.317 -20.918,-30.895 -25.5464,-30.375 -19.6988,-48.871 6.973,-66.316 0.34,-0.215 0.75,0.031 0.551,0.43 z m 5.391,1.503 c 7.816,37.489 38.328,38.403 41.058,45.516 4.258,11.094 -3.535,30.781 -5.527,33.109 -0.192,0.25 -0.469,0.09 -0.567,-0.117 -4.136,-9.082 -10.843,-17.73 -15.738,-21.703 -6.926,-5.578 -33.43,-25.223 -19.875,-56.832 0.156,-0.391 0.555,-0.293 0.649,0.027 z m 5.425,-3.253 c 49.403,-1.79 52.899,43.23 53.094,60.078 0.023,0.976 -0.469,1.062 -0.703,0.379 -1.465,-3.516 -7.887,-16.071 -25.699,-23.704 -15.907,-6.824 -25.473,-22.308 -27.141,-36.222 -0.074,-0.344 0.219,-0.531 0.449,-0.531 z m 11.239,-16.875 v 11.335 H 109.469 V 111.77 h 38.965 z M 125.652,31.5625 c 0.317,-1.8945 4.414,-2.8242 5.332,0 l 9.438,74.7925 h -22.926 l 8.156,-74.7925 z M 269.984,0 H 0 V 270 H 269.984 V 0" /></g></g></g></g></svg>
```
---

## Surprising Example of a Text File

<a href="https://nyu.edu"><img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/Nyu_short_color.svg" alt="drawing" width="50%"/></a>

--

### Binary file editors


Images
- Raster (Pixel-based)
  - Photoshop (necessary for .psd files)
  - Gimp
  - Paint
- Vector (line/curve based)
  - Illustrator (necessary for .ai files)
  - Inkscape

Microsoft Office files
- Better buy Office
- Reverse engineered in OpenOffice / Google Workspace / Apple Pages
  - Occasional inconsistencies / issues
  - Missing features

PDF Files
- Better use Adobe software
- Reverse engineered in libpoppler (okular/evince) or OSX Preview 
  - Occasional inconsistencies / issues
  - Missing features


---

## Good File Naming Conventions

Try to use lowercase without spaces
```bash
file.zip
file.Zip
file.ZIP
FiLe.ZiP
```


Avoid spaces in file names.
```bash
important_document.js less_important_document.txt # 2 files
important document.js less important document.txt # 5 files?
```
--

Or follow whatever <a href="https://en.wikipedia.org/wiki/Naming_convention_(programming)#Examples_of_multiple-word_identifier_formats">conventions</a> your group, OS, or language uses.

---

## File extensions

How does your computer know which software opens a file?
```bash
doc.docx
doc.cpp
doc.ai
doc.pdf
```

--

This is all a convention, it's up to software to detect inappropriate files.

```python
for filename in ["doc.docx", "doc.cpp", "doc.ai", "doc.pdf"]:
    with open(filename, "r") as fd
        print(fd.readlines())
```

--

Your computer manages a list of default extensions.

---

## File permissions

Computers are all designed by multiple "users":
- The computer itself
- Administrators
- Normal users

--

Every file and folder controls who can read/write/execute a file

- user: the user who 'owns' the file or folder... every file or
  folder is owned by one user
- group - a group of users who assigned to
  the file or folder
- others - everyone else not including the user or
  the group

---

<!-- ## Software is Input/Output

Inputs:
- Files
- User Inputs
  - Mouse
  - Keyboard
  - Microphone
  - Camera
- Network data
Outputs:
- Files
- Visuals (through monitors/screens)
- Sound (through headphones/screens)
- Network data

--- -->

## The Environment

Software needs some context for how it should run

- Arguments
  - The input data that the user provided
  - Which input files/locations to open
  - What data should be generated?
  - Where/how should that be data stored?

--

- Working Directory
  - Software is run from a particular directory for user convenience
  - "Relative paths"

--

- Environment variables
  - Other data that the user or operating system has set
  - Which type of output is available
  - What encoding data comes in
  - What other software to use


---
<!-- 
## Networks

Modern computer usage errs away from files on disks

--

- Majority of computation is done on the internet

--

- How does that work?


---

## Clients and servers

Our computer ("client") prepares messages and sends it through cable or wifi to a remote destination according to an address.
- https://google.com
  - Protocol: https
  - Location: google.com

--

A computer ("server") reads the message and returns an output message
- contents of the webpage "https://google.com"

---

## Web browsers

Client for interacting with web data

For a user on a client computer:
- Input: a URL / link, clicks a link, interacts with a webpage

- Output: Visualizes web page data according to the action


For a remote server computer:
- Input: A request for a webpage using the [HTTP](http://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) or
HTTPS protocol.
- Output: [HTML](https://en.wikipedia.org/wiki/HTML) data sent with the HTTP/HTTPS protocol.

--

This input/output relationship is complex due to programs that run in web browsers
- Almost an operating system of its own (i.e Chrome OS)

---

## Different encodings

Just like binary files, html is just one encoding of data.
Internet transfers all sorts of data:

- ([IMAP](http://en.wikipedia.org/wiki/Internet_Message_Access_Protocol)
and [POP](http://en.wikipedia.org/wiki/Post_Office_Protocol) protocols),
file transfer
- ([FTP](http://en.wikipedia.org/wiki/File_Transfer_Protocol) and [SSH](http://en.wikipedia.org/wiki/Secure_Shell) protocols),
- [VoIP](http://en.wikipedia.org/wiki/Voice_over_Internet_Protocol),
streaming media such as webcams and internet radio, and
- [P2P](http://en.wikipedia.org/wiki/Peer-to-peer) file sharing
- ([RTP](http://en.wikipedia.org/wiki/Real-time_Transport_Protocol)
protocol and other proprietary protocols)
- etc

--- -->

## Representing numbers

You might be familiar with the binary number system:

<img src="../files/joke.png" width="66%" />

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

[A NAND gate](../files/nand.jpg) (from Wikipedia)

Truth table:
| A | B | A NAND B |
|---|---|----------|
| 0 | 0 |    1     |
| 0 | 1 |    1     |
| 1 | 0 |    1     |
| 1 | 1 |    0     |

---

## Transistors and Gates

[A half adder](../files/adder.jpg) (also from Wikipedia)

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
