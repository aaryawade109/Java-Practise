import java.util.Scanner;

public class Repetation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int  n =sc.nextInt();
        System.out.println("Number of series : "+n);
        int a = sc.nextInt();
        System.out.println(a+" is selected number ");
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==a){
                count+=1;
            }
            n=n/10;
        }
        System.out.println(a+ " is repeated "+count+ " times ");

    }
}
