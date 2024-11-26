
# Penguin Manager: Learn Arrays of Class Objects in Java with IntelliJ IDEA

This repository demonstrates how to manage arrays of class objects in Java through a fun and practical example: handling a collection of Penguin objects. This project is designed to help beginners understand object-oriented programming (OOP) concepts while using IntelliJ IDEA as the development environment.

---

## 📋 Table of Contents

- [Introduction](#introduction)
- [Learning Objectives](#learning-objectives)
- [Project Features](#project-features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [1. Clone the Repository](#1-clone-the-repository)
  - [2. Set Up IntelliJ IDEA](#2-set-up-intellij-idea)
  - [3. Run the Program](#3-run-the-program)
- [Code Overview](#code-overview)
  - [1. Penguin Class](#1-penguin-class)
  - [2. PenguinManager Class (Main)](#2-penguinmanager-class-main)
- [Expected Output](#expected-output)
- [Resources](#resources)
- [How to Contribute](#how-to-contribute)
- [License](#license)

---

## 📝 Introduction

The `Penguin Manager` project walks you through the process of creating, managing, and modifying objects in an array. You’ll learn how to:
- Define a Java class with attributes and methods.
- Work with arrays to store and manage objects.
- Add, edit, and delete objects from an array.
- Use loops to interact with objects programmatically.

---

## 🎯 Learning Objectives

By completing this project, you will learn:
1. How to define and use classes in Java.
2. How to create and manage arrays of objects.
3. How to perform operations like adding, editing, and deleting objects in an array.
4. How to use IntelliJ IDEA to run and debug Java programs.

---

## 🚀 Project Features

- **Class Definition**: Define a `Penguin` class with attributes such as name, species, age, and weight.
- **Object Array**: Learn how to use `ArrayList` to store and manage penguins.
- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on the penguin objects.
- **Console Output**: View detailed outputs in the console to verify the program’s behavior.

---

## 📚 Prerequisites

Before starting, ensure you have:
1. **Java Development Kit (JDK)** installed (minimum version 8).
2. **IntelliJ IDEA** or any other Java IDE installed.
3. Basic knowledge of Java syntax and OOP concepts.

---
```java
import java.util.ArrayList;

public class PenguinManager {
    public static void main(String[] args) {
        ArrayList<Penguin> penguins = initializePenguins();
        System.out.println("All Penguins:");
        printAllPenguins(penguins);

        System.out.println("\nEditing a Penguin:");
        editPenguin(penguins, "Pingo", 6, 12.5);

        System.out.println("\nPenguins after editing:");
        printAllPenguins(penguins);

        System.out.println("\nRemoving a Penguin:");
        removePenguin(penguins, "Lolo");

        System.out.println("\nPenguins after removal:");
        printAllPenguins(penguins);
    }

    public static ArrayList<Penguin> initializePenguins() {
        ArrayList<Penguin> penguins = new ArrayList<>();
        penguins.add(new Penguin("Pingo", "Emperor", 5, 10.2));
        penguins.add(new Penguin("Lolo", "Rockhopper", 3, 8.3));
        penguins.add(new Penguin("Mimi", "Chinstrap", 4, 9.7));
        penguins.add(new Penguin("Kiki", "Adélie", 6, 11.1));
        penguins.add(new Penguin("Bobo", "Gentoo", 2, 7.8));
        return penguins;
    }

    public static void printAllPenguins(ArrayList<Penguin> penguins) {
        for (Penguin penguin : penguins) {
            penguin.printPenguin();
        }
    }

    public static void editPenguin(ArrayList<Penguin> penguins, String name, int newAge, double newWeight) {
        for (Penguin penguin : penguins) {
            if (penguin.getName().equals(name)) {
                penguin.editPenguin(name, newAge, newWeight);
                return;
            }
        }
        System.out.println("Penguin with name " + name + " not found.");
    }

    public static void removePenguin(ArrayList<Penguin> penguins, String name) {
        penguins.removeIf(penguin -> penguin.getName().equals(name));
        System.out.println("Removed Penguin with name " + name + ".");
    }
}

```
    enter code here

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/penguin-manager.git
cd penguin-manager
#
