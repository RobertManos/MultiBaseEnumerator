# MultiBaseEnumerator
This program takes the numbers entered and uses them as the bases for the corresponding digits. If '2 3' is entered all numbers with a binary first digit and a ternary second digit will be returned. 
The algorithm accomplishes this recursively. It takes the numbers entered in as an ArrayList and in the base case generates a linked list for every digit 0 to n, and in the recursive case, it returns for the numbers 0 to n: a new list consisting of the current number and every item in the recursively passed linked list.
