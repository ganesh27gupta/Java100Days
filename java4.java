import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        float base, height, area;
        System.out.print("Enter base and Height:- ");

        Scanner s1 = new Scanner(System.in);
        base = s1.nextFloat();
        height = s1.nextFloat();

        area = 1f / 2f * base * height;
        System.out.print("Area of triangle is :- " + area);
    }

}//Thank you for watching 