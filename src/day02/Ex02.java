package day02;

public class Ex02 {
    public static void main(String[] args) {

        int sum = 0;
        for ( int i=1; i<=100; i++) {
            if ( i%2 != 0 )
                sum = sum + i;
//            System.out.println( "i%2" + i%2 );
            System.out.println( "i=" + i + "      sum " + sum );

        }
        System.out.printf("Sum : " + sum );
    }

}