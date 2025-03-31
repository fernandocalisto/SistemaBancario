import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500;
        int operacao;

        System.out.printf("""
                ********************************************
                    Dados Do Cliente:
                    
                    Nome: João Muito Pobre Da Silva
                    Tipo de Conta: Corrente
                    Saldo: R$%.2f
                ********************************************
                
                """,saldo);


        while (true){
            System.out.printf("""
                    Operações
                    
                    1 - Consultar Saldos
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digite a opção desejada: 
                    """,saldo);

            operacao = leitura.nextInt();


            if (operacao == 1){
                System.out.printf("Saldo: R$%.2f%n",saldo);
            }
            else if (operacao == 2){
                System.out.print("Insira o valor a receber: ");
                saldo += leitura.nextDouble();
            }
            else if (operacao == 3){
                System.out.print("Insira o valor a transferir: ");
                saldo -= leitura.nextDouble();
            }
            else if (operacao == 4){
                System.out.println("Ok, Até a próxima!");
                break;
            }
            else{
                System.out.println("Operação Inválida!!!");
            }
        }
    }
}