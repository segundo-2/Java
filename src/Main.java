import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner something = new Scanner(System.in);
        int n;
        double d;
        String txt;
        System.out.println("Enter number: ");
        n=something.nextInt();
        System.out.println("Enter a double number: ");
        d=something.nextDouble();
        System.out.println("Enter any text: ");
        txt=something.next();
        if(n>0){
            System.out.println("the number is positive");
        }
        else if(n<0){
            System.out.println("the number is negative");
        }
        else{}
        System.out.println("The number you enterd is "+n);
        System.out.println("The double number you enterd is "+d);
        System.out.println("The text you enterd is "+txt);


        // this one
        if(txt.equals("hamed")){
            System.out.println("hello");

        }
    }

}