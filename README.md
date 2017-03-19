# Simple Library Management System
[based on Spring.Core, Spring.Data, and Spring.AOP]

## Tutorial

The goal of this tutorial is step by step develop the simple library management system with following business rules (BR):
* BR1 : Each book in the library has two attributes : «author» and «title».
* BR2 : Library service allow us to add new book in the library.
* BR3 : We can get the list of all books in the library.
* BR4 : System use a database to store information about books.
* BR5 : Library Service must have Logging Service  

The class diagram of the system is presented below

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Classes.png" width="800">

Step 1. Create IntelliJ IDEA new Gradle project.

Step 2. Add Dependencies.

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Dependencies.png" width="800">

* Spring-context provides core functionality
* Spring-data-mongodb provides a model for data access
* aspectjweaver - actually "weaves" together the aspects/point-cuts/join-points in terms of AOP

Step 3. Create Book.java class
