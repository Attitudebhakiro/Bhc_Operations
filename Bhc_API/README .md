How the Solution Works
Instructions for run/debug/test
PART A
Solutions for Part A questions are found in the package named PartA
Question 1
All requirements for Question 1 are found in the class QuestionOne.java
The comments put shows index for each requirement from 1 to 6
For testing sample data and implementation is found in the class PartAtest
with respective comments and print statements

Question 2
All requirements for Question 2 are found in the class QuestionTwo.java
For testing sample data and implementation is found in the class PartAtest
with respective comments and print statements

PART B
I chose Question 5
The solution is implemented through a REST API developed with Java Spring boot
Data Source:
Details for database configuration, port and credentials are in application.properties
The application was developed with MySQL database
The exported database (bhc.sql file) with some dummy data is included in the project directory

The method loadPallet is found in PartBqsn5.java class with the following location URL
/Bhc_API/src/main/java/com/Bhc_Ops/Bhc_API/controller/PartBqsn5.java

The method makes use of other classes such as (Pallet and Bale) Entity model and (PalletRepository and BaleRepository) repository
To run the system database should be configured as mentioned earlier
The object Pallet (with list of bales) is passed through end point http://localhost:2250/loadPallet
The end point can be put on postman or browser for testing
To test using this end point and/URL run the whole API that is through running BhcApiApplication.java