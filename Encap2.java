package encapsu;

class Amazon_progen
{
  private int otp= 1234;
  
  
  public int getOtp()
  {
	  return otp;
  }
  
  public void setOtp(int otp)
  {
	  this.otp=otp;
  }
}

public class Encap2 {

	public static void main(String[] args) {
		Amazon_progen a1= new Amazon_progen();
		a1.setOtp(1987);
		System.out.println(a1.getOtp());
		
		
		

	}

}
