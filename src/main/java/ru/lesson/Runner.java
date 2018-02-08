package  ru.lesson;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		String first, second;
		Scanner reader = new Scanner(System.in);
		try {
			Calculate calc = new Calculate();
			String exit = "no";
			while(!exit.equals("yes"))
			{
				System.out.println("Enter first arg...");
				first = reader.next();
				System.out.println("Enter second arg...");
				second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				System.out.println("Yes/No");
				exit = reader.next();
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		finally{
			reader.close();
		}
		

	}
	

}
