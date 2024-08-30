package encapsu;
class Amazon_prog
{
	private String username="cantact@gmail.com";
	private String password = "dell123";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
		
	}
	
	
	public void setPassword(String password) {
		this.password=password;
		
	}
	
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Amazon_prog a1= new Amazon_prog();
		a1.setUsername("nisarga@gmail.com");
		System.out.println(a1.getUsername());
		a1.setPassword("nisa2411");
		System.out.println(a1.getPassword());

	}

}
