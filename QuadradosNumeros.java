/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadradosnumeros;
import java.util.Scanner;
/**
 *
 * @author MIKE
 */
public class QuadradosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i + "² = " + (i * i));
  }
 }
}