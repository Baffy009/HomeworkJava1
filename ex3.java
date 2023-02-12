/*
Реализовать простой калькулятор (операции + - / * )*/

import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
    double num1;
    double num2;
    double res;
    char oper;
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите два числа через пробел: ");
    num1 = scan.nextDouble();
    num2 = scan.nextDouble();
    System.out.println("Выберите оператор(+, -, *, /): ");
    oper = scan.next().charAt(0);
    switch(oper) {
        case '+': res = num1 + num2;
            break;
        case '-': res = num1 - num2;
            break;
        case '*': res = num1 * num2;
            break;
        case '/': res = num1 / num2;
            break;
        default: System.out.println("Введите оператор(+, -, *, /): ");
            return;
        
    } 
    scan.close();
    System.out.println("Результат равен " + res);
}
    
}

