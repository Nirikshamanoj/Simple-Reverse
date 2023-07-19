import java.util.Scanner;
public class SimpleReverse {
    static String stringReverse(String A)
    {
        String reverse="";
        for(int i=A.length()-1;i>=0;i--)
        {
            reverse+=A.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String reversed=stringReverse(A);
        System.out.println(reversed);
    }
}
