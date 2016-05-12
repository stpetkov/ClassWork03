import java.util.Scanner;

public class CW02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number >=1 && number <=5){
			if(number%2==0){System.out.println("Четно");}
			else {System.out.print("Нечетно");}
		}
		else if(number >=6 && number <=15){
			if(number%3==0)System.out.println("Дели се на 3 без остатък");
			else System.out.print("Не се дели на 3 ");}
			else if (number==0){System.out.print("Нула");
	}
			else if (number<0){System.out.print("Отрицателно");
			}
			else { System.out.println("Положително");
}}}
