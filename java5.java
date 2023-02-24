import java.lang.*;
import java.util.Scanner;

class java5
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        int a,b,c;
        double r1,r2;

        System.out.println("Enter value of a, b and c");
        a = s1.nextInt();
        b = s1.nextInt();
        c = s1.nextInt();

        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Root are "+r1+"  "+r2);

    }
}//Thank you for watching