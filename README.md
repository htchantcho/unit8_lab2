That’s a strong upgrade for Week 8 because it connects **AI output → refinement → version control → documentation**, which is very close to real development practice.

Below is a revised lab that combines **AI-assisted coding + Git/GitHub version history + iterative improvement** in a structured way.

---

# Lab: AI-Assisted Development with Version Control

**ULO8.4: Use an AI-assisted coding tool to generate, review, and implement a Java solution**
**(Integrated with Version Control and GitHub Practice)**

## Overview

In this lab, you will use an AI coding assistant to generate a Java program from a vague requirement. You will then:

* Evaluate the AI’s output
* Improve the program through iteration
* Track each improvement using Git commits
* Document your process in a README file

This reflects how real developers use AI tools and version control together in modern software development.

---

## Learning Objectives

By completing this lab, you will be able to:

* Use an AI tool to generate an initial Java solution from an unclear prompt
* Critically evaluate AI-generated code
* Improve a program through iterative development
* Use Git commits to document software evolution
* Write a README that explains development stages

---

## Scenario

You are given a vague software requirement:

> “Write a Java program that works with numbers.”

You will not clarify this prompt before using AI. Instead, you will observe how AI interprets it.

---

## Part 1: AI Code Generation (Initial Version)

### Step 1: Use AI

Enter the following prompt into an AI coding assistant:

> Write a Java program that works with numbers.

### Step 2: Save the Result

* Copy the generated code into a Java project in IntelliJ.
* Name your file:

```
NumberProgram.java
```

---

## Part 2: Git Setup and First Commit

### Step 3: Initialize Version Control

Enable Git in your IntelliJ project and create a repository (local or GitHub-connected).

### Step 4: First Commit

Commit the AI-generated version exactly as it is.

**Commit message:**

```
Initial AI-generated version of number program
```

---

## Part 3: Evaluate the AI Output

Before changing anything, answer these questions in your README:

### Version 1 Questions

* What does the program do?
* Was the prompt specific enough?
* Did the AI make assumptions? If so, what were they?
* Does the program solve a clear problem?
* What is missing or unclear?

---

## Part 4: Improve the Program (Version 2)

Now refine the program into something more useful.

Examples of improvements:

* Make it store numbers in an array
* Add user input
* Find the largest or average value
* Add validation for invalid input
* Improve output formatting

### Step 5: Commit Version 2

After improving the program:

**Commit message:**

```
Improved program with clearer functionality and structure
```

---

## Part 5: Further Refinement (Version 3)

Make one additional improvement such as:

* Add a new feature (min, max, average, or search)
* Improve readability (methods, comments)
* Add input validation

### Step 6: Commit Version 3

**Commit message:**

```
Added final feature and improved code structure
```

---

## Part 6: README Documentation

Your repository must include a `README.md` file that explains the evolution of your program.

### Required Sections

#### 1. Project Description

What does your final program do?

#### 2. Version History

Describe each version:

* **Version 1 (AI-generated):**

    * What AI produced
    * What was good or bad about it

* **Version 2 (Improved):**

    * What you changed
    * Why you changed it

* **Version 3 (Final version):**

    * Final improvements made

#### 3. AI Reflection

* How did AI interpret the vague prompt?
* Did it meet your expectations?
* What did you learn about writing better prompts?

#### 4. Version Control Reflection

* Why was it useful to commit each version?
* How does Git help track program evolution?
* Would this process be easier or harder without version control?

---

## Part 7: GitHub Submission

Submit:

* Your GitHub repository link
* At least **3 commits**
* A complete README.md

---

## Grading Criteria

| Criteria                           | Points  |
| ---------------------------------- | ------- |
| AI-generated baseline included     | 15      |
| Program evolves through 3 versions | 25      |
| Meaningful Git commits             | 20      |
| Code functionality and improvement | 20      |
| README quality and reflection      | 15      |
| Repository organization            | 5       |
| **Total**                          | **100** |

---

## Key Takeaway

This lab demonstrates a real-world workflow:

> AI generates a starting point → developer evaluates → developer improves → version control tracks evolution

Good developers don’t just write code—they **manage change over time**.

---

If you want, I can also:

* turn this into a **rubric with detailed performance levels (A/B/C/F style)**
* or create a **starter IntelliJ project template**
* or add a **common “bad AI output” example for instructors to demo in class**
