import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500;
        int operacao;
        while (true){
            System.out.printf("""
                    ********************************************
                    Dados Do Cliente:
                    
                    Nome: João Muito Pobre Da Silva
                    Tipo de Conta: Corrente
                    Saldo Inicial: R$%.2f
                    ********************************************
                    
                    Operações
                    
                    1 - Consultar Saldos
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digite a opção desejada: 
                    """,saldo);
            }
        }
    }
}