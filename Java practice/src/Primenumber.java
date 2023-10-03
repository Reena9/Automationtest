import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
       /* System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();*/


        for (int c = 1; c <= 100; c++) {
            int b = 0;
            for (int i = 2; i <= c/2; i++)
            {
                if (c % i == 0)
                {
                    System.out.println(c + "" +"Not a prime number");
                    b = 1;
                    break;
                }
            }
            if (b == 0) {

                System.out.println(c + "Prime number");

            }

        }
    }
       }


