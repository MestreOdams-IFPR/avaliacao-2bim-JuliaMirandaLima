import java.util.Scanner;

public class aBuscaPelosCristaisKyber {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int caso = 1;

        while (true) {
            int qtdMarmores = teclado.nextInt();
            int qtdTestes = teclado.nextInt();

            if (qtdMarmores == 0 && qtdTestes == 0) {
                break;
            }

            int[] vetMarmores = new int[qtdMarmores];
            vetMarmores = lerVetor(vetMarmores);

            int[] vetTestes = new int[qtdTestes];
            vetTestes = lerVetor(vetTestes);
            int inicio = 0;
            int fim = vetMarmores.length;
            mergeSortRecursivo(vetMarmores, inicio, fim);

            System.out.println("CASE# " + caso + ":");
            verificarPosicaoMarmore(vetMarmores, vetTestes);

            caso++;
        }

    }

    public static void verificarPosicaoMarmore(int[] v, int[] vTestes) {
        int inf = 0;
        int sup = v.length;

        for (int i = 0; i < vTestes.length; i++) {
            int pos = buscaBinariaRec(v, inf, sup, vTestes[i]);
            if (pos == -1) {
                System.out.println(vTestes[i] + " not found");
            } else {
                System.out.println(vTestes[i] + " found at " + (pos + 1));
            }
        }
    }

    public static int buscaBinariaRec(int[] vet, int inf, int sup, int num) {
        int meio;

        if (inf <= sup) {
            meio = (inf + sup) / 2;
            if (num == vet[meio]) {
                return meio;
            } else if (num < vet[meio]) {
                return buscaBinariaRec(vet, inf, meio - 1, num);
            } else {
                return buscaBinariaRec(vet, meio +1, sup, num);
            }
        } else {
            return -1;
        }

    }

    public static int[] lerVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = teclado.nextInt();
        }
        return vet;
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

    public static void mergeSort(int[] v, int ini, int meio, int fim) {
        int i = ini;
        int j = meio;
        int k = 0;
        int[] vetAuxiliar = new int[fim - ini];

        while (i < meio && j < fim) {
            if (v[i] <= v[j]) {
                vetAuxiliar[k++] = v[i++];
            } else {
                vetAuxiliar[k++] = v[j++];
            }

        }

        while (i < meio) {
            vetAuxiliar[k++] = v[i++];

        }

        while (j < fim) {
            vetAuxiliar[k++] = v[j++];
        }

        for (i = ini, k = 0; i < fim; i++, k++) {
            v[i] = vetAuxiliar[k];
        }
    }
}
