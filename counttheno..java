import java.util.*;
public class counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=(int)Math.log10(n)+1;
        System.out.println(count);
    }
}
