package week1.day1;

public class LearningObject {
	
char Brandname;
String isTouchScreen;
String MobileNumber;
 public void MakeCalls() {
 System.out.println("MakeCalls");
 }
    public void paymoney() {
     System.out.println("payingmoney");
    }
 public void viewGallery() {
 System.out.println("viewGallery") ;
 }
	// TODO Auto-generated method stub


	// TODO Auto-generated method stub


 
 public static void main(String[] args) {
		LearningObject apple=new LearningObject();
				apple.Brandname='A';
				apple.isTouchScreen="true";
				apple.MobileNumber="9853249";
				apple.MakeCalls();
				apple.paymoney();
				apple.viewGallery();
				System.out.println("apple.Brandname:"+ apple.Brandname);
				System.out.println("apple.isTouchScreen:"+ apple.isTouchScreen);
				System.out.println("apple.mobileNumber:"+ apple.MobileNumber);
				
	}
		// TODO Auto-generated method stub

	


 

	
}


