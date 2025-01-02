public class TemperatureConverter {

    public TemperatureConverter(){
        System.out.println("Convert Temperature: Convert a temperature from Celsius to Fahrenheit using the formula (Celsius × 9/5) + 32.");
    }

    public static void main(String[] args) {
        float Celsius= 60;
        float Fahrenheit = (Celsius *9/5)+32;
        float Kelvin = 273+Celsius;

        System.out.println(Fahrenheit);
        System.out.println(Kelvin);
    }
    
}
