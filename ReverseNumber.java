public class ReverseNumber {
    public ReverseNumber(){
        System.out.println("Reverse a Number: Reverse the digits of an input number (e.g., 1234 → 4321)");
    }

    public static void main(String[] args) {
      
        int number = 1234;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;  
            number = number / 10;  
        }

        System.out.println("Reversed number: " + reversed);
    }
}
