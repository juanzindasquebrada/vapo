public class aula3 {
    public static void main(String[] args) {
        int valor = 8;
        fatorial(valor);

        System.out.println("o numero fatorial e " + fatorial(valor));


    }
    public static int fatorial(int v){
        if (v == 0)
            return 1;
        else
            return v * fatorial(v-1);




    }
}
