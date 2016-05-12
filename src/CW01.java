import java.util.Scanner;

public class CW01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if(number<0){
	if(number%2==0){
	System.out.println("Negative Even");
	}
	else
	{ System.out.println("Negative Odd");
	}
	}
else{
	if(number%2==0){
		System.out.println("Positive Even");
		}
		else
		{ System.out.println("Positive Odd");
		}
		}
}
	}


