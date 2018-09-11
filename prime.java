import java.util.Scanner;
class prime{
	public static void main(String[] args){
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		while(true){
		System.out.println("Enter Number:");
		int num=scan.nextInt();
		for(int i=2;i<num/2;i++){

			if(num%i==0)
				isPrime=false;
		}
		if(isPrime)
			System.out.print(num+" Is prime number \n");
		else
			System.out.print(num+" Is Not Prime number\n");

		isPrime=true;
		}

	}
}