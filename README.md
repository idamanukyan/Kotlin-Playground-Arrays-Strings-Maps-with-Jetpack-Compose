📚 Kotlin Playground – Arrays, Strings & Maps with Jetpack Compose

An educational Kotlin Android app built with Jetpack Compose.
The project demonstrates core Kotlin programming concepts like arrays, lists, string manipulation, maps, user input handling, and number classification, while rendering results in a simple Compose UI.

🎯 Overview

This project was created as a homework/learning exercise to explore:

Arrays and Lists

String operations

Map iteration

Number classification logic

Basic OOP with Person and Person2 classes

User input with Scanner

Date and time formatting

Error handling (division by zero)

UI rendering with Jetpack Compose

✨ Features

Array & List Demo
Displays elements from an integer array and a string list.

String Manipulation

Concatenation

Substring extraction

Lowercase & Uppercase conversion

Map Iteration
Iterates over a fruit-length map and prints key–value pairs.

Number Classification
Classifies numbers as Positive, Negative, or Zero.

Person & Person2 Classes

Person holds simple attributes.

Person2 determines a life stage (Kind, Teenager, Erwachsener).

Date & Time
Formats and prints the current date and time in German locale.

Error Handling
Safe division with error handling for division by zero.

UI with Jetpack Compose
Results are displayed in a Material 3 Compose UI.

📂 Project Structure

MainActivity – App entry point, executes logic and sets Compose content.

ArrayAndList – Composable displaying arrays and lists.

StringManipulation – Composable for string transformations.

MapIteration – Composable printing map key–value pairs.

NumberClassification – Composable showing classification results.

Person & Person2 – Simple Kotlin classes demonstrating OOP concepts.

Helper Functions – buildMapOutput, classifyNumber, divideNumbers.

⚙️ Tech Stack

Language: Kotlin

UI Framework: Jetpack Compose + Material 3

Architecture: Simple MVVM style with ViewModel usage potential

Utilities: Java Scanner, SimpleDateFormat, Kotlin collections

🚀 Getting Started

Clone the repository:

git clone https://github.com/<your-username>/KotlinPlaygroundApp.git


Open in Android Studio.

Build and run on an emulator or Android device.

📊 Example Output
Array elements: 10, 100, 1000, 10000, 100000
List elements: liebe, ist, fur, alle, da

Original String: Hallo, Leute!
Concatenated String: Hallo, Leute!Willkommen auf der Erde
Substring: Leute!
Lowercase String: hallo, leute!
Uppercase String: HALLO, LEUTE!

Result for 15: Positive
Result for -13: Negative
Result for 10: Positive

Map:
Apfel: 5
Banane: 6
Kirsche: 7
Dattel: 6
Holunder: 8

📜 License

This project is licensed under the MIT License – see LICENSE
 for details.
