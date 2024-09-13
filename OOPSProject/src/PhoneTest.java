
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//by default any number is considered as integer
		
		Phone myPhone = new Phone();
		myPhone.dial();
		myPhone.dial("Reeta");
		
		//byte = -128 to 127 is the range
		byte interCommDial = 125; //max number
		myPhone.dial(interCommDial); //1234 is an int
		
		byte countryCode=91;
		myPhone.dial(countryCode, 9820443464L);
		
		myPhone.dial(88508181811L,countryCode);
	}

}
class Phone
{
	void dial() {
		System.out.println("dial() : Dialing....");
	}
	
	void dial(String name) {
		System.out.println("dial(String) : Dialing....to "+name);
	}
	
	void dial(byte interComm) {
		System.out.println("dial(byte) : Dialing....to "+interComm);
	}
	void dial(byte countryCode, long phoneNum) {
		System.out.println("dial(byte,long) : Dialing....to "+countryCode+" Phone : "+phoneNum);
	}
	void dial( long phoneNum,byte countryCode) {
		System.out.println("dial(long,byte) : Dialing....to "+countryCode+" Phone : "+phoneNum);
	}
	
}