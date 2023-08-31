import java.util.Scanner;

public class ebert {
    public static void main(String[] args){
        int i;
        System.out.println("Digite sua idade");
        Scanner teclado = new Scanner(System.in);
        i = teclado.nextInt();
        if (i > 0 && i < 19){
            System.out.println("Menor de idade");
        }else{
            if (i > 17 && i < 65){
                System.out.println("Maior de idade");
            }else{
                if (i > 64){
                    System.out.println("Idoso");
                }else{
                    System.out.println("Valor Invalido");
                }
            }
        }

    }
}
