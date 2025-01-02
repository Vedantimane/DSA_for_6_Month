public class SimpleInterestCalculator {

    public SimpleInterestCalculator(){
        System.out.println("Calculate Simple Interest: Write a program to calculate simple interest using the formula (Principal * Rate * Time) / 100.");
    }

    public static void main(String[] args) {
        int Principal=80000 ;
        int Rate=17;
        int time=6;
        float interest = (Principal * Rate * time)/100;
        

        System.out.println(interest);
    }
    
}
