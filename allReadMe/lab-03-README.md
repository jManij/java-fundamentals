
[Link to Solution: ](../basicLibrary/src/main/java/basicLibrary/Library.java)

# Challenge Summary
Lab 03: Maps, File I/O, and Testing

## Challenge Description
The lab consists of three feature tasks: analyze weather data, tallying
election and linter.
This part of the code implements first two functions.

#Analyze weather data: It iterates through 2d array to find the min and max 
element in the array. It sets all the elements into HashSet. Finally,
it iterates from min to max and checks if that value exists in hashset.
It it does not exist, it prints out the values that are not in the set.

#Tallying Election: It takes a list of Strings and returns one strings to 
show who got the most votes.

#linter : It reads in js files via a PATH provided as a string. It reads
each line on the file to see if the line is missing ';'. It skips the cases
where the line is empty, or the line ends with an opening curly brace, 
closing curly brace, or it contains if or else. 
