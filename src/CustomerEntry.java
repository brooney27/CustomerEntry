import java.util.Scanner;

public class CustomerEntry {
	public static void main(String[] args){
		
		int custNum;
		String custName;
		double salesAmt = 0;
		String taxCode = "";
		
		boolean valid = false;
	
		//read in parameters
		while(!valid){
			System.out.println("Enter customer number: ");
			try{
				custNum = getInt();
				valid = true;
			}catch(Exception e){
				System.out.println("Invalid number, try again");
			}
		}
		valid = false;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter customer name: ");
		custName = in.nextLine();
		in.close();
	
		while(!valid){
			System.out.println("Enter sales amount: ");
			try{
				salesAmt = getDouble();
				valid = true;
			}catch(Exception e){
				System.out.println("Invalid number, try again");
			}
		}
		valid = false;
	
		System.out.println("Enter Tax Code: ");
		while(!valid){
			try{
				taxCode = getTaxCode();
				valid = true;
			}catch (Exception e){
				System.out.println("Invalid tax code, try again");
			}
		}
		if(taxCode.equals("NRM"))salesAmt = salesAmt * 1.06;
		else if(taxCode.equals("BIZ"))salesAmt = salesAmt * 1.045;
		
		
		System.out.println("Amount due: " + salesAmt);
	}
	
	public static int getInt() throws Exception{
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public static double getDouble() throws Exception{
		Scanner in = new Scanner(System.in);
		return in.nextDouble();
	}
	
	public static String getTaxCode() throws Exception{
		Scanner in = new Scanner(System.in);
		String code = in.next();
		if(code.equals("NRM")||code.equals("BIZ")||code.equals("EXE"))return code;
		throw new Exception();
	}
}
