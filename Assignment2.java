class Assignment2{
    

  //method a

  //method b

  //method c
  public static int findMin(int[] arr){
    int minNum;
    minNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (minNum < arr[i]) {
        minNum = arr[i];
      } 
    }
  }

  public static int findMax(int[] arr){
    int maxNum;
    maxNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (maxNum < arr[i]) {
        maxNum = arr[i];
      } 
    }
  }
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
  
    public int[] sumOfOddsAndEvens(int[] list) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] % 2 == 1) {
                oddSum += list[i];
            }
            else {
                evenSum += list[i];
            }
        }
        int[] arrayOfSums = {oddSum,evenSum};
        return arrayOfSums;
    }
}
