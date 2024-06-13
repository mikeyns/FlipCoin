import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        // Número de vezes que deseja repetir o experimento
        int numExperiments = 10;

        // Instanciando um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Repetindo o experimento várias vezes
        for (int i = 0; i < numExperiments; i++) {
            // Gerando um número aleatório entre 0 e 1
            double chance = random.nextDouble();

            // Verificando se o número aleatório é menor que 0.5
            if (chance < 0.5) {
                System.out.println("Resultado: Superior");
            } else {
                System.out.println("Resultado: Inferior");
            }
        }
    }
}
