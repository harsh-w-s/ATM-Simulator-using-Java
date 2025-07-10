🏦 Bank ATM Simulator
A console-based Java application that simulates the functionality of an ATM. Features include account authentication, balance inquiry, deposit, withdrawal, and PIN verification — all built using core Java concepts and connected to a MySQL database.

📌 Features
✅ User authentication via PIN

💰 Balance inquiry

💵 Deposit and withdrawal

🔐 PIN verification and validation

🗃️ Data persistence using MySQL

🧠 Follows Object-Oriented Programming principles

🛠️ Tech Stack
Language: Java

Database: MySQL

IDE: IntelliJ IDEA / Eclipse

Build Tool: Maven (optional)

Tools Used: MySQL Workbench, Git

🧩 Project Structure
bash
Copy
Edit
ATM-Simulator/
├── src/
│   ├── Main.java
│   ├── ATM.java
│   ├── Account.java
│   └── DatabaseConnector.java
├── sql/
│   └── atm_schema.sql
├── README.md
🗄️ Database Schema
sql
Copy
Edit
CREATE DATABASE atm_simulator;

USE atm_simulator;

CREATE TABLE accounts (
    account_number INT PRIMARY KEY,
    pin INT NOT NULL,
    balance DECIMAL(10, 2) NOT NULL
);
🚀 How to Run
Clone this repository

bash
Copy
Edit
git clone https://github.com/harsh-w-s/ATM-Simulator.git
cd ATM-Simulator
Import into your Java IDE

Setup the MySQL database

Create the schema using atm_schema.sql

Add some test account data manually

Update your DB credentials

Open DatabaseConnector.java and add your username and password

Run the project

Start with Main.java in your IDE

👨‍💻 Example Account for Testing
Account Number	PIN	Balance
1001	1234	5000.00

📷 Screenshots (optional)
You can add screenshots like:

markdown
Copy
Edit
> Welcome to ATM!
> Enter your Account Number:
> Enter your PIN:
> 1. Check Balance
> 2. Deposit
> 3. Withdraw
> 4. Exit
📚 Concepts Practiced
Java OOP (Classes, Objects, Encapsulation)

Exception Handling

JDBC (Java Database Connectivity)

SQL Queries

Console I/O Handling

✍️ Author
Harshwardhan Solanki
GitHub | LinkedIn

💡 Future Improvements
Admin login for creating new accounts

Transaction history log

GUI version using JavaFX or Swing
