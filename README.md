# AI Semantic Search Chatbot (Java)

## Overview

This project is a simple **AI-based chatbot application** built using Java and Java Swing.
The chatbot interacts with users through a graphical interface and retrieves the most relevant response from a small knowledge base using a **similarity-based ranking algorithm**.

Instead of strict keyword matching, the system compares the user query with stored questions and selects the **closest matching response**, simulating a basic **semantic search system**.

---

## Problem Statement

Traditional chatbots rely on simple keyword matching which often fails when the user asks a question in a slightly different way.

The goal of this project is to design a chatbot that:

* Accepts user questions
* Compares them with stored knowledge
* Ranks possible answers using similarity scoring
* Returns the most relevant response

---

## Features

* Interactive chatbot interface
* Java Swing GUI
* Knowledge base driven responses
* Similarity ranking algorithm
* Basic Natural Language Processing concept

---

## System Workflow

User Input
↓
Text Processing
↓
Similarity Calculation
↓
Response Ranking
↓
Best Answer Selected
↓
Displayed in Chat Interface

---

## Technologies Used

* Java
* Java Swing
* Basic NLP similarity algorithm
* Collections Framework (List, Set, HashSet)

---

## Project Structure

AI-Semantic-Chatbot-Java
│
├── AIChatbot.java
└── README.md

---

## How to Run the Project

### Step 1: Compile the program

javac AIChatbot.java

### Step 2: Run the chatbot

java AIChatbot

A chatbot window will open where users can start interacting with the system.

---

## Example Questions

You can try asking the chatbot:

hi
hello
what is ai
what is java
what is spring boot
what is machine learning
thanks
bye

---

## Example Interaction

User: What is AI?
Bot: Artificial Intelligence is the simulation of human intelligence by machines.

User: What is Java?
Bot: Java is a popular object-oriented programming language used for building applications.

---

## Future Improvements

This project can be extended by implementing:

* Vector embeddings for deeper semantic search
* Integration with AI APIs
* Web-based chatbot interface
* Machine learning based intent detection
* Larger knowledge base

---

## Author

Akshita Sharma
Computer Science Student
