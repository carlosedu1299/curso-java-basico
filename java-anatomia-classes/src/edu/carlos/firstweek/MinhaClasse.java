package edu.carlos.firstweek;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Carlos";
        String segundoNome = "Eduardo";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        System.out.println("Olá turma, sejam bem-vindos");
    }

    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
