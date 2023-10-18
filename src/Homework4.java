package src;
import java.util.Scanner;


public class Homework4 {
    public static int gcd1(int m, int n) {
        if(m==0) {return m;}
        if(m%n == 0) {return n;}
        return gcd1(n, m%n);
    }
    public static int gcd2(int m, int n){
        if ( m == 0 ) { return m; }
        else if ( m % n == 0 ) { return n; }
        else {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요: ");
        int m = sc.nextInt();
        System.out.print("두번째 수를 입력하세요: ");
        int n = sc.nextInt();

        int result = gcd1(m,n);
        System.out.println("최대 공약수: " + result);

    }
}
