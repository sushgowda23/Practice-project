import java.util.Scanner;

public class Arthmaticcalculator {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("eneter two numbers");
		int firstnum=sc.nextInt();
		int secnum= sc.nextInt();
		System.out.println("Enter the operator ");
		char output=sc.next().charAt(0);
		double Ans=0;

		switch(output){
		case '+': Ans=firstnum+secnum;
		break;
		case '-':Ans=firstnum-secnum;
		break;
		case '*': Ans=firstnum*secnum;
		break;
		case '/':Ans=firstnum/secnum;
		break;
		}
		System.out.println("the answer is " +Ans);
	}
}