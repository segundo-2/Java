import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] n= {1,2,3,4};

        arr(n);
    }

    public static void arr(int[] n){
        int i;
        int c=0;
        for(i=1; i<=n.length; i++){
            c=c+i;
            System.out.println(c);
        }
        int av=c/n.length;
        System.out.println("the average is "+av);
    }
}
