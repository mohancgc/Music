import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class User {
    int id;
    String name;
	String username;
	String password;
	String role;
	public User(int id, String name, String username, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    public String hearTrack(Track obj,Date date)
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDate());
        Period period = Period.between(currentDate, newDate);
        if (period.getMonths() > -6) {
            return String.format("please subscribe");        
        }
        else
        {
            return String.format(obj.name+" is playing");
        }
    }
}
