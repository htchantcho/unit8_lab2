# Lab: AI + JUnit + Git Iteration (NumberProgram)

## Objective

In this lab, you will use an AI tool, JUnit tests, and Git to build and improve a Java method across 3 iterations.

You will:
- Use AI to generate code
- Run JUnit tests to evaluate correctness
- Improve code through iteration
- Track changes using Git commits
- Document your work in `reflection.md`

---

## Starter Project

You are given:
- NumberProgram.java (contains empty method)
- NumberProgramTest.java (JUnit tests already written)
- reflection.md (you will complete this file)

Do not modify the test file.

---

# Setup

## Step 0.1: Open Project

Open the starter project in IntelliJ.

Verify:
- NumberProgram.java exists
- NumberProgramTest.java exists
- reflection.md exists

---

## Step 0.2: Share Project on GitHub

In IntelliJ:
1. Enable Git version control if prompted
2. Sign in to GitHub if needed
3. Select “Share Project on GitHub”
4. Create repository named:

NumberProgramLab

5. Push project to GitHub

---

## Step 0.3: Initial Commit

Commit and push the starter project.

Commit message:
Initial starter project with reflection file

---

# Iteration Process (Repeat 3 Times)

Each iteration follows the same steps:

---

# Iteration 1

## Step 1: Use AI Tool

Use an AI tool (ChatGPT, Copilot, or IntelliJ AI Assistant).

Enter this prompt:

Write a Java class named NumberProgram that includes the following method:

public static int findResult(int[] values)

---

## Step 2: Update Code
Replace the method in NumberProgram.java with the AI-generated code.

---

## Step 3: Run Tests
Run JUnit tests and record results.

---

## Step 4: Update reflection.md
Complete the Iteration 1 section:
- What the AI code does
- Which tests passed or failed
- What surprised you
- Commit message used

---

## Step 5: Commit

Commit and push changes.

Commit message:
Iteration 1: AI-generated implementation

---

# Iteration 2

## Step 1: Use AI Tool

Enter this prompt:

Write a Java method that returns the largest integer in an array.

---

## Step 2: Update Code
Replace method with new AI-generated code.

---

## Step 3: Run Tests
Run JUnit tests and record results.

---

## Step 4: Update reflection.md
Complete Iteration 2 section:
- What changed
- What improved
- What still failed and why
- Commit message used

---

## Step 5: Commit

Commit message:
Iteration 2: largest value implementation

---

# Iteration 3

## Step 1: Use AI Tool

Enter this prompt:

Modify the method so that if the array is empty, it returns Integer.MIN_VALUE.

---

## Step 2: Update Code
Fix or update method so all tests pass.

---

## Step 3: Run Tests
Confirm all JUnit tests pass.

---

## Step 4: Update reflection.md
Complete Iteration 3 section:
- Final behavior of the program
- What was fixed
- What you learned
- Commit message used

---

## Step 5: Commit

Commit message:
Iteration 3: final version passing all tests

---

# Submission Requirements

Submit your GitHub repository URL.

Your repository must include:
- NumberProgram.java
- NumberProgramTest.java (unchanged)
- reflection.md (completed)
- At least 4 commits:
    - Initial starter project
    - Iteration 1
    - Iteration 2
    - Iteration 3

All JUnit tests must pass in the final version.

---

# Grading Rubric (100 points)

## 1. Git and Version Control (20 pts)
- 4 commits present (5 pts each)
- Clear commit messages
- Proper progression of changes

## 2. JUnit Testing (20 pts)
- Tests run successfully
- Final version passes all tests
- Correct interpretation of test failures

## 3. Code Quality (20 pts)
- Correct implementation of findResult
- Proper handling of array logic
- Clean and readable structure

## 4. Iterative Improvement (20 pts)
- Clear progression from AI-generated code to final solution
- Evidence of debugging and refinement across iterations

## 5. Reflection Quality (20 pts)
- reflection.md completed for all iterations
- Thoughtful explanation of AI behavior
- Clear understanding of testing and iteration process

---

# Key Rule

Each iteration must follow this order:

Use AI Tool → Update Code → Run Tests → Update reflection.md → Commit