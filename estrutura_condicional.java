/*import java.util.Scanner;
public class estrutura_condicional {

public static void main(){

    Scanner sc = new Scanner(System.in);
    int hora;

    System.out.println("Quantas horas?: ");
    hora = sc.nextInt();

    if (hora < 12) {
        System.out.println("Bom-dia");
    } 
    else if (hora < 18){
        System.out.println("Boa-tarde");  
    }
    else {
        System.out.println("Boa-noite");
    }
    }
    sc.close();

   
}
}
*/


import java.util.Scanner;
public class estrutura_condicional{

public static void main (){

/*Exercício 1: Fazer um programa para ler um 
 número inteiro, e depois dizer se este número é negativo ou não.*/

    Scanner sc = new Scanner(System.in);
    int numero;

     System.out.println("Digite um número: ");
     numero = sc.nextInt();

     if (numero >= 0){
        System.out.println("Número Positivo!");
     } else {
        System.out.println("Número Negativo!");
     }

/*Exercício 2: Fazer um programa para ler um número inteiro 
e dizer se este número é par ou ímpar. */

     Scanner sc = new Scanner(System.in);
     int numero, par, impar;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é PAR!!");

        }
        else{
        System.out.println("O número é ÍMPAR!");
        }

/*Exercício 3: Leia 2 valores inteiros (A e B). Após, o programa 
deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos
entre si. Atenção: os números devem poder ser digitados
em ordem crescente ou decrescente. */

    Scanner sc = new Scanner(System.in);

    int a, b;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("São múltiplos!");
        }else{
            System.out.println("Não são múltiplos!");
        }


/*Exercício 4: Leia a hora inicial e a hora final de um jogo. A seguir calcule
a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas. */

    Scanner sc = new Scanner(System.in);
    
    int horainicial, horafinal, duracao;

      System.out.println("Digite a hora inicial: ");
      horainicial = sc.nextInt();

      System.out.println("Digite a hora final: ");
      horafinal = sc.nextInt();

      if (horainicial < horafinal){
          duracao = horafinal - horainicial;
      }
      else{
          duracao = 24 - horainicial + horafinal;
      }

      System.out.println("O jogo durou " + duracao + "hora(s)");





}
}
