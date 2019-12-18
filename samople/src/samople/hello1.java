package samople;

public class hello1 {
	public static void main(String[] args) 
	{
		
		String a[]=new String[2];
		int length=2;
		a[0]="2";
		a[1]="2";
		String b[]=new String[4];
		System.arraycopy(a,0,b, 0, length);
		a=b;
		a[2]="5";
				
		System.out.println(a.length);
		
		
	}

}
