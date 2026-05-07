import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n =sc.nextInt();
        System.out.println("Number of series : "+n);
        int result=0;
        while(n>0){
            int r=n%10;
            n/=10;
            result=result*10+r;
        }
        System.out.println(result+" Reversed number ");
    }
}
