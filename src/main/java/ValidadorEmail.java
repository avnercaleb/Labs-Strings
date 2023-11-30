import java.util.ArrayList;
import java.util.List;

public class ValidadorEmail {

    /*
    * nome não pode ser vazio
    * nome não aceita caracteres especiais
    * dominio não pode ser vazio
    * dominio não aceita '_'
    * dominio não aceita letras maiusculas
    * sufixo não pode ter digitos
    * sufixo não pode ter letras maiusculas
    * sufixo não aceita caracteres especiais
    * */

    public static boolean validar(String email) {

        if(validaEstrutura(email)) {
            String nome = email.substring(0, email.indexOf('@'));
            String sufixo = email.substring(email.lastIndexOf('.') + 1);
            String dominio = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

            if(validaNome(nome) && validaDominio(dominio) && validaSufixo(sufixo))
                return true;
        }

        return false;
    }

    public static boolean validaNome(String nome) {
        if(estaVazio(nome) || temCharEspecialNoNome(nome))
            return false;
        return true;
    }

    public static boolean validaDominio(String dominio) {
        if(estaVazio(dominio) || temCharEspecialNoDominio(dominio) || temLetraMaiuscula(dominio))
            return false;
        return true;
    }

    public static boolean validaSufixo(String sufixo) {
        if(estaVazio(sufixo) || temCharEspecialNoSufixo(sufixo) || temLetraMaiuscula(sufixo) || sufixo.length() < 2 || sufixo.length() > 3)
            return false;
        return true;
    }

    public static boolean estaVazio(String s) {
        String p = s.strip();
        if(p.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean temCharEspecialNoNome(String p) {
        for(int i = 0; i < p.length(); i++) {
            if(!Character.isLetterOrDigit(p.charAt(i))) {
                if(p.charAt(i) != '.' && p.charAt(i) != '_' && p.charAt(i) != '-'){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean temCharEspecialNoDominio(String p) {
        for(int i = 0; i < p.length(); i++) {
            if(!Character.isLetterOrDigit(p.charAt(i)))
                if(p.charAt(i) != '.' && p.charAt(i) != '-')
                    return true;
        }
        return false;
    }

    public static boolean temCharEspecialNoSufixo(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) || !Character.isLetter(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean temLetraMaiuscula(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean validaEstrutura(String email) {

        if(email.lastIndexOf('@') > email.lastIndexOf('.'))
            return false;

        if(email.isEmpty())
            return false;

        int countA = 0;
        int countP = 0;

        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                countA++;
            } else if (email.charAt(i) == '.') {
                countP++;
            }
        }

        return countA == 1 && countP >= 1;
    }
}
