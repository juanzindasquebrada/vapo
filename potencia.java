public class potencia {
    public static void main(String[] args) {
        int valor = 7, exp = 3;
        pot(valor, exp);

        System.out.println("o numero e " + pot(valor, exp));


    }
    public static int pot(int b, int e) {
        if (e == 0)
            return 1;
        else
            return b * pot(b, e - 1);
    }



}
