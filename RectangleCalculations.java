public class RectangleCalculations {

    public RectangleCalculations(){
        System.out.println("Calculate Area and Perimeter of a Rectangle: Write a program to compute the area and perimeter of a rectangle using the inputs length and breadth.");
    }

    public static void main(String[] args) {
        int length= 30;
        int width = 20;
        int area = length*width;
        int perimeter = 2*(length+width);
        System.out.println(area);
        System.out.println(perimeter);

    }
    
}
