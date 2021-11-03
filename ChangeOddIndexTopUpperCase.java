package week1.day2;

public class ChangeOddIndexTopUpperCase {

	public static void main(String[] args) {
		String str="Welcome";
		char[] chararray=str.toCharArray();
		for (int i = 0 ;i<chararray.length;i++)
			if(i%2!=0) {
				char UpperCase = Character.toUpperCase(chararray[i]);
						System.out.println(UpperCase);
				
			}
			else {
				System.out.println(chararray[i]);
			}


	}

}
