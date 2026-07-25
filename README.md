# Midterm Revision Guide

Course: CSE111 - Programming Language II  
Source focus: Assignment 1-5 solutions, quiz questions up to midterm, lab/home task patterns, and tracing notes.

## Exam Pattern Summary

Your instructor's materials repeatedly use two main question styles:

1. **Trace the output** of Java code involving objects, constructors, methods, `this`, arrays, and `++`.
2. **Design class/classes from tester code and expected output**, usually with attributes, constructors, methods, arrays of objects, capacity checks, duplicate checks, and formatted printing.

The exam is likely to reward exact output, correct state tracking, and matching the tester code exactly.

## Priority Topics

| Priority | Topics | Why it matters |
|---|---|---|
| High | Classes, objects, attributes, constructors, methods | Almost every Assignment 2-5 task is class design from a tester. |
| High | `this`, local vs instance variables, shadowing | Quiz tracing questions repeatedly use same variable names inside methods. |
| High | Output tracing with `++`, method calls, object references | Several quiz/home-task images are tracing-table questions. |
| High | Arrays and arrays of objects | Used in Assignment 1 array problems, TaskManager, Department, Company, Spaceship, Restaurant. |
| High | Driver-code based implementation | Quizzes ask to design `Boxer`, `TaskManager`, `File`, `JavaPackage` from tester and output. |
| Medium | Method overloading | Seen in `addTask(...)`, `addStudent(...)`, `addEmployee(...)`, constructors with different parameters. |
| Medium | Encapsulation with `private`, getters, setters | Assignment 5 and quiz file/package question emphasize private attributes. |
| Medium | String methods: `equals`, `contains`, `charAt`, `length` | Used in quiz file-type checking, string shifting, duplicate/location checks. |
| Medium | Searching, counting, duplicate checking | Common in arrays, object arrays, tasks, files, students, employees. |
| Medium | Formatted printing | Outputs must match exactly; `printf("%.1f")` appears in tasks. |
| Low | Packages/imports | Present in folders, but usually not the core exam logic. |
| Low | Advanced Java library usage | Most tasks use basic arrays and loops, not collections. |

## Frequently Repeated Concepts

### 1. Trace Object State

Common pattern:

```java
public int x = 3, y = 2, sum;

public void m1() {
    int x = 3;
    sum = this.x + x++;
    this.x = sum + x;
}
```

What to track:

- Instance variables: `this.x`, `this.y`, `this.sum`
- Local variables: `x`, `y`, `sum`
- Parameter variables: values passed into methods
- Object references: whether a method returns `this`, `new ClassName()`, or modifies another object
- Array mutation: arrays passed to methods are changed permanently

### 2. Driver Code to Class Design

Repeated task style:

```java
ClassName obj = new ClassName(...);
obj.method(...);
System.out.println(obj.variable);
obj.showDetails();
```

You must infer:

- Attribute names and access modifiers
- Constructor parameters
- Return type: `void`, `String`, `int`, object type
- Whether method prints or returns
- Array size/capacity from expected output
- Edge cases from tester only

### 3. Arrays With Count Variable

Common in `Department`, `Company`, `Spaceship`, `Restaurant`, `TaskManager`, `JavaPackage`.

```java
Item[] items = new Item[100];
int count = 0;

public void addItem(Item item) {
    if (count >= items.length) {
        System.out.println("Limit reached");
        return;
    }
    items[count] = item;
    count++;
}
```

### 4. Duplicate Checking

```java
for (int i = 0; i < count; i++) {
    if (arr[i].equals(value)) {
        System.out.println("Already exists");
        return;
    }
}
```

For objects:

```java
if (students[i].getId() == s.getId()) { ... }
if (orders[i] == user) { ... } // same object reference
```

### 5. Capacity / Limit Checking

Seen in spaceship cargo, restaurant orders, package files, employees/students.

