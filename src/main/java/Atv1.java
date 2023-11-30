public class Atv1 {
    public static void main(String[] args) {

        String nome = "    Pedro da Silva da Costa de Oliveira   ";
        System.out.println(formatarNome(nome, "da", "de", "do"));
    }

    public static String formatarNome(String nome, String... preposicoesParaExclusao) {
        String nomeFormatado = nome.strip().toUpperCase();

        for(String prep : preposicoesParaExclusao) {
            nomeFormatado = nomeFormatado.replace(" " + prep.toUpperCase() + " ", " ");       }

        return nomeFormatado;
    }
}
