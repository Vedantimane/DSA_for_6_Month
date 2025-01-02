public class NumberCheck {
    
    public NumberCheck(){
        System.out.println("Check if a Number is Positive, Negative, or Zero: Create a program that checks whether an input number is positive, negative, or zero.");
    }

    public static void main(String[] args) {
        int number=-85;

        if (number ==0) 
        {System.out.println("Zero");
            
        }
        if (number>=0) {
            System.out.println("Positive");
            
        } else {
            System.out.println("Negative");
            
        }
    }
}
