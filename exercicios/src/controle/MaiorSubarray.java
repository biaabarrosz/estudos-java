package controle;
public class MaiorSubarray {
    public static void main(String[] args) {
        int[] array = {1, -3, 2, 1, -1, 6, -2, 4};
        int maiorSoma = encontrarMaiorSubarray(array);
        System.out.println("A maior soma do subarray é: " + maiorSoma);
    }

    public static int encontrarMaiorSubarray(int[] array) {
        int maxAtual = array[0];
        int maxGlobal = array[0];

        for (int i = 1; i < array.length; i++) {
            maxAtual = Math.max(array[i], maxAtual + array[i]);
            maxGlobal = Math.max(maxGlobal, maxAtual);
        }

        return maxGlobal;
    }
}
