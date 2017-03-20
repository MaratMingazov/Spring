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

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Classes.png" width="500">

Step 1. Create IntelliJ IDEA new Gradle project.

Step 2. Add Dependencies.

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Dependencies.png" width="500">

* Spring-context provides core functionality
* Spring-data-mongodb provides a model for data access
* aspectjweaver - actually "weaves" together the aspects/point-cuts/join-points in terms of AOP

Step 3. Create Book.java class

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Book.png" width="500">

Step 4. Create BooksDAO.java class

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/BooksDAO.png" width="500">

This class uses @Autowired MongoOperations object. So we need to declare MongoOperations Bean in our application-context.xml

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Context1.png" width="500">

MongoTemplate implements MongoOperations interface and uses dbFactory to specify database credentials. We use mongodb database. The 'property-placeholder' specifies the location of credentials file. In our case this is database.properties file.

Step 5. Create database.properties file. 

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Database.png" width="500">

You can use this credentials or your own. 

Step 6. Create LibraryService.java class

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/LibraryService.png" width="500">

This class use @Autowired  BooksDAO object. So we need to declare BooksDAO Bean in our application-context.xml
We also declare the LibraryService.java class as Bean.

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Context2.png" width="500">

The full content of application-context.xml is presented below:

<img src="https://raw.githubusercontent.com/MaratMingazov/Spring/master/images/Context2.png" width="500">

