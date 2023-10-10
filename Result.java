public class Result {
    public static void main(String[] args) {
        double resultado;
        Calculadora calc = new Calculadora();

        resultado = calc.soma(5,10);
        System.out.println("a="+resultado);

        resultado = calc.sub(5,10);
        System.out.println("b="+resultado);

        resultado = calc.multi(5,10);
        System.out.println("c="+resultado);

        resultado = calc.div(5,10);
        System.out.println("d="+resultado);

    }
}
