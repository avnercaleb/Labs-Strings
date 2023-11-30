public class ExtraindoTrechosDeStrings {

    public static void main(String[] args) {

        String nome = "Avner Caleb de Lima";
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        String sobreNome = nome.substring(posicaoPrimeiroEspaco + 1);
        String segundoNome = sobreNome.substring(0, sobreNome.indexOf(" "));
        System.out.println("segundo nome: " + segundoNome);

        //******************************************************************************//

        String ultimoNome = nome.substring(nome.lastIndexOf(" ") + 1);
        System.out.println("ultimo nome: " + ultimoNome);
    }
}
