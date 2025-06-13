import java.util.Scanner;

class Underage extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Your are Under 18 Please wait for the correct Age!!!";
	}
	
}
class Overage extends Exception{

	@Override
	public String getMessage() {
		return "You are Overage!!! Go and take rest in the room.";
	}
	
	
}
class Rto{
	int age=18;
	int cAge;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age:");
		cAge=scan.nextInt();
	}
	void verifyAge() throws Exception{
		if(age==cAge) {
			System.out.println("Driving License Issued");
		}
		else if(cAge<18) {
			Underage ua=new Underage();
			System.out.println(ua.getMessage());
			throw ua;	
		}
		else if(cAge>64) {
			Overage oa=new Overage();
			System.out.println(oa.getMessage());
			throw oa;
		}
	}
}
class StateGovernment{
	void start() {
		Rto r= new Rto();
		try {
			r.acceptInput();
			r.verifyAge();
		}
		catch(Exception e){
			try {
				r.acceptInput();
				r.verifyAge();
			}
			catch(Exception g) {
				try {
					r.acceptInput();
					r.verifyAge();
				}
				catch (Exception h) {
					System.out.println(" RTO officer:You are Irrating me get Lost!!!");
				}
			}
		}
	}
}
public class CentralGovernment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateGovernment sg= new StateGovernment();
		sg.start();

	}

}
