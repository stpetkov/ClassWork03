import java.util.Scanner;

public class CW02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number >=1 && number <=5){
			if(number%2==0){System.out.println("�����");}
			else {System.out.print("�������");}
		}
		else if(number >=6 && number <=15){
			if(number%3==0)System.out.println("���� �� �� 3 ��� �������");
			else System.out.print("�� �� ���� �� 3 ");}
			else if (number==0){System.out.print("����");
	}
			else if (number<0){System.out.print("�����������");
			}
			else { System.out.println("�����������");
}}}
