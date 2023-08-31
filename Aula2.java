import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args){
        int x;
        System.out.println("Digite um número qualquer");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        if (x == 5){
            System.out.println("o numero e igual a 5");

        }else {
            if (x == 200) {
                System.out.println("o número e igual a 200");
            }else {
                if (x == 400) {
                    System.out.println("o número e igual a 400");
                }else {
                    if (500 < x && x < 1000) {
                        System.out.println("o número esta no intervalo entre 500 e 1000");
                    }else {
                        System.out.println("o número esta fora dos escopos");
                    }
                }
            }
        }




    }






}
