/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somarnumeros;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class SomarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        System.out.print("Digite um número de 1 a 50: ");
        numero = scanner.nextInt();

        if (numero < 1 || numero > 50) {
            System.out.println("Número fora do limite. Por favor escolha um número entre 1 e 50.");
        } else {
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }

            System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        }
    }
}
