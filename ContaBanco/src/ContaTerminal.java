import java.util.*;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------BEM-VINDO-----------");
        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Insira o número da agência: ");
        String agencia = sc.next();
        sc.nextLine(); // <- consumir o ENTER que sobrou
        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Insira o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("-----------DADOS DA CONTA-----------");
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero+" e seu saldo "+saldo+" já está disponível para saque");

        sc.close();
    }
}
