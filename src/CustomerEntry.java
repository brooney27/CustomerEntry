import java.util.Scanner;

public class CustomerEntry {
	public static void main(String[] args){
		
		int custNum;
		String custName;
		double salesAmt;
		String taxCode;
	
		Scanner in = new Scanner(System.in);
	
		//read in parameters
		System.out.println("Enter customer number: ");
		custNum = in.nextInt();
		in.nextLine();
		
		System.out.println("Enter customer name: ");
		custName = in.next();
		in.nextLine();
	
		System.out.println("Enter Sales Amount: ");
		salesAmt = in.nextDouble();
		in.nextLine();
	
		System.out.println("Enter Tax Code: ");
		taxCode = in.next();
		
		in.close();
		
		if(taxCode.equals("NRM"))salesAmt = salesAmt * 1.06;
		else if(taxCode.equals("BIZ"))salesAmt = salesAmt * 1.045;
		
		
		System.out.println("Amount due: " + salesAmt);
	}
}
