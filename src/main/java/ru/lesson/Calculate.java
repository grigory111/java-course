package  ru.lesson;


public class Calculate {
	
	private int result;
	
	public void add(int...params)
	{
		for(int param: params)
			result += param;
		
	}
	
	public int getResult()
	{
		return result;
	}
	
	public void clear()
	{
		result = 0;
	}
			

}
