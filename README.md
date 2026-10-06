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
- The method returns the largest number in the array. If the array is empty, it returns Integer.MIN_VALUE.

What was fixed:
- I added a check at the start of the method. If the array is empty, it returns Integer.MIN_VALUE right away, so the code never tries to read values[0]. All 4 tests now pass.

What you learned:
- AI output is only as good as the prompt. A vague prompt got a wrong guess, and each clearer prompt got closer to the right answer. I also learned to always handle empty input, because that's where the crash happened.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
  The first prompt was vague, so the AI guessed and returned the sum. The second prompt said exactly what to return, so the AI found the largest value. The third prompt covered the empty-array case, which fixed the last failing test. Each more specific prompt produced more accurate code.

- How did testing affect your changes?
  The JUnit tests showed exactly which inputs gave wrong answers and what the correct answers should be. Instead of assuming the AI code was right, I could see the problems, like the wrong totals in Iteration 1 and the crash on the empty array in Iteration 2, and fix them one at a time.

- What did version control help you understand?
  Each Git commit saved one version of the code, so I can see how the program improved from one iteration to the next. If a change had broken something, I could have gone back to an earlier commit. It also gives a clear record of my work.