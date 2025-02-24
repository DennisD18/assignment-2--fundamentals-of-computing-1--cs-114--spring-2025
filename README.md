# Spring 2025 Fundamentals of Computing I — Assignment 2

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖・Before You Begin・❖

1. Log in to GitHub.
2. Fork this repository. See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this step and step `3`.
3. Clone your fork, using either the web site or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name and GitHub handle.

---

## ❖・Assignment・❖

For this assignment, you’ll be writing 4 programs, each discussed below.

### Program 1 (CountFlips)

Using the `Coin` class defined on page 204 of our textbook (and included in this repository), write a program called `CountFlips` whose `main` method flips a coin 100 times and counts how many times each side comes up. Print the results.

### Program 2 (Print Vowels and Non-Vowels)

Write a program that reads a string from the user, then determines and prints how many of each lowercase vowel (a, e, i, o, and u) appear in the entire string. Have a separate counter for each vowel. Also count and print the number of non-vowel characters. Use the following string to test your input:

    Write a program that reads a string from the user, then determines and prints how many of each lowercase vowel (a, e, i, o, and u) appear in the entire string. Have a separate counter for each vowel. Also count and print the number of non-vowel characters.

### Program 3 (The Twelve Days of Christmas)

Write a program that prints the verses of the song “The Twelve Days of Christmas,” in which each verse adds one line. The first two verses of the song are:

    On the 1st day of Christmas my true love gave to me
    A partridge in a pear tree.
    On the 2nd day of Christmas my true love gave to me
    Two turtle doves, and
    A partridge in a pear tree.

Use a `switch` statement in a loop to control which lines get printed. *Hint*: Order the cases carefully and avoid the `break` statement. Use a separate `switch` statement to put the appropriate suffix on the day number (1st, 2nd, 3rd, etc). The final verse of the song involves all 12 days, as follows:

    On the 12th day of Christmas, my true love gave to me
    Twelve drummers drumming,
    Eleven pipers piping,
    Ten lords a-leaping,
    Nine ladies dancing,
    Eight maids a-milking,
    Seven swans a-swimming,
    Six geese a-laying,
    Five golden rings,
    Four calling birds,
    Three French hens,
    Two turtle doves, and
    A partridge in a pear tree.

### Program 4 (One Hundred Bottles of Beer)

Write a program that prints the first few verses of the traveling song “One Hundred Bottles of Beer.” Use a loop such that each iteration prints one verse. Read the number of verses to print from the user. Validate the input. The following are the first two verses of the song:

    100 bottles of beer on the wall
    100 bottles of beer
    If one of those bottles should happen to fall
    99 bottles of beer on the wall

    99 bottles of beer on the wall
    99 bottles of beer
    If one of those bottles should happen to fall
    98 bottles of beer on the wall

---

## ❖・File List・❖

This repo contains the following files, all required to carry out this assignment. Before you start working, ensure you understand the role of each file below.

1. `Makefile` — The included `Makefile` is ready to be used with each of this assignment’s files. Edit the first line so that the `filename` variable points to the proper Java file, sans the `.java` extension. (Each file is already listed behind a comment, so all you need to do is uncomment the file you’re currently working on, and comment the rest.) Recall that running `make` compiles and run’s your program, running `make compile` builds your program without running it, and, running `make run` simply runs the previously-compiled version of your program. This last step is useful for testing input.
2. `.editorconfig` — Everything in this file is a redundancy of what’s already in the `.editorconfig` file you installed in your home folder during the first week of class. It’s here to make sure you’re working with the formatting rules defined in `.editorconfig`, as this is part of your grade. **Do not edit**
3. `.gitignore` — **Do not edit**
4. `Coin.java` — Required for the `CointFlips` program. **Do not edit**
5. `CountFlips.java`, `PrintVowelsAndNonVowels.java`, `TheTwelveDaysOfChristmas.java`, and `OneHundredBottlesOfBeer.java` — Each of your four programs go in these files. **Do not** write your code in anything *other* than these files.

---

## ❖・Grading・❖

| Item                                                            | Points |
|-----------------------------------------------------------------|:------:|
| `CountFlips.java` works according to instructions               |   15   |
| `PrintVowelsAndNonVowels.java` works according to instructions  |   15   |
| `TheTwelveDaysOfChristmas.java` works according to instructions |   15   |
| `OneHundredBottlesOfBeer.java` works according to instructions  |   15   |
| Formatting via EditorConfig rules followed                      |   10   |
| Code is professional and variable names are logical             |   20   |
| No syntax errors or warnings                                    |   10   |

---

## ❖・Due・❖

Tuesday, 11 March 2025, at 5:00 PM. ***Note*: Per the syllabus, NO late submissions will be accepted**

---

## ❖・Submission・❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may *only* be submitted via GitHub. **No other form of submission will be accepted**.
