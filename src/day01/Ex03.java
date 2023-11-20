package day01;

public class Ex03 {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            System.out.println("*****");
        }

        for (int i=0; i<5; i++) {
            String k = "";
            for (int j=0; j<=i; j++) {
                k = k + "*";
            }
            System.out.println(k);
        }

        for (int i=0; i<=4; i++) {
            String k = "";
            for (int j=4; j>=i; j--) {
                if (j!=i)
                    k = k + " ";
                else
                    for (int m=0; m<i*2+1; m++) {
                        k = k + "*";
                    }
            }
            System.out.println(k);
        }
    }
}
