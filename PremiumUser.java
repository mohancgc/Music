import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class PremiumUser extends User{
    Date    validityPeriod;
    PremiumUser(int id, String name, String username, String password, String role, Date validity)
    {
        super(id,name,username,password,role);
        this.validityPeriod=validity;
    }
	public String hearTrack(Track obj,Date date) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = LocalDate.of(validityPeriod.getYear(), validityPeriod.getMonth()+1, validityPeriod.getDate());
        Period period = Period.between(currentDate, newDate);
        if (period.getMonths() >-6) {
            return String.format("Please recharge your account");        
        }
        else
        {
            return String.format(obj.name+" is playing");
        }
	}
}
