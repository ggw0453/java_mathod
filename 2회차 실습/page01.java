import java.util.Scanner;

public class page01 {
    public static void main(String[] args) {
        Math m = new Math();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 x : ");
        int num1 = sc.nextInt();
        m.num(num1);
        
        System.out.println("singOf(x)는 "+m.num(num1)+"입니다.");
        sc.close();
    }
}
class Math {
    int num(int num1) {
        if (num1>0) {
            num1=1;
        }
        if (num1==0) {
            num1=0;
        }
        if (num1<0) {
            num1=-1;
        }
        return num1;
    }
}
