import java.util.Arrays;
import java.util.Arrays;

public class Aleatorio {
    static class Main {

        static void Ordenacao3(int vetor[]) {
            int size = vetor.length;

            for (int i = 0; i < size - 1; i++)

                for (int j = 0; j < size - i - 1; j++)


                    if (vetor[j] < vetor[j + 1]) {
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                        System.out.println(Arrays.toString(vetor));
                        System.out.println(Arrays.toString(vetor));
                    }


        }

        static void printarVetor3(int vet[])
        {
            int n = vet.length;
            for (int i = 0; i < n; ++i)
                System.out.print(vet[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };


        Main main = new Main();
        System.out.println("Vetor escrito");
        main.printarVetor3(data);

        Main.Ordenacao3(data);

        System.out.println("Vetor Ordenado");
        main.printarVetor3(data);
    }

}