```java
if (count >= arr.length) {
    System.out.println("Maximum limit reached");
    return;
}
```

For weight/capacity:

```java
if (currentWeight + cargo.getWeight() > capacity) {
    System.out.println("Exceeds capacity");
    return;
}
```

## Java Syntax Cheat Sheet

### Basic Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

### Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double d = sc.nextDouble();
String word = sc.next();
String line = sc.nextLine();
```

After `nextInt()` before `nextLine()`, use one extra `sc.nextLine()` to consume the newline.

### Loops

```java
for (int i = 0; i < n; i++) { }

int i = 0;
while (i < n) {
    i++;
}
```

### Arrays

```java
int[] arr = new int[n];
int[] fixed = {1, 2, 3};

for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}
```

### String

```java
String s = "java";
s.length();
s.charAt(0);
s.equals("java");
s.contains(".java");
```

Use `.equals()` for String comparison, not `==`.

### Class and Object

```java
public class Student {
    public String name;
    public int id;

    public Student(String n, int i) {
        name = n;
        id = i;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
```

```java
Student s1 = new Student("Akib", 10);
s1.showDetails();
```

### Constructor

```java
public ClassName() {
    // default constructor
}

public ClassName(String name) {
    this.name = name;
}
```

Constructor name must match class name and has no return type.

### Method

```java
public void printInfo() {
    System.out.println(name);
}

public String getInfo() {
    return name + " " + id;
}
```

### Getter and Setter

```java
private int id;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}
```

### Method Overloading

```java
public void addTask(String task) { }

public void addTask(String task1, String task2) {
    addTask(task1);
    addTask(task2);
}
```

Same method name, different parameter list.

## Coding Templates Worth Memorizing

### Print Details Template

```java
public void showDetails() {
    System.out.println("Name: " + name);
    System.out.println("Count: " + count);
}
```

### Return Message After Changing State

```java
public String makeOptional() {
    if (submission) {
        submission = false;
        return "Assignment will not require submission";
    }
    return "Submission is already not required";
}
```

### Add Object to Object Array

```java
public void addStudent(Student s) {
    if (count >= students.length) {
        System.out.println("Cannot add more students");
        return;
    }
    students[count++] = s;
}
```

### Search Object by ID

```java
public void findStudent(int id) {
    for (int i = 0; i < count; i++) {
        if (students[i].getId() == id) {
            System.out.println("Student Name: " + students[i].name);
            return;
        }
    }
    System.out.println("Student with this ID doesn't exist");
}
```

### Shift Right to Insert

```java
for (int i = count; i > index; i--) {
    arr[i] = arr[i - 1];
}
arr[index] = value;
count++;
```

### Shift Left to Remove

```java
for (int i = index; i < count - 1; i++) {
    arr[i] = arr[i + 1];
}
count--;
```

### Rearrange an Array Element

```java
int oldIndex = -1;
for (int i = 0; i < count; i++) {
    if (tasks[i].equals(task)) {
        oldIndex = i;
        break;
    }
}

if (oldIndex == -1) {
    System.out.println(task + " not found");
    return;
}

String temp = tasks[oldIndex];
for (int i = oldIndex; i < count - 1; i++) {
    tasks[i] = tasks[i + 1];
}

int newIndex = position - 1;
for (int i = count - 1; i > newIndex; i--) {
    tasks[i] = tasks[i - 1];
}
tasks[newIndex] = temp;
```

### Maximum Average of K Consecutive Elements

```java
double maxAvg = 0;
for (int i = 0; i <= arr.length - k; i++) {
    int sum = 0;
    for (int j = i; j < i + k; j++) {
        sum += arr[j];
    }
    double avg = sum / (double) k;
    if (i == 0 || avg > maxAvg) {
        maxAvg = avg;
    }
}
System.out.println("Max Avg: " + maxAvg);
```

## Common Student Mistakes

| Mistake | Fix |
|---|---|
| Mixing local `x` with `this.x` | Make separate tracing columns for local and instance variables. |
| Forgetting post-increment timing | `x++` uses old value first, then increases. `++x` increases first. |
| Printing instead of returning | Check tester code: if inside `System.out.println(obj.method())`, method must return. |
| Returning instead of printing | If tester calls `obj.method();` and expected output appears, method should print. |
| Using `==` for Strings | Use `.equals()`. |
| Looping through full array instead of `count` | For object arrays, loop `i < count`, not `i < arr.length`. |
| Forgetting `return` after error message | After invalid/duplicate/capacity message, return immediately. |
| Not matching exact output | Copy labels, spaces, punctuation, and line breaks carefully. |
| Constructor with return type | Constructors have no `void` or return type. |
| Private fields accessed directly | Use getters/setters if the field is private. |
| Not initializing object arrays | `Student[] students = new Student[100];` before storing objects. |

## Exam Tips

1. Read tester code before writing any class.
2. Underline every method call and write whether it prints or returns.
3. For tracing questions, draw a table with columns for object fields, method parameters, local variables, array values, and output.
4. Never assume extra edge cases unless the question asks for them. Some quiz questions say only consider shown cases.
5. Use `count` for partially filled arrays.
6. Match exact output first; optimize later only if time remains.
7. If stuck, write the attributes and constructors first. Then implement methods in tester order.
8. For object-array questions, implement checks in this order: invalid input, duplicate, capacity, then add.

## Time Management

For a 75-minute midterm:

| Time | Work |
|---|---|
| 0-5 min | Read all questions and identify tracing vs coding. |
| 5-25 min | Solve tracing questions carefully using tables. |
| 25-60 min | Write class-design answers from tester code. |
| 60-70 min | Check output formatting and missing returns. |
| 70-75 min | Recheck constructor names, access modifiers, and loop bounds. |

## Likely Practice Questions

1. Trace output of a class where constructor changes `this.x`, `this.y`, and `sum`.
2. Trace output where a method has parameters named the same as instance variables.
3. Trace output involving `x++`, `++x`, `this.x++`, and method return values.
4. Trace output where an `int[]` is modified inside a method and printed later.
5. Write a program to find the maximum average of `k` consecutive array elements.
6. Write a class `Course` with default values and print course details.
7. Write a class `Assignment` with `makeOptional()` that changes a boolean field.
8. Write a class `Employee` with salary, designation, increment, and promotion logic.
9. Write a class `MobilePhone` that stores contacts in arrays and searches by name.
10. Write a class `Cart` that stores item names/prices and calculates total.
11. Write a `Reader` class that counts books read by genre.
12. Write a `Player` or `Student` class using constructors and `showDetails()`.
13. Write a `TaskManager` class that adds tasks and rearranges task position.
14. Write a `Department` class that stores `Student` objects and rejects duplicate IDs.
15. Write a `Company` class that stores `Employee` objects and checks capacity.
16. Write a `Spaceship` class that loads `Cargo` objects while checking weight capacity.
17. Write a `Restaurant` class that stores pending orders and rejects duplicate users.
18. Write a `File` and `JavaPackage` class with private fields, file type checking, duplicate name checking, and max capacity.
19. Given an array, count frequency of each unique element.
20. Given a String, shift each character or inspect characters using `charAt()`.

## Mock Midterm

Total: 40 marks  
Suggested time: 75 minutes

### Question 1: Output Tracing [10 Marks]

Trace the output. Show workings in a table.

```java
public class TraceA {
    public int x = 4, y = 2, sum = 1;

