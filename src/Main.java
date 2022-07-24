import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList();
        Conta contaCorrente1 = new ContaCorrente(25678,77771,1000);

        Conta contaCorrente2 = new ContaCorrente();
        contaCorrente2.setAgencia(25678);
        contaCorrente2.setNumero(11111);
        contaCorrente2.setSaldo(5000);

        Conta contaPoupanca1 = new ContaPoupanca(25678,22221,50);

        Cliente cliente1 = new Cliente("Juliana Mesquita","1582867700","21979931700","julianamariasousamesquita@id.uff.br","123456",contaCorrente1);
        Cliente cliente2 = new Cliente("Pollyana Ramos","2222867700","21999931700","pollyanaramos@live.com","654321",contaCorrente2);
        Cliente cliente3 = new Cliente("Carlos Afonso Bebe","111867700","41989931700","carlos-afonsinho-bebe@gmail.com","112233",contaPoupanca1);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Banco banco = new Banco("Santander","90.400.888/0001-42",clientes);

        System.out.println(banco);

        contaCorrente1.depositar(2000);
        contaCorrente2.transferir(1000,contaPoupanca1);
        contaPoupanca1.sacar(300);

        System.out.println(banco);
    }
}