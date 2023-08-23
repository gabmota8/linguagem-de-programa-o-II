
Exercicio 1
public class Exercicios1 {

    public static void main(String[] args) {
        Exercicios1 exercicio = new Exercicios1();
        exercicio.exercicio1();


    }
    public void exercicio1(){
    int A = 10;
    int B = 20;
    int sup = A;
    System.out.printf("%nValor inicial da variavel A: %d%n%n",A);
    System.out.printf("%nValor inicial da variavel B: %d%n%n",B);

    A = B;
    B = sup;
    System.out.printf("%nValor final da variavel A: %d%n%n",A);
    System.out.printf("%nValor final da variavel B: %d%n%n",B);

    }
}

Exercicio 2 :

public class Exercicios2 {

    public static void main(String[] args) {
            Exercicios2 exercicio = new Exercicios2();
            
            exercicio.exercicio2a();
            exercicio.exercicio2b();
            exercicio.exercicio2c();
            exercicio.exercicio2d();
            exercicio.exercicio2e();
            exercicio.exercicio2f();
    }
    public void exercicio2a(){
        int A = 10;
        int B = 20;
        System.out.println("");
        System.out.println("Exercicio 2 (a)");
        System.out.println("");
        System.out.printf("Valor inicial variável b: %d %n", B);
        B = 5;
        System.out.printf("Valor final variável a: %d %nValor final vari\u00E1vel b: %d %n", A, B);

    }
    public void exercicio2b(){
        int A = 30;
        int B = 20;
        int C = A + B;
        System.out.println("");
        System.out.println("Exercicio 2 (b)");
        System.out.println("");
        System.out.printf("Valor inicial variável c: %d %n", C);
        B = 10;
        System.out.printf("Valor intermediário variável B: %d %nValor intermediário vari\u00E1vel C: %d %n", B, C);
        C = A + B;
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    }
    public void exercicio2c(){
        int A = 10;
        int B = 20;
        int C = A;
        B = C;
        A = B;
        System.out.println("");
        System.out.println("Exercicio 2 (c)");
        System.out.println("");
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    }
    public void exercicio2d(){
        System.out.println("");
        System.out.println("Exercicio 2 (d)");
        System.out.println("");
        int A = 10;
        int B = (A+1);
        A = (B+1);
        B = (A+1);
        System.out.printf("Valor intermediário variável A: %d %n", A);
        A = (B+1);
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %n", A, B);
    }
    public void exercicio2e(){
        System.out.println("");
        System.out.println("Exercicio 2 (e)");
        System.out.println("");
        int A = 10;
        int B = 5;
        int C = A + B;
        B = 20;
        C = 10;
        System.out.printf("Valor final variável A: %d %nValor final vari\u00E1vel B: %d %nValor final vari\u00E1vel C: %d %n", A, B, C);
    
    }
    public void exercicio2f(){
    System.out.println("");
    System.out.println("Exercicio 2 (f)");
    System.out.println("");
    int X = 1;
    int Y = 2;
    int Z = Y - X;
    System.out.printf("Valor intermediário variável Z: %d %n", Z);
    X = 5;
    Y = X + Z;
    System.out.printf("Valor final variável X: %d %nValor final vari\u00E1vel Y: %d %nValor final vari\u00E1vel Z: %d %n", X, Y, Z);
    
    }
}

Exercicio 3:

public class Exercicios3 {
    public static void main(String[] args) {
        Exercicios3 exercicio = new Exercicios3();
        
        exercicio.exercicio3();
       
    }
    public void exercicio3(){
        System.out.printf("%nExercicio 3%n%n");
        double Resultadoa1 = (4/2)+(2/4);
        double Resultadoa2 = 4/2+2/4;
        double Resultadob1 = 4/(2+2)/4;
        double Resultadob2 = 4/2+2/4;
        double Resultadoc1 = (4+2)*2-4;
        double Resultadoc2 = 4+2*2-4;
        System.out.printf("Valor calculo a: %b %nValor calculo b: %b %nValor calculo c: %b %n", Resultadoa1==Resultadoa2, Resultadob1==Resultadob2, Resultadoc1==Resultadoc2);
        }
    
}

