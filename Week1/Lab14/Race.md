# In the provided method in `Race.java`, implement the logic to the following coding problem

## Race to the Ice Cream Truck

Two kids and an ice cream truck are at various positions on a line. You will be given their starting positions. Your task is to determine which kid will reach the truck first, assuming the truck does not move and the kids are running at equal speed. If the kids arrive at the truck at the same time, the truck will be allowed to move to the next corner while the kids fight over the last cone.

## Complete the `twoKidsAndATruck` method below

The method will take in the positions of kid 1 `k1`, kid 2 `k2`, and the truck `t`

The method should return the String

-   "Kid 1" if the first kid is closer to the truck
-   "Kid 2" if the second kid is closer to the truck
-   "Truck" if the kids are the same distance from the truck

## Example

```
k1=7;
k2=4;
t=5;
```

Explanation:

The kids are at positions 7 and 4, the truck is at position 5.

-   Kid 1 is 2 units away
-   Kid 2 is 1 units away
-   There for Kid 2 should arive first, and the method should return the String "Kid 2"

(Hint) Look into the Java Math class to see if there is a way to find the absolute value for the distance between the kids and the truck

## Once you have completed the logic in the method provided in `Race.java`, compile the `Race.java` file

## Run the Lab14.class file to see if you have successfully completed the lab
