import java.util.*;
public class fact {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int fact=1;
       while(n>1){
        fact=n*(n-1)*fact;
        n=n-2;
       }
       System.out.println(fact);
       } 
    }

