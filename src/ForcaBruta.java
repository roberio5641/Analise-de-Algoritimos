import java.util.Arrays;

public class ForcaBruta {
    static class Ordenacao2
    {
        void sort(int vet[])
        {
            int n = vet.length;

            for (int i = 0; i < n-1; i++)
            {
                int max = i;
                for (int j = i+1; j < n; j++)
                    if (vet[j] > vet[max])
                        max = j;

                System.out.println(Arrays.toString(vet));

                int temp = vet[max];
                vet[max] = vet[i];
                vet[i] = temp;


            }
        }


        void printarVetor2(int vet[])
        {
            int n = vet.length;
            for (int i=0; i<n; ++i)
                System.out.print(vet[i]+" ");
            System.out.println();
        }


        public static void main(String args[])
        {
            Ordenacao2 ob = new Ordenacao2();
            int vet[] = {1,2,3,4,5};

            System.out.println("Vetor Escrito");
            ob.printarVetor2(vet);

            ob.sort(vet);

            System.out.println("Vetor organizado");
            ob.printarVetor2(vet);
        }
    }


}
