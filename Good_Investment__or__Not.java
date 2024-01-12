import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int interestRate = scan.nextInt();
        int inflationRate = scan.nextInt();
        if(interestRate >= (2*inflationRate))
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}