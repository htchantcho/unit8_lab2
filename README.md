# Reflection – AI Number Program Lab

##  Student Name:
Herve Tchantcho

##  GitHub Repository Link:
https://github.com/htchantcho/unit8_lab2.git

## Iteration 1

What the AI code does:
- The AI code adds up all the numbers in the array and returns the total. Because the prompt only gave the method name, the AI had to guess what "result" meant, and it chose the sum.

Tests passed/failed:
- 1 passed and 3 failed. testSingleValue passed. testBasicArray (expected 9, got 26), testNegativeNumbers (expected -1, got -64), and testEmptyArray (expected Integer.MIN_VALUE, got 0) failed.

What surprised you:
- The AI produced working code without knowing what the method was actually supposed to do. The one passing test only passed by coincidence: with a single value, the sum and the largest value are the same number.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2
What changed:
- The method now finds the largest number in the array instead of adding the numbers together.

What improved:
- 3 of 4 tests now pass: testBasicArray, testNegativeNumbers, and testSingleValue. The negative numbers test works because the code starts with the first element of the array instead of 0.

What still failed and why:
- testEmptyArray failed with "ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0." The code reads values[0] before checking whether the array has any elements, and an empty array has no index 0.

Commit message:
- Iteration 2: largest value implementation


---

## Iteration 3

Final behavior:
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?