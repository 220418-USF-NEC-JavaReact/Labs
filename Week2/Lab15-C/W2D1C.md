# In the provided method in `Triplets.java` implement the logic to the following coding problem

## Compare Triplets

Two associates each created one problem for Ethan. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, orginality, and difficulty.

The rating for associate 1 is the triplet `a = (a[0], a[1], a[2])`, and the rating for associate 2 is the triple `b = (b[0], b[1], b[2])`

## Complete the `compareTriplets` method below:

The method will take in an `int[] a`, and `int[] b` which represent associate 1 and associate 2's problem scores respectively

Find the associates comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
- If a[i] > b[i] then associate 1 is awarded 1 point
- If a[i] < b[i] then associate 2 is awarded 1 point
- If a[i] = b[i] then neither associate is awarded a point

Store the comparison points in a new integer array, and return that array

## Example:

```
a = [5,6,7];
b = [3,6,10];

a[0] > b[0] associate 1 gets 1 point
a[1] = b[1] neither associate gets a point
a[2] < b[2] associate 2 gets a point

The integer array [1,1] is returned
```

## Once you have completed the logic, compile the `Triplets.java` file

## Run the Lab15.class file to see if you have successfully completed the lab