import java.util.Scanner;

public class Exercicios8 {
    public static void main(String[] args) {
        Exercicios8 exercicio = new Exercicios8();
        exercicio.exercicio8();
    }
    public void exercicio8() {
    Scanner sc = new Scanner(System.in);
    char percent = '\u0025';
    System.out.println("Insira a quantidade de votos válidos:");
    double validos = sc.nextDouble();
    System.out.println("Insira a quantidade de votos nulos:");
    double nulo = sc.nextDouble();
    System.out.println("Insira a quantidade de votos brancos:");
    double branco = sc.nextDouble();
    double total = validos+nulo+branco;
    System.out.printf("%n%nA porcentagem de votos válidos é de %.2f%c %nA porcentagem de votos nulos é de %.2f%c %nA porcentagem de votos brancos foi de %.2f%c %n%n", (validos/total*100), percent, (nulo/total*100), percent,(branco/total*100), percent);
    sc.close();
}

}
