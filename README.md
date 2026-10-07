# Practical Assignment

## Student Information

**Full Name:** Tanatswa Definite Muvezwa  
**Registration Number:** H250627G  
**Department:** Software Engineering 1.2

## About This Repository

This repository contains my Object-Oriented Programming in Java practical assignment.

## Technologies Used

- Java
- Object-Oriented Programming

## Project

The practical assignment will be developed and documented in this repository.
## Files

- `Account.java` – Abstract base class for bank accounts.
- `SavingsAccount.java` – Implements savings account withdrawal rules and interest.
- `CurrentAccount.java` – Implements overdraft and monthly maintenance fee rules.
- `BankDemo.java` – Demonstrates polymorphism using a list of Account objects.
- `sample-output.txt` – Contains the sample program output.

## OOP Concepts Demonstrated

- Abstraction
- Inheritance
- Polymorphism
- Method overriding
- Encapsulation
- Abstract classes
- ArrayList and List
- Exception-free input validation

## Key Requirements Demonstrated

- Deposits reject non-positive amounts.
- Savings accounts maintain a minimum balance.
- Savings accounts receive monthly interest.
- Current accounts allow overdrafts within a specified limit.
- Current accounts are charged a monthly maintenance fee.
- A polymorphic `List<Account>` is used without casting.
- Different overridden methods execute through the `Account` reference.

## Conclusion

This practical assignment demonstrates how abstraction, inheritance and polymorphism can be used to model different bank account types while allowing them to share common behaviour.
