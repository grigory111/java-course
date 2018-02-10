package  ru.lesson;


public class Calculate {
	
	private double result;


	/**
	 * Выполняем сложение
	 * @param params аргументы суммирования
	 * @throws MyException если не аргументов
	 */
	public void add(int...params) throws MyException {
		if (params.length == 0){
			throw new MyException("No arguments error");
		}
		else {
			for (int param : params)
				result += param;
		}
		
	}

	public void div(int first, int second)
	{
		if (second == 0 )
			throw new IllegalArgumentException("Argument should not be equal 0");
		else
			result = (double)first /  second;
	}

	/**
	 *
	 * @param params
	 */
    public void mult(int...params)
    {
        for(int param: params)
            result += param;

    }


    public double getResult()
	{
		return result;
	}
	
	public void clear()
	{
		result = 0;
	}
			

}
