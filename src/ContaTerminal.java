import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
            int numeroDaConta = scanner.nextInt();
        
        System.out.println("Digite sua Agência:");
            String agencia = scanner.next();

        System.out.println("Digite seu nome completo:"); 
            String nomeCompleto = scanner.next();   
            
        double saldo = 1200.55;
        
        System.out.println("Olá " + nomeCompleto + " Sua agencia é: " + agencia + ", o numero da conta é: " + numeroDaConta);
        System.out.println("Seu Saldo é: " + saldo);    
}

}
