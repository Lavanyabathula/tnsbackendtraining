//Demo for data types
public class DemoDatatypes {

	public static void main(String[] args) {

		//-127 to 128
		byte a=127;
		
		short s=16785;
		
		//type casting 
		//lower to higher (short,int,float,double) -- Implicit type casting
		short num=20;
		int num1=num;
		System.out.println(num1);
		
		
		//explicit type casting(double-float-int-short) higher to lower
		int x=1089;
		short y=(short)x;
		System.out.println(y);

		
	}

}
