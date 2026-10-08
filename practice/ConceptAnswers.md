# Week 9 Concept Answers

## 1. Abstraction
Abstraction means showing only the essential operation to the user while hiding the internal implementation details. For example, in a food-delivery app, the user selects a restaurant, chooses food, and pays; the internal database operations, payment processing, and order-routing details are hidden.

## 2. Abstraction vs Encapsulation
Abstraction focuses on what an object does and hides implementation complexity. Encapsulation bundles data and methods together and controls access to the data. A class can use abstraction through methods that expose required operations while using private fields and public methods to protect its internal data.

## 3. Constructor in an Abstract Class
An abstract class cannot be instantiated directly, but it can have a constructor to initialize common fields shared by subclasses. The constructor runs when an object of a concrete subclass is created, as part of the subclass object creation process.

## 4. Restrictions on Abstract Methods
- private: an abstract method must be overridden by a subclass, but a private method is not inherited/overridden.
- static: static methods belong to the class and are not overridden polymorphically.
- final: a final method cannot be overridden, which conflicts with the requirement that an abstract method be implemented by a subclass.

## 5. Diamond Problem
The diamond problem occurs when multiple inheritance can give a class two possible inherited implementations or states through the same ancestor. Java avoids this for classes by allowing a class to extend only one class. Java permits multiple interfaces because interface conflicts can be resolved explicitly by overriding conflicting default methods.
