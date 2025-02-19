import java.util.Scanner;
class AsciiFactor 
{
	public static void main(String[] args) 
	{
		char a = (char)5;
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the character");
	 char ch = sc.next().charAt(0);
	 int ascii = ch;
	if(ascii%100==0&&ascii%90==0)
		{
		System.out.println("Given Ascii Common Factor 100 and 90");
		 
	}
	else
	{
		System.out.println("Given Ascii Common Factor is not 100 and 90");
	} 
   }

}

