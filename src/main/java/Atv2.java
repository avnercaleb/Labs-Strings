public class Atv2 {

    public static void main(String[] args) {
        int codigo = 123;
        System.out.println(formatarNumero(codigo));
    }

    public static String formatarNumero(int numero) {
        String numeroformatado = String.valueOf(numero);
        String zeros = "0";
        String complemento = zeros.repeat(10 - numeroformatado.length());

        if(numeroformatado.length() >= 10)
            return numeroformatado;

        return complemento + numeroformatado;
    }
}
