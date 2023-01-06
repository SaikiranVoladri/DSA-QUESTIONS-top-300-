class MaximumAndMinimumElementInAnArray{


  // This method takes an array of integers as input and returns the maximum value in the array.
  public static int printMaximum(int arr[]) {
    // Initialize max to the minimum value which is a negative number
    int max = Integer.MIN_VALUE;
    
    // Iterate over the input array
    for (int i = 0; i < arr.length; i++) {
      // If the current element is greater than max, update max 
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    // Return the maximum value
    return max;
  }
  // this method takes  linear time complexity of n times(upto array length)

  // This method takes an array of integers as input and returns the minimum value in the array.
  public static int printMinimum(int arr[]) {
    // Initialize min to the maximum value that have positive number
    int min = Integer.MAX_VALUE;

    // Iterate over the input array
    for (int i = 0; i < arr.length; i++) {
      // If the current element is less than min, update min 
      if (min > arr[i]) {
        min = arr[i];
      }
    }

    // Return the minimum value
    return min;
  }
  //the above method also contains linear time complexity which is O(n)

  public static void main(String[] args) {
    // Define an array of integers
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    
    // Call the printMaximum and printMinimum methods and store the results
    int max = printMaximum(arr);
    int min = printMinimum(arr);

    // Print the results
    System.out.println("mimimum Value in an array is " + min);
    System.out.println("maximum value in an array is " + max);
  }
}

}