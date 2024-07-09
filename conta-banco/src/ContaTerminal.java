import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {try         
        (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {            
                //solicitando os dados do usuario
                System.out.println("Por favor, digite o nome da Agência: ");
                String nomeAgencia = scanner.next();
                            
                System.out.println("Por favor, digite o número da Agência: ");
                int numeroAgencia = scanner.nextInt();

                System.out.println("Por favor, digite o seu Nome: ");
                String nomeCliente = scanner.next();

                System.out.println("Por favor, digite o seu Sobrenome: ");
                String sobrenomeCliente = scanner.next();            
                
                System.out.println("Por favor, digite seu Saldo");
                double saldo = scanner.nextDouble();
             
                //imprimindo os dados obtidos pelo usuario
                System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia +  ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");
            
        }
    }
}
