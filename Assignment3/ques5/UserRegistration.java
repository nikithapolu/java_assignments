package Assignment3.ques5;
public class UserRegistration
{
	private String username;
    private String userCountry;

    public UserRegistration(String username,String userCountry) {
	this.setUsername(username);
	this.setUserCountry(userCountry);
    }
    
    public String getUsername() {
    	return username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getUserCountry() {
    	return userCountry;
    }

    public void setUserCountry(String userCountry) {
    	this.userCountry = userCountry;
    }
    

public void registerUser(UserRegistration user)throws InvalidCountryException
{
	try {
		if(user.getUserCountry()=="India") System.out.println("Registration done successfully");
		else throw new InvalidCountryException("User Outside India cannot be registered");
	}
	catch(Exception e)
	{
	throw new InvalidCountryException(e.getMessage());
	}
}
public static void main(String gg[]) 
{
	UserRegistration user=null;
	try
	{
	user=new UserRegistration("Aksata Pukle","India");
	user.registerUser(user);
	}
	catch(InvalidCountryException ice)
	{
		System.out.println(ice.getMessage());
	}
	System.out.println("Username : "+user.getUsername()+", Country : "+user.getUserCountry());
	}


}