import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
      System.out.println(Arrays.toString(arr));

      displayMenu(arr);

    }
  //method b
  public static void displayMenu(int[] arr){
    int choice;
    Scanner in = new Scanner(System.in);

    do {
      System.out.printf("1.Find the minimum of the array\n2.Find the maximum of the array\n3.Find the differences from the average of the array \n4.Find the sum of elements with odd and even-numbered indexes \n5.Exit\n");
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      if ( choice == 1 ){
        System.out.printf("minimum number:%d%n",findMin(arr));
        
      }
      else if ( choice == 2 ){
        System.out.printf("maximum number:%d%n",findMax(arr));
        
      }
      else if ( choice == 3 ){
        System.out.printf("differences from average %s%n",Arrays.toString(findDifferences(arr)));
        
      }
      else if ( choice == 4 ){
        System.out.printf("sum of elements with odd-numbered indexes: %d%nsum of elements with even-numbered indexes: %d%n",sumOfOddsAndEvens(arr)[0],sumOfOddsAndEvens(arr)[1]);
        
      }
      
    }while(choice != 5);
  }

  //method c
  public static int findMin(int[] arr){
    int minNum;
    minNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (minNum > arr[i]) {
        minNum = arr[i];
      } 
    }
    return minNum;
  }

  public static int findMax(int[] arr){
    int maxNum;
    maxNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (maxNum < arr[i]) {
        maxNum = arr[i];
      } 
    }
    return maxNum;
  }
  //method d
  public static double[] findDifferences(int[] arr){
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    double[] differences = new double[arr.length];
    for (int i = 0; i < arr.length; i++) {
      differences[i] = Math.round(sum / arr.length) - arr[i];
    }
    return differences;
  }

  //method e
  
    public static int[] sumOfOddsAndEvens(int[] list) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < list.length; i++) {
            if(i % 2 == 1) {
                oddSum += list[i];
            }
            else {
                evenSum += list[i];
            }
        }
        int[] array = {oddSum, evenSum};
        return array;
    }
}
