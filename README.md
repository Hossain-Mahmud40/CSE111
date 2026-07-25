# CSE111 — Programming Language II

# MID-TERM REVISION GUIDE (Condensed)

_(Built from your Lab 1–5, Quiz file, and 6 uploaded midterm papers)_

---

## 1. IMPORTANT BUILT-IN METHODS — with purpose & examples

⚠️ Several labs say **"don't create a new array"** — in those tasks, skip `Arrays.copyOf`/`copyOfRange` and do it manually. Otherwise, these are fair game and save time.

### String methods

| Method                              | Purpose                                                   | Example                                         |
| ----------------------------------- | --------------------------------------------------------- | ----------------------------------------------- |
| `.equals(other)`                    | Compare **content** of two Strings (never use `==`)       | `"Bob".equals(name)` → `true`/`false`           |
| `.equalsIgnoreCase(other)`          | Same, but ignores case                                    | `"BOB".equalsIgnoreCase("bob")` → `true`        |
| `.length()`                         | Number of characters                                      | `"Hello".length()` → `5`                        |
| `.charAt(i)`                        | Character at index `i`                                    | `"Hello".charAt(1)` → `'e'`                     |
| `.substring(a, b)`                  | Slice from index `a` to `b` (exclusive)                   | `"Hello".substring(1,4)` → `"ell"`              |
| `.contains(sub)`                    | Check if substring exists — used in file-extension checks | `"Assignment1.java".contains(".java")` → `true` |
| `.indexOf(sub)`                     | Position of first match, `-1` if absent                   | `"Hello".indexOf("l")` → `2`                    |
| `.toUpperCase()` / `.toLowerCase()` | Case conversion                                           | `"hi".toUpperCase()` → `"HI"`                   |
| `.trim()`                           | Removes leading/trailing spaces                           | `" hi ".trim()` → `"hi"`                        |
| `.split(",")`                       | Break a String into a `String[]` by delimiter             | `"a,b,c".split(",")` → `{"a","b","c"}`          |
| `.replace(old,new)`                 | Replace all occurrences                                   | `"cat".replace("c","b")` → `"bat"`              |
| `.startsWith()/.endsWith()`         | Check prefix/suffix                                       | `"file.txt".endsWith(".txt")` → `true`          |
| `.isEmpty()`                        | `true` if length is 0                                     | `"".isEmpty()` → `true`                         |
| `String.valueOf(x)`                 | Convert any type to String                                | `String.valueOf(25)` → `"25"`                   |
| `.compareTo(other)`                 | Dictionary-order comparison (<0, 0, >0)                   | `"a".compareTo("b")` → negative                 |
| `"" + intVar`                       | Quick int→String trick (used constantly in your labs)     | `"Total: " + 5` → `"Total: 5"`                  |

### Arrays class (`java.util.Arrays`)

| Method                              | Purpose                                        | Example                         |
| ----------------------------------- | ---------------------------------------------- | ------------------------------- |
| `Arrays.toString(arr)`              | Print an array readably                        | `{1,2,3}` → `"[1, 2, 3]"`       |
| `Arrays.sort(arr)`                  | Sort ascending, in place                       | `Arrays.sort(arr)`              |
| `Arrays.copyOf(arr, newLen)`        | **New** resized array (padded with 0/null)     | `Arrays.copyOf(arr, 5)`         |
| `Arrays.copyOfRange(arr, from, to)` | New array = a slice                            | `Arrays.copyOfRange(arr, 1, 3)` |
| `Arrays.equals(a1, a2)`             | `true` if same length + same elements in order | `Arrays.equals(a,b)`            |
| `Arrays.fill(arr, val)`             | Set every element to `val`                     | `Arrays.fill(arr, 0)`           |

### Math class

| Method                            | Purpose               | Example                   |
| --------------------------------- | --------------------- | ------------------------- |
| `Math.max(a,b)` / `Math.min(a,b)` | Bigger/smaller of two | `Math.max(3,7)` → `7`     |
| `Math.abs(x)`                     | Absolute value        | `Math.abs(-5)` → `5`      |
| `Math.pow(base,exp)`              | Exponent              | `Math.pow(2,3)` → `8.0`   |
| `Math.sqrt(x)`                    | Square root           | `Math.sqrt(9)` → `3.0`    |
| `Math.round/floor/ceil(x)`        | Rounding              | `Math.round(4.6)` → `5`   |
| `Math.PI`                         | π constant            | used in circle-area tasks |

