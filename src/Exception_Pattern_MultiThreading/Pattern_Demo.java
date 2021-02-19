package Exception_Pattern_MultiThreading;

public class Pattern_Demo {

	public static void main(String[] args) {
		String ex="(0|91)?[6-9][0-9]{9}";
		String mail_ex="[a-z A-Z 0-9][a-z A-Z 0-9 . _]*@[a-z]+[.][a-z]+";
		
		String number="917795856145";
		String mail = "Pankajkit@gmail.mail";
		System.out.println(number.matches(ex));
		System.out.println(mail.matches(mail_ex));

	}

}
