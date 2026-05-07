import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        int a=0;
        int b=1;
        for(int temp=1;temp<=n;temp++){
         int c= b;
         b=a+b;
         a=c;
            System.out.println(a+" ");
        }
    }
}
