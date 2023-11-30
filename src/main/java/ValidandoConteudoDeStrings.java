public class ValidandoConteudoDeStrings {

    public static void main(String[] args) {

        String nome1 = "João";
        String nome2 = new String("JOÃO");
        String nome3 = "  ";

        System.out.println(nome1.equalsIgnoreCase(nome2));
        System.out.println(nome3.isEmpty());
        System.out.println(nome3.isBlank());
        System.out.println(nome1.startsWith("J"));
        System.out.println(nome2.endsWith("a"));
        System.out.println(nome1.contains("oã"));
    }
}
