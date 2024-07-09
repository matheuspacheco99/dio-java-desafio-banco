import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {try         
        (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {            
                //TODO: Conhecer e importar a classe Scanner.
            
                //Exibir as mensagens para o usuário.
                System.out.println("Por favor, digite o nome da Agência: ");

                //Obter pelo Scanner os valores digitados pelo terminal.
                String nomeAgencia = scanner.next();
                            
                System.out.println("Por favor, digite o número da Agência: ");
                int numeroAgencia = scanner.nextInt();

                System.out.println("Por favor, digite o seu Nome: ");
                String nomeCliente = scanner.next();

                System.out.println("Por favor, digite o seu Sobrenome: ");
                String sobrenomeCliente = scanner.next();            
                
                System.out.println("Por favor, digite seu Saldo");
                double saldo = scanner.nextDouble();
             
                //Exibir a mensagem da conta que foi criada.
                System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia +  ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");
            
        }
    }
}
