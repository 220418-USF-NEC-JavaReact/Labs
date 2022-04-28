# In the `script.sql` file write the correct SQL statements to accomplish the following:
## The local database file will be created in your C:\Users\<USERNAME>\ you can delete it after the test lab is complete

Remember each of your SQL statements MUST end in a semicolon

For the decimals to work correctly you must specify the precision and scale, otherwise they will be rounded up by the test runner

## Create a Table

Assume you have a PostgreSQL database already, you are tasked with created a table to song information

Using DDL and PostgreSQL syntax create a table called `songs` with the following properties:

`id` which is a whole number and primary key
`name` which is a string and cannot be null
`artist` which is a string and cannot be null
`albumn` which is a string and cannot be null
`duration` which is a decimal number

## Insert values into the `songs` table

Create an entry in the database for each one of these song objects

```

{
    id: 1,
    name: "In The End",
    artist: "Linkin Park"
    album: Hybrid Theory
    duration: 3.62
}
{
    id: 2,
    name: "Kryptonite"
    artist: "3 Doors Down"
    album: "The Better Life"
    duration: 3.9
}
{
    id: 3,
    name "Play It Again"
    artist: "Luke Bryan"
    album: "Crash My Party"
    duration: 3.78
}
{
    id: 4,
    name: "Austin"
    artist: "Blake Shelton"
    album: "Blake Shelton"
    duration: 3.83
}
{
    id: 5,
    name: "Mr. Brightside"
    artist" "The Killers"
    album: "Hot Fuss"
    duration: 3.72
}
{
    id: 6,
    name: "Stacy's Mom"
    artist: "Bowling For Soup"
    album: "Ive Never Done Anything Like This"
    duration: 3.22
}

```

## Get all of the data from the table

Finally, add one last SQL command to retrieve all of the songs from the `songs` table

## After you have completed all of the SQL commands in the script, run the `Lab19.jar` file to test your script