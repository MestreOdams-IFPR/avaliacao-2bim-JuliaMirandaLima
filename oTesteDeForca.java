import java.util.Scanner;

public class oTesteDeForca {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (teclado.hasNext()) {
            int qtdParticipantes = teclado.nextInt();
            int notasMax = teclado.nextInt();
            int[] vetNotas = new int[qtdParticipantes];
            vetNotas = lerVetor(vetNotas);
            int tamanho = vetNotas.length;
            vetNotas = mergeSortRecursivo(vetNotas, 0, tamanho);
            int resultado = somarNotas(vetNotas, notasMax);
            System.out.println(resultado);
        }

    }

    public static int[] lerVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = teclado.nextInt();

        }
        return v;

    }

    public static int somarNotas(int[] v, int n) {
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += v[i];

        }
        return soma;

    }

    public static void imprimirVet(int[] vet, int notas) {
        for (int i = 0; i < notas; i++) {
            System.out.print(vet[i] + "   ");
        }
        System.out.println();
    }

    public static int[] mergeSortRecursivo(int[] vet, int inicio, int fim) {
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mergeSortRecursivo(vet, inicio, meio);
            mergeSortRecursivo(vet, meio, fim);
            mergeSort(vet, inicio, meio, fim);
        }
        return vet;
    }

    public static void mergeSort(int[] vet, int inicio, int meio, int fim) {
        int i = inicio;
        int j = meio;
        int k = 0;
        int[] vetAuxiliar = new int[fim - inicio];

        while (i < meio && j < fim) {
            if (vet[i] >= vet[j]) {
                vetAuxiliar[k++] = vet[i++];
            } else {
                vetAuxiliar[k++] = vet[j++];
            }

        }

        while (i < meio) {
            vetAuxiliar[k++] = vet[i++];

        }

        while (j < fim) {
            vetAuxiliar[k++] = vet[j++];
        }

        for (i = inicio, k = 0; i < fim; i++, k++) {
            vet[i] = vetAuxiliar[k];
        }
    }

    public static void swap(int[] vet, int i, int j) {
        int temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;

    }
}
