import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int fuel = scan.nextInt();
        int distance = scan.nextInt();
        if((fuel * 5) >= distance)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}