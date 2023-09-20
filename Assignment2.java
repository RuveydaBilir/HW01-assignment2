class Assignment2{
  //method a

  //method b

  //method c

  //method d
  
  public static double[] findDifference (int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    double[] differences = new double[arr.length];
    for(int i = 0; i < arr.length; i++){
      differences[i] = arr[i] - sum;
    }
    return differences;
  }

  //method e
  
}
