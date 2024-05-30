public class page15 {
    public static void main(String[] args) {
        Math m = new Math();

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 0;
        
        System.out.println(m.d);


    }
}

class Math{
    public void (int a,int b,int c,int d) {
        if (a<b && a<c) {
            d=a;
        }
        else if (b<a && b<c) {
            d=b;
        }
        else if (c<a && c<b) {
            d=c;
        }

    }
}
