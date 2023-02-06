import java.util.*;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number \n");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print(a);
            System.out.print(" is greater ");

        }
   
       else if (b>a && b>c) {
        System.out.print(b);
        System.out.print(" is greater");
       } 
       
       else {
        System.out.print(c);
        System.out.print(" is greater ");
       }

    }
}
