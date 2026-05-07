import java.util.Scanner;
// Check the alphabhet upper/lower case
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(3);

        if(ch>='a' && ch<='z'){
            System.out.println(ch+ " is lower case");
        }
        else{
            System.out.println(ch+ " is upper case");
        }

    }
}
