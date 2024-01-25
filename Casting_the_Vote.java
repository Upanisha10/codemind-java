import java.util.*;
public class My{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int voterAge=sc.nextInt();
        if(voterAge>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}