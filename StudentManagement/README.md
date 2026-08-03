# SE2031 Practical 2 - Student Management System

## Repository Context
This repository is for **SE2031 Java Programming - Practical 2**.

The assignment focuses on building and evolving a **Student Management System** while practicing:
- Java classes and object-oriented design
- Package organization (`models`, `services`, `mainapp`)
- Control structures (`switch`, loops)
- Array-based sorting and searching
- JavaDoc documentation generation

Core classes expected by the practical:
- `Student` (student id and name)
- `Course` (course code and title)
- `Main` (menu, input handling, program flow)
- `EnrollmentManager` (after package refactor)

## Suggested Project Structures

### Part 1 (No packages)

```text
StudentManagement/
|-- Student.java
|-- Course.java
`-- Main.java
```

### Part 2+ (With packages)

```text
StudentManagement/
|-- models/
|   |-- Student.java
|   `-- Course.java
|-- services/
|   `-- EnrollmentManager.java
`-- mainapp/
    `-- Main.java
```

## Prerequisites
- JDK 17+ (or your module-required Java version)
- Command prompt/terminal

Check installation:

```bash
java -version
javac -version
```

## How to Compile and Run

### Option A: Part 1 (without packages)
Run these commands from the folder containing `Main.java`:

```bash
javac Student.java Course.java Main.java
java Main
```

### Option B: Part 2+ (with packages)
Run these commands from the project root (`StudentManagement/`):

```bash
javac models/*.java services/*.java mainapp/Main.java
java mainapp.Main
```

## JavaDoc Generation
After adding JavaDoc comments to all public classes and methods:

```bash
javadoc -d docs models/*.java services/*.java
```

Then open:
- `docs/index.html`

## Functional Expectations
Your final program should support:
- Adding/enrolling students through a menu
- Listing students
- Searching student by ID (linear search)
- Sorting students by name (for example, bubble sort)
- Exit option

## Submission Checklist
- [ ] Initial multi-class version completed
- [ ] Refactored into packages
- [ ] Menu implemented with `switch` and loops
- [ ] Array-based searching and sorting added
- [ ] JavaDoc comments written for public APIs
- [ ] JavaDoc HTML generated
- [ ] Repository includes this `README.md` with run instructions
