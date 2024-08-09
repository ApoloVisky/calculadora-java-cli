import adicao.Resultado;

import java.util.Scanner;


public class Main  {
    public static void main(String[] args) {

        Integer resultado = null;

        int num1;
        int num2;
        String operacao;
        String aritmetica = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite a operação que deseja: ");
         operacao = scanner.next();

        System.out.print("Digite o segundo número: ");
        num2 =  scanner.nextInt();

        scanner.close();


        if (operacao.equals("+")){
            aritmetica = "soma";
          resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            aritmetica = "subtração";
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            aritmetica = "multiplicação";
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            aritmetica = "divisão";
            resultado = num1 / num2;
        }else {
            System.out.println("Operação inválida");
        }

        System.out.println("O resultado da "+aritmetica+" é: "+resultado);


    }
    }