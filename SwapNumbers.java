public class SwapNumbers {

    public SwapNumbers(){
        System.out.println("Swap Two Numbers Without a Third Variable: Swap the values of two numbers using arithmetic operations.");
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        
        
        System.out.println(a);
        System.out.println(b);
    }
    
}
