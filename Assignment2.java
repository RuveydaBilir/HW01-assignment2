class Assignment2{
    }

class Assignment2{
  //method a
  public static void main(String[] args) {
      int arraySize;
      int randomNumber;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the array size: ");
      arraySize = scan.nextInt();
      int[] arr = new int[arraySize];

      Random rand = new Random();

      for(int i=0; i<arraySize; i++){
        randomNumber = rand.nextInt(101);
        arr[i]=randomNumber;
      }

      displayMenu(arr);

    }
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

  //method e
  
    public void sumOfOddsAndEvens(int[] list) {
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
        System.out.println("Sum of the odd numbers is " + oddSum);
        System.out.println("Sum of the even numbers is " + evenSum);
    }
}
