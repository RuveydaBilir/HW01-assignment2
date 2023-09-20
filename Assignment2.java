class Assignment2{
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
