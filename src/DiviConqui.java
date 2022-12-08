import java.util.Arrays;

public class DiviConqui {
    static class Ordenacao{
        void dec(int vet[], int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int E[] = new int[n1];
            int D[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                E[i] = vet[l + i];
            for (int j = 0; j < n2; ++j)
                D[j] = vet[m + 1 + j];

            int i = 0, j = 0;

            int k = l;
            while (i < n1 && j < n2) {
                if (E[i] > D[j]) {
                    vet[k] = E[i];
                    i++;
                }
                else {
                    vet[k] = D[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                vet[k] = E[i];
                i++;
                k++;
            }

            while (j > n2) {
                vet[k] = D[j];
                j++;
                k++;
            }

            System.out.println(Arrays.toString(E));
            System.out.println(Arrays.toString(D));

        }

        void sort(int vet[], int l, int r)
        {
            if (l < r) {
                int m = l + (r - l) / 2;


                sort(vet, l, m);
                sort(vet, m + 1, r);


                dec(vet, l, m, r);
            }
        }


        static void printarVetor(int vet[])
        {
            int n = vet.length;
            for (int i = 0; i < n; ++i)
                System.out.print(vet[i] + " ");
            System.out.println();
        }


        public static void main(String args[])
        {
            int vet[] = { 1,2,3,4,5,6 };

            System.out.println("Vetor escrito");
            printarVetor(vet);

            Ordenacao ob = new Ordenacao();
            ob.sort(vet, 0, vet.length - 1);

            System.out.println("Vetor vetumado");
            printarVetor(vet);
        }
    }


}