Exercicio 4:

public class Exercicios4 {
    public static void main(String[] args) {
        Exercicios4 exercicio = new Exercicios4();
        
        exercicio.exercicio4();

    }
    public void exercicio4(){
        System.out.printf("%nExercicio 4%n%n");
        
            double A = (3+2)*6;
            System.out.println(A);  
            double B = 6*(3+2)+2;
            System.out.println(B);
            double C = 6*3+2/(2+4);
            System.out.println(C);
            double D = 8*(3+1)*2;
            System.out.println(D);
            double E = (3+16-2)/2*(9-2);
            System.out.println(E);
            double F = 6/3 + 8/2;
            System.out.println(F);
            double G = (3+8/2)*4 + 3*2;
            System.out.println(G);
            double H = 6*3*3+6-10;
            System.out.println(H);
            double I = (10*8+3)*9;
            System.out.println(I);
            double J = -12 * (-4) + 3 * (-4);
            System.out.println(J);
        }
    
}

Exercicio 5

import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args) {
        Exercicios5 exercicio = new Exercicios5();
        
        exercicio.exercicio5();
 
    }
        public void exercicio5(){
    Scanner sc = new Scanner (System.in);
    System.out.printf("%nExercicio 5%n%n");
    System.out.printf("Insira um número: %n");
    int variavel = sc.nextInt();
    System.out.printf("O antecessor do seu número é: %d %n%n",(variavel-1));
    sc.close();
    }

}

Exercicio 6

import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        Exercicios6 exercicio = new Exercicios6();
        exercicio.exercicio6();

    }
        public void exercicio6(){
    System.out.printf("%nExercicio 6%n%n");
    System.out.printf("Insira a base: %n");
    Scanner sc = new Scanner (System.in);
    double base;
    base = sc.nextDouble();
    System.out.printf("Insira a altura: %n");
    double varia = sc.nextDouble();
    double result = (base*varia);
    System.out.printf("A área do seu retângulo é: %.2f %n%n",(result));
    sc.close();

    }

}
exercicio 7

import java.util.Scanner;

public class Exercicios7 {
    public static void main(String[] args) {
        Exercicios7 exercicio = new Exercicios7();
        exercicio.exercicio7();

    }
    public void exercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua idade com ano(s), mes(es) e dia(s): ");
        System.out.print("Ano:");
        int ano = sc.nextInt();
        System.out.print("Mês:");
        int mes = sc.nextInt();
        System.out.print("Dias:");
        int dia = sc.nextInt();
        System.out.printf("%nSua idade em dias é: %d%n%n", (dia+(mes*30)+(ano*365)));
        sc.close();
    }
}

exercicio 8

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

exercicio 9
import java.util.Scanner;

public class Exercicios9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o salário atual: ");
        double atual = sc.nextDouble();
        System.out.println("Insira a porcentagem de reajuste: ");
        double porcentagem;
        porcentagem = sc.nextDouble();
        System.out.printf("%nSalário reajustado: %.2f %n%n", (atual+(atual*porcentagem/100)));
        sc.close();
    }
}

exercicio 10
import java.util.Scanner;
public class Exercicios10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o custo de fábrica do carro: ");
        Double inicial = sc.nextDouble();
        double distribuidor = inicial*0.28;
        double imposto = inicial*0.45;
        System.out.printf("O custo final do carro é de R$%.2f %n%n", (inicial+distribuidor+imposto));
        sc.close();
        }
}



[Testes de Mesa .xlsx](https://github.com/gabmota8/linguagem-de-programa-o-II/files/12413832/Testes.de.Mesa.xlsx)

