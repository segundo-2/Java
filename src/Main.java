import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] n= {1,2,3,4};

        int l=n.length;
//        Arraysrray(n);
        arr(n);
    }
    public static <n> void Arraysrray(Arrays n){
        for(int i=1; i<=4; i++){
            System.out.println(i+i);

        }
    }
    public void static int arr(int[] n){
        int i;
        int c=0;
        for(i=1; i<n.length; i++){
            c=c+i;
            System.out.println(c);
        }
        int av=c/n.length;
    }
}
