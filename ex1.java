/**
 Вычислить n-ое треугольного число(сумма чисел от 1 до n),
  n! (произведение чисел от 1 до n)
 */
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        System.out.print("Введите число : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
        int snum = 1;
        int fakt = 1;
        for (int i = 2; i <= num; i++){
            snum += i;
            fakt *=i;  
            }    
         
        System.out.println ("Введенное число " + num);
        System.out.println ("n-ое треугольного число = " + snum);
        System.out.println ("факториал = " + fakt);
    }
    
}