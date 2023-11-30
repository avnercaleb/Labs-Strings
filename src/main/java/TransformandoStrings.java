public class TransformandoStrings {

    public static void main(String[] args) {

        String nome = "Avner";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toLowerCase().replace('v', 'V'));

        //*********************************************************************//

        String nomeComEspaco = "           Avner               ";
        System.out.println(nomeComEspaco);
        System.out.println(nomeComEspaco.strip());

        //*********************************************************************//

       String nomeCompleto = "Avner Caleb Leite da Silva de Lima";
       System.out.println(nomeCompleto.replace('a', '@'));
       System.out.println(nomeCompleto.replace("da", " "));

        //*********************************************************************//

        System.out.println(nome.repeat(3));
    }
}