### Wrapper classes (type conversion)

| Method                          | Purpose                                          | Example                             |
| ------------------------------- | ------------------------------------------------ | ----------------------------------- |
| `Integer.parseInt(str)`         | String → int                                     | `Integer.parseInt("25")` → `25`     |
| `Double.parseDouble(str)`       | String → double                                  | `Double.parseDouble("2.5")` → `2.5` |
| `Integer.toString(num)`         | int → String                                     | `Integer.toString(25)` → `"25"`     |
| `Integer.MAX_VALUE`/`MIN_VALUE` | Starting bound for "find largest/smallest" loops | `int max = Integer.MIN_VALUE;`      |

### Scanner (`java.util.Scanner`) — user input

| Method               | Purpose                        | Example                          |
| -------------------- | ------------------------------ | -------------------------------- |
| `input.nextInt()`    | Read an int                    | `int n = input.nextInt();`       |
| `input.nextDouble()` | Read a double                  | `double d = input.nextDouble();` |
| `input.nextLine()`   | Read a full line (text)        | `String s = input.nextLine();`   |
| `input.next()`       | Read one word (stops at space) | `String w = input.next();`       |

⚠️ Mixing `nextInt()`/`nextDouble()` with `nextLine()` leaves a leftover newline — call an extra `input.nextLine();` to clear it before reading a line.

### Object-level defaults (every class inherits these)

| Method              | Purpose                                                        | Note                                                                |
| ------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------- |
| `obj.equals(other)` | By default compares **reference/address**, not content         | Same idea as `==` unless the class overrides it                     |
| `==` (on objects)   | Checks if two variables point to the **same object** in memory | Used in your "same address" vs "different address" comparison tasks |

**Quick pick:** Compare String content → `.equals()`. Compare object addresses → `==`. Convert int→String → `"" + x`. Convert String→int → `Integer.parseInt()`. Check file extension → `.contains()`. Print array → `Arrays.toString()`.

---

## 2. HOW YOUR EXAM IS STRUCTURED

From your 6 real midterm papers (Spring 2026 / Fall 2024, Set-A/Set-B, ~25 marks, 60–75 min, 3 questions):

| Question | CO      | What it always is                                                                                      |
| -------- | ------- | ------------------------------------------------------------------------------------------------------ |
| **Q1**   | CO1     | Pure **code tracing** ("Illustrate the output")                                                        |
| **Q2**   | CO1     | Tracing OR **class design from driver code**                                                           |
| **Q3**   | CO1/CO2 | **Class design** — CO2 versions stress **encapsulation** (private fields, capacity limits, validation) |

---

## 3. TOPIC PRIORITY

**🔴 High:** Code tracing (`this`, pre/post-increment, method-calls-method); class design from driver code; constructors (default + overloaded); encapsulation (`private` + validation); fixed-capacity arrays inside classes; object references (`obj2 = obj1`).

**🟡 Medium:** Method overloading; `.equals()` string comparison; in-place array manipulation (no new array); multi-class "contains" problems (Teacher–Course, Team–Player); `.contains()` for substring checks.

**🟢 Low:** Plain array algorithms without OOP (largest/smallest, primes, duplicates); median/max-average-of-k; string shifting.

---

## 4. REPEATED QUESTION PATTERNS

**A — Tracing:** A class with instance vars gets methods that shadow variable names (needs `this.`), use pre/post-increment, and call other methods mid-expression. Driver code creates 1–2 objects and calls methods in sequence — sometimes reassigning one object to another (`a1 = a2`).

**B — Class design from driver code + expected output table:** Default constructor → placeholder output (`null`, `0`, `"Default"`). Parameterized constructor → "created" message. Capacity limit enforced with counter + `if`. Search/remove via linear loop + `.equals()`. Merge/compare methods needing "at least N objects" and rejecting self-reference.

