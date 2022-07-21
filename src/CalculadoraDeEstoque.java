public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        for (int i = 0; i < 35; i ++){
            soma += 59.90;
        }

        int numeroInteiro = (int) soma;

        System.out.println("O total do estoque eh: " + soma +
                            "\nEm inteiro ficaria: " + numeroInteiro);

        if (soma < 150) {
            System.out.println("Estoque baixo!");
        } else if (soma >= 2000){
            System.out.println("Estoque alto demais!");
        }else {
            System.out.println("Estoque OK.");
        }
    }
}
