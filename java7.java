import java.lang.*;
import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        int x=-0b1010;

        int y;
        y=x>>>1;

        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%32s",Integer.toBinaryString(y)));
    }
}//Thank you for watching.
