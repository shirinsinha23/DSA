# Word Pattern

A Java solution for the **Word Pattern** problem using HashMap to determine whether a string of words follows a given character pattern.

## 📌 Problem Statement

Given a pattern and a string `s`, determine whether `s` follows the same pattern.

A string follows the pattern if there is a one-to-one mapping between each character in the pattern and each word in the string.

### Example

```text
Input:
pattern = "abba"
s = "dog cat cat dog"

Output:
true
```

```text
Input:
pattern = "abba"
s = "dog cat cat fish"

Output:
false
```

## 💡 Approach

The solution uses two `HashMap`s:

* **Character → Word** mapping
* **Word → Character** mapping

Two maps are required to ensure that the relationship is **one-to-one**.

### Algorithm

1. Split the input string into individual words.
2. Check whether the number of words matches the length of the pattern.
3. Create two HashMaps for both directions of mapping.
4. Traverse the pattern and words simultaneously.
5. Check whether the existing mappings are consistent.
6. If a conflict is found, return `false`.
7. If all mappings are valid, return `true`.

## 🧠 Example Walkthrough

For:

```text
pattern = "abba"
s = "dog cat cat dog"
```

The mapping becomes:

```text
a → dog
b → cat
b → cat
a → dog
```

Since every character consistently maps to the same word and every word maps to the same character, the result is:

```text
true
```

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

Where `n` is the number of characters/words being processed.

## 🛠️ Technologies Used

* Java
* HashMap
* Data Structures & Algorithms

## 📂 Project Structure

```text
WordPattern/
│
└── 290-word-pattern/
    └── WordPattern.java
│
└── README.md
```

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/shirinsinha23/WordPattern.git
```

2. Open the project in IntelliJ IDEA, Eclipse, VS Code, or any Java-supported IDE.

3. Compile and run the Java solution.

## 🎯 Key Concepts

* HashMap
* Hashing
* String Manipulation
* One-to-One Mapping
* Data Structures & Algorithms

## 👩‍💻 Author

**Shirin Sinha**

B.Tech Computer Science & Engineering Student(CSE'27)

From Sharda University, Greater Noida, Uttar Pradesh-201310

GitHub: [@shirinsinha23](https://github.com/shirinsinha23)
