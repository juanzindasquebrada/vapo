import java.util.Scanner;

public class atletas {
    public static void main(String[] args) {
        int[][] a = new int[5][10];
        int l, c, ma, x;
        ma=0;

        for(l=0; l<5; l++) {
            for (c = 0; c < 10; c++) {
                System.out.println("Digite a altura do " + c + 1 + " atleta da " + l++ + " delegacao ");
                Scanner teclado = new Scanner(System.in);
                a[l][c]= teclado.nextInt();

                if (ma<a[l][c])
                    ma=a[l][c];
            }
        }
        System.out.println("A altura do maior atleta é" +ma);








    }
}