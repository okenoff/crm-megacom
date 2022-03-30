import java.util.Scanner;

public class Array1179 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int p = 0;
        int im = 0;

        for (int i = 0; i < 15; i++) {
            int a = scan.nextInt();
            if (a % 2 == 0 ){
                par[p] = a;

                System.out.println("par[%d]= \n" + par[p]);
            }

            }
        for (int i = 0; i < 15; i++) {
            int a = scan.nextInt();
            if (a % 2 != 0){

                impar[im] = a;

                System.out.println("impar[%d}= \n" + impar[im]);

        }
        }
    }
}
