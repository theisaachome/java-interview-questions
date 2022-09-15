class Test {

  public static void main(String[] args) {
    int numbers = 12345;
    int reverse = 0;
    int remainder = 0;
    int temp = numbers;
    while (temp > 0) {
      // get the last Digit from the number
      remainder = temp % 10;
      reverse = reverse * 10 + remainder;
      temp /= 10;
    }
    System.out.println("Reverse : " + reverse);
  }
}