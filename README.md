# 📦 Packages in Java

## 📖 What is a Package?

A **package** in Java is a namespace that groups related classes, interfaces, enums, and sub-packages together. It helps organize code, avoid naming conflicts, and control access to classes.

---

## 🎯 Why Use Packages?

- Organize related classes
- Avoid class name conflicts
- Improve code readability
- Provide access protection
- Make applications easier to maintain
- Support modular development

---

## 🛠 Types of Packages

### 1. Built-in Packages
Packages provided by Java.

Examples:
- `java.lang`
- `java.util`
- `java.io`
- `java.sql`
- `java.time`

Example:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
```

---

### 2. User-Defined Packages

Packages created by developers to organize their own classes.

Example:

```java
package com.company.employee;

public class Employee {

}
```

---

## 📂 Package Declaration

A package declaration must be the **first statement** in a Java file.

```java
package com.example.project;
```

---

## 📥 Importing Packages

Import a single class:

```java
import java.util.Scanner;
```

Import all classes:

```java
import java.util.*;
```

---

## 📁 Example Structure

```
Project
│
├── src
│   └── com
│       └── company
│           ├── employee
│           │      └── Employee.java
│           │
│           ├── department
│           │      └── Department.java
│           │
│           └── Main.java
│
└── README.md
```

---

## 🔑 Advantages

- Better project organization
- Prevents naming conflicts
- Easier maintenance
- Supports code reusability
- Improves security through access modifiers

---

## ⚠ Naming Conventions

- Package names should be **lowercase**.
- Use your organization's domain name in reverse order.

Example:

```text
com.company.project
org.example.library
in.krishna.javaproject
```

---

## 📚 Key Points

- A package groups related Java classes and interfaces.
- Built-in packages are provided by Java.
- User-defined packages are created by developers.
- Use the `package` keyword to declare a package.
- Use the `import` keyword to access classes from another package.
- Packages improve organization, reusability, and maintainability.

---

## 🚀 Conclusion

Packages are an essential feature of Java that help organize code into logical groups. They improve readability, reduce naming conflicts, and make large applications easier to develop and maintain.
