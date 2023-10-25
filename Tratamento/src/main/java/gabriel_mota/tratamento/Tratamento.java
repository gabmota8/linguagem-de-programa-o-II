/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gabriel_mota.tratamento;

/**
 *
 * @author gabmo
 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
       
public class Tratamento {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
            int numero = scanner.nextInt();
            
            if (numero <= 1) {
                System.out.println("O número deve ser maior que 1.");
            } else {
                boolean ehPrimo = verificarPrimo(numero);
                if (ehPrimo) {
                    System.out.println(numero + " é um número primo.");
                } else {
                    System.out.println(numero + " não é um número primo.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro positivo.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

    