    public TraceA() {
        x = x + y++;
        sum = x + y;
    }

    public int methodA(int x, int y) {
        this.x = this.x + x++;
        sum = this.x + y + this.y;
        System.out.println(this.x + " " + x + " " + sum);
        return sum;
    }

    public void methodB(int sum) {
        int y = 5;
        this.y = this.y + y++;
        this.sum = sum + y + this.y;
        System.out.println(this.y + " " + y + " " + this.sum);
    }
}
```

```java
TraceA t = new TraceA();
int p = t.methodA(3, 2);
t.methodB(p);
System.out.println(t.x + " " + t.y + " " + t.sum);
```

### Question 2: Array Problem [8 Marks]

Given an integer array and value `k`, print the maximum average among every group of `k` consecutive elements.

Sample:

```java
int[] marks = {12, 15, 20, 17, 20, 13};
int k = 4;
```

Output:

```text
Max Avg: 18.0
```

### Question 3: Design a Class From Driver Code [10 Marks]

Design a `TaskManager` class.

```java
String[] arr = {"Study", "Groceries"};
TaskManager day1 = new TaskManager("Alex", arr);
System.out.println(day1.user);
day1.showTasks();
day1.addTask("Exercise");
day1.addTask("Laundry", "Cleaning");
day1.showTasks();
day1.rearrange("Exercise", 2);
day1.showTasks();
day1.rearrange("Cooking", 3);
day1.rearrange("Cleaning", 6);
```

Expected behavior:

- Store initial tasks.
- Add one or two tasks.
- Print total task count.
- Rearrange task to a 1-based position.
- Print not found message if task does not exist.
- Print invalid position message if position is outside `1` to `count`.

### Question 4: Multi-Class Object Array [12 Marks]

Design `File` and `JavaPackage`.

Rules:

- All attributes of `File` are private.
- A `JavaPackage` has a name, capacity, allowed file types, and stored files.
- Store only files whose names contain one of the allowed extensions.
- Do not store two files with the same name in the same package.
- Stop storing when capacity is full.

Tester idea:

```java
File f1 = new File("Assignment1.java", 12);
File f2 = new File("Assignment1.class", 8);
File f3 = new File("notes.pdf", 5);

JavaPackage p1 = new JavaPackage("CSE111", 2);
p1.allowedFiles = new String[]{".java", ".class"};
p1.addFile(f1);
p1.addFile(f2);
p1.addFile(f3);
p1.packageInfo();
```

## Last-Minute Revision Sheet

### Must-Know Syntax

```java
ClassName obj = new ClassName();
ClassName obj = new ClassName(value1, value2);
```

```java
public ClassName(...) { }
public void methodName(...) { }
public int methodName(...) { return value; }
public String methodName(...) { return text; }
```

```java
this.x = x;
```

Use `this.x` when local/parameter variable name conflicts with instance variable.

```java
String s = "abc";
s.length();
s.charAt(i);
s.equals("abc");
s.contains(".java");
```

```java
int[] arr = new int[n];
Student[] students = new Student[100];
```

```java
for (int i = 0; i < count; i++) { }
```

### Must-Know Templates

Add to array:

```java
arr[count++] = value;
```

Duplicate check:

```java
for (int i = 0; i < count; i++) {
    if (arr[i].equals(value)) {
        return;
    }
}
```

Object duplicate check:

```java
if (students[i].getId() == s.getId()) { return; }
```

Capacity check:

```java
if (count >= arr.length) {
    System.out.println("Maximum limit reached");
    return;
}
```

Getter/setter:

```java
private int id;
public int getId() { return id; }
public void setId(int id) { this.id = id; }
```

Formatted double:

```java
System.out.printf("%.1f\n", value);
```

### Concepts to Revise Last

- Constructor vs method
- `this` vs local variable
- `x++` vs `++x`
- Method print vs return
- Array index starts at `0`
- Position in questions may start at `1`
- Loop object arrays using `count`
- Use `.equals()` for String
- Use `return` after invalid cases
- Match expected output exactly

## Final Advice

Practice tracing with a table, not in your head. For coding questions, make the tester code your checklist: every constructor call, method call, variable access, and output line tells you exactly what your class must contain.
