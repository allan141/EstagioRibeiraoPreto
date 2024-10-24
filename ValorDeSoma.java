public class ValorDeSoma {
        public static void main(String[] args) {
            int Indice = 12, Soma = 0, K = 1;

            while (K < Indice) {
                K = K + 1;
                Soma = Soma + K;
            }

            System.out.println(Soma);
        }
}
