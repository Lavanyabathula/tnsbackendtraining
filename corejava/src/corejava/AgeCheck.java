package corejava;

public class AgeCheck {

	public static void validateAge(int age)throws MyException{
		
		
		if(age<0&&age<18) {
			throw new MyException("Invalid age");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	
	public static void main(String args[])  {
		
			try {
				AgeCheck.validateAge(14);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}
	
}