**C — Encapsulation-heavy design (CO2):** All attributes `private`. A "container" class holds objects of another class in a capped array (sometimes capped by **total weight/budget**, not just count). Validation before adding (duplicate check, type/genre check, capacity check). A `details()`-style method prints a formatted summary.

---

## 5. JAVA SYNTAX CHEAT SHEET

```java
// Class + constructors
public class ClassName {
    private String name;      // private → encapsulation
    public int count;

    public ClassName() { name = "Default"; count = 0; }        // default
    public ClassName(String name) { this.name = name; }         // overloaded

    public void printDetails() { System.out.println("Name: " + name); }
}

// Objects & references
ClassName obj1 = new ClassName();
ClassName obj2 = obj1;     // obj2 now points to the SAME object — changes affect both

// Method overloading
public int add(int a, int b) { return a + b; }
public int add(int a, int b, int c) { return a + b + c; }

// Fixed-capacity array inside a class
private String[] items; private int count = 0, capacity;
public void addItem(String item) {
    if (count < capacity) { items[count] = item; count++; }
    else System.out.println("Maximum limit reached.");
}

// Linear search
for (int i = 0; i < count; i++) {
    if (items[i].equals(target)) { /* found at i */ }
}

// this keyword — #1 tracing trap
public void method(int x) {
    x = x + 1;         // changes LOCAL x only
    this.x = x + 1;    // changes INSTANCE x
}

// Pre vs post increment — #2 tracing trap
int y = x++;   // y = old x, THEN x increases
int z = ++x;   // x increases FIRST, then z = new x
```

---

## 6. COMMON MISTAKES

- Using `==` instead of `.equals()` for Strings
- Forgetting `this.` when a parameter/local name matches an instance variable
- Mixing up `x++` vs `++x` while tracing
- Creating a new array when the question forbids it
- Forgetting the `count < capacity` guard before adding, or the exact limit message
- Forgetting to update `count` after add/remove
- Leaving fields `public` when the question says "private"/"encapsulation"
- Skipping edge cases ("not found", "can't merge with yourself", "minimum 3 needed")
- Mismatched output text — exact wording, punctuation, and separators matter

---

## 7. EXAM TIPS

1. Budget ~15–18 min for tracing (Q1) — one missed `this.`/increment breaks the whole chain.
2. **For tracing:** build a variable table (columns = every instance + local var) and update row by row — don't trace in your head.
3. **For design:** read the full expected output first, then write attributes → constructor(s) → methods in the order they're called.
4. Derive capacity/limit numbers from the driver code + output, don't guess.
5. Match output text **exactly** (capitalization, punctuation, units like "Tk").
6. Save ~5 min to double-check `private` fields and edge-case handling.
7. If stuck on tracing, bank partial marks on the design question first, then return.

---

## 8. LAST-MINUTE CHECKLIST

**Tracing:**

- [ ] Instance var shadowed by parameter/local? → use `this.`
- [ ] `x++` (use, then increment) vs `++x` (increment, then use)?
- [ ] Method called inside another? → trace it fully, bring back the return value
- [ ] State carried across multiple calls on the same object?
- [ ] `obj2 = obj1`? → both now share the same object

**Design:**

- [ ] All attributes listed (from constructor calls + printed fields)
- [ ] `private` where encapsulation/CO2 is required
- [ ] Constructor overloading if driver code uses both default and parameterized
- [ ] Array attribute → paired `capacity` + `count`
- [ ] Add method → capacity guard + exact limit message
- [ ] Search/remove → loop + `.equals()` + "not found" handling
- [ ] Merge/compare → minimum-count check + reject self-reference
- [ ] Output text matches exactly (separators, punctuation, capitalization)

**Cold-syntax you must be able to write:**

```java
private String name;
public ClassName() { }
public ClassName(String name) { this.name = name; }
if (count < capacity) { arr[count] = item; count++; } else { System.out.println("Full"); }
for (int i = 0; i < count; i++) { if (arr[i].equals(target)) { ... } }
str.equals(other);   x++;   ++x;   obj2 = obj1;
```

Good luck — the pattern (tracing → design → encapsulated design) repeats every semester, so drilling variable-table tracing and driver-code reverse-engineering is the highest-value prep you can do.
