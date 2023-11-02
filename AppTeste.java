public class AppTeste {
    public static void main(String[] args) {
        Empresa dados = new Empresa("elber", "silva", -10);


        System.out.println("nome:" +dados.getNome());
        System.out.println("sobrenome:" +dados.getSobrenome());;
        System.out.println("salario anual:" +dados.getSalarioanual());

        Empresa f2 = new Empresa("elber", "silva", -10);


        System.out.println("nome:" +f2.getNome());
        System.out.println("sobrenome:" +f2.getSobrenome());
        System.out.println("salario:" +f2.getSalario());
        System.out.println("salario anual:" +f2.getSalarioanual());
    }





}
