ALGORITHM FOR THIS CODE:
Input:
An array arr of length n.
An integer d representing the number of left rotations.
Output:
The array after d left rotations.
Steps:
1).Handle Special Cases:
If d is 0 or equal to the length of the array, return immediately since no rotation is needed.
2).Calculate Effective Rotations:
Compute d % n to handle cases where d is greater than n.
3).Perform Rotations:
Repeat the following d times:
Store the first element of the array in a temporary variable.
Shift all elements of the array one position to the left.
Place the temporary variable in the last position of the array.
4).Return the Result.
