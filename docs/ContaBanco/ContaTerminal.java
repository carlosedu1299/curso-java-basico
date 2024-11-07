import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta :");
        int Numero = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agencia: ");
        int Agencia = entrada.nextInt();
        entrada.nextLine();//limpando buffer para poder colocar nome com espaço
        System.out.println("Por favor, digite seu nome: ");
        String NomeCliente = entrada.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo = entrada.nextDouble();
        entrada.close();

        System.out.printf("Olá ".concat(NomeCliente)+" obrigado por criar uma conta em nosso banco, sua agência é: " +Agencia +" conta: "+Numero+" e seu saldo: "+saldo+" já está disponível para saque!");
    }
}
