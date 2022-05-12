# Open the Lab24 folder in Intellij to begin the coding challenge
## The local database file will be created in your C:\Users\<USERNAME>\ you can delete it after the test lab is complete

The goal of this miniture coding challenge is to test your ability to use implement DAO layer functionality with the help of jdbc

Make sure you are editing code in the app > src > main folder and not the bin or build folder

## Provided Code:

Provided for you is a DaoDriver class which, when run sets up an embedded database for you with the following tables:

### address
| Keys | Column     | Datatype    |
|------|------------|----------   |
| PK   | address_id | int         |
|      | line_one   | varchar(64) |
|      | line_two   | varchar(16) |
|      | city       | varchar(24) |
|      | state      | varchar(2)  |
|      | zip        | int         |
|      | country    | varchar(32) |

### person
| Keys | Column  | Datatype    |
|------|---------|-------------|
| PK   | id      | int         |
|      | name    | varchar(64) |
|      | email   | varchar(96) |
|      | social  | int         |
| FK   | address | int         |

### Models

You are provided with two model classes, Person and Address, the databases above are designed based on these classes, your goal will be to persist instances of those classes into the database

### Daos

Provided are the interfaces outlining the functionality of the Dao classes
- We are really only focused on the CRUD functionality here

### Utility

Provided is a ConnectionUtil class, which provides you with a single connection to the embedded database. Use this connection in the dao classes to persist the data

## Challenge: Implement the DAO functionality provided

In the `AddressDAO` and `PersonDAO` classes complete the implementations for the interfaces to cary out the CRUD functionality specified

The models and tables also contain relations, so be sure to honor those relations

Play around/test your functionality in the DaoDriver class

### Hints

The Address field in user can start out as null, then be updated after the address is created in its own table
